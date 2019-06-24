#!/usr/bin/env bash


:: Settings - Paths
SET projectpath=/Users/Anton/Desktop/AutoTestsReposh
SET apkpath=/Users/Anton/Desktop/Android/installed/build/outputs/apk/debug/Reposh-debug-1.0.1.apk
SET adbpath=/Users/Anton/Library/Android/sdk/platform-tools/adb

:: Settings - Tests
SET testClass=com.example.anton.autotestsreposh.Test.AndroidTests.AddDeletePublishProductTests#publishProductWithDPDCourier
SET test2Class=com.example.anton.autotestsreposh.Test.AndroidTests.AddDeletePublishProductTests#publishProductWithDPDCourier

:: Run "adb devices -l" to get the list of connected devices
SET device1=95a4dfae
SET device2=1003fcb5

:: Executing tasks: [:app:assembleSafechatsV21Debug, :app:assembleSafechatsV21DebugAndroidTest]

:: Step 1: Build -> Build APK
call %projectpath%\./gradlew assembleDebug

:: Step 2: Run test on a device to generate the test APK
::call %projectpath%\gradlew assembleSafechatsV21DebugAndroidTest

:: Running tests

:: Device 1
%projectpath%\ -s %device1% ./gradlew uninstallDebug
::%adbpath%adb -s %device1% shell pm uninstall "com.safechats.safechats.test"

%adbpath%adb -s %device1% push %apkpath%\
::%adbpath%adb -s %device1% shell pm install -r "/data/local/tmp/com.safechats.safechats"

%adbpath%adb -s %device1% push %apkpath%\app-safechats-v21-debug-androidTest.apk /data/local/tmp/com.safechats.safechats.test
%adbpath%adb -s %device1% shell pm install -r "/data/local/tmp/com.safechats.safechats.test"

:: Device 2
%adbpath%adb -s %device2% shell pm uninstall "com.safechats.safechats"
%adbpath%adb -s %device2% shell pm uninstall "com.safechats.safechats.test"

%adbpath%adb -s %device2% push %apkpath%\app-safechats-v21-armeabi-v7a-debug.apk /data/local/tmp/com.safechats.safechats
%adbpath%adb -s %device2% shell pm install -r "/data/local/tmp/com.safechats.safechats"

%adbpath%adb -s %device2% push %apkpath%\app-safechats-v21-debug-androidTest.apk /data/local/tmp/com.safechats.safechats.test
%adbpath%adb -s %device2% shell pm install -r "/data/local/tmp/com.safechats.safechats.test"

:: Run tests
start /b %adbpath%adb -s %device1% shell am instrument -w -r -e debug false -e class %testClass% com.example.anton.autotestsreposh.Test.AndroidTests.AddDeletePublishProductTests#publishProductWithDPDCourier
start /b %adbpath%adb -s %device2% shell am instrument -w -r -e debug false -e class %test2Class% com.safechats.safechats.test/android.support.test.runner.AndroidJUnitRunner