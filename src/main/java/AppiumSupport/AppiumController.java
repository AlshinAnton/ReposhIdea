package AppiumSupport;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumController {

    private String pathToAndroidAPK = "/Users/Anton/Desktop/Android/installed/build/outputs/apk/debug/Reposh-debug-1.0.1.apk";
    //private String pathToIOSApp = "/Users/Anton/Library/Developer/Xcode/DerivedData/reposh-ghztocakrnkemcamrssxndllxytz/Build/Products/Debug-iphoneos/mamsy360.app";
    private String pathToIOSIpa = "/Users/Anton/Desktop/reposhAutoSign/mamsy360.ipa";

    private final String PACKAGEAPP = "com.reposh.dev";
    private final String ACTIVITYAPP = "com.reposh.presentation.ui.activity.MainActivity";
    private final String WAITACTIVITYAPP = "com.reposh.feature.auth.ui.activity.OnboardingActivity";


    public static OS executionOS = OS.ANDROID_1_PLUS_5T;
    public static AppiumController instance = new AppiumController();
    public AppiumDriver driver;
    //Device currentDevice;

    public enum OS {
        ANDROID,
        ANDROID_1_PLUS_6,
        ANDROID_1_PLUS_5T,
        IOS_IPHONE_6_PLUS_SIMULATOR,
        IOS_IPHONE_6_PLUS,
        IOS_IPHONE_6S_KONSTANTIN,
        IOS_IPHONE_5S,
        ANDROID_NEXUS,
        ANDROID_XIAOMI,
        ANDROID_GALAXY_S8,
        IOS_IPHONE_XR
    }

    void start() throws MalformedURLException {
        /*DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ALL);
        try {
            for (int i = 0; i < deviceInfo.getDevices().size(); i++) {
                currentDevice = deviceInfo.getDevices().get(i);
                System.out.println("device #" + i + "\n"
                        + " udid = " + currentDevice.getUniqueDeviceID()
                        + "\n Version = " + currentDevice.getProductVersion()
                        + "\n OSVersion = " + currentDevice.getDeviceProductName()
                        + "\n Build version = " + currentDevice.getBuildVersion()
                        + "\n Model Number = " + currentDevice.getModelNumber()
                        + "\n Serial Number = " + currentDevice.getSerialNumber()
                        + "\n");
                executionOS = currentDevice.getDeviceProductName().equals("Android") ? OS.ANDROID : OS.IOS_IPHONE_6_PLUS_SIMULATOR;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        if (driver != null) {
            System.out.println("Драйвер не обнулился");
            return;
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();
        switch (executionOS) {
            case ANDROID:
                // assert currentDevice != null;
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"/*currentDevice.getDeviceProductName()*/);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1"/*currentDevice.getProductVersion()*/);
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "1003fcb5"/*currentDevice.getUniqueDeviceID()*/);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.APP, pathToAndroidAPK);
                capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, PACKAGEAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ACTIVITYAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, WAITACTIVITYAPP);
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case ANDROID_1_PLUS_5T:
                // assert currentDevice != null;
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"/*currentDevice.getDeviceProductName()*/);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"/*currentDevice.getProductVersion()*/);
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "95a4dfae"/*currentDevice.getUniqueDeviceID()*/);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
                capabilities.setCapability(MobileCapabilityType.APP, pathToAndroidAPK);
                capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, PACKAGEAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ACTIVITYAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, WAITACTIVITYAPP);
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case ANDROID_1_PLUS_6:
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"/*currentDevice.getDeviceProductName()*/);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0.2"/*currentDevice.getProductVersion()*/);
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "22ab8278"/*currentDevice.getUniqueDeviceID()*/);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
                capabilities.setCapability(MobileCapabilityType.APP, pathToAndroidAPK);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, PACKAGEAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ACTIVITYAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, WAITACTIVITYAPP);
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case ANDROID_NEXUS:
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"/*currentDevice.getDeviceProductName()*/);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1"/*currentDevice.getProductVersion()*/);
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "02618a42b8924a2b"/*currentDevice.getUniqueDeviceID()*/);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.APP, pathToAndroidAPK);
                capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, PACKAGEAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ACTIVITYAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, WAITACTIVITYAPP);
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case ANDROID_XIAOMI:
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "33868b7");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.APP, pathToAndroidAPK);
                capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, PACKAGEAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ACTIVITYAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, WAITACTIVITYAPP);
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case ANDROID_GALAXY_S8:
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "988a164843584b344b");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.APP, pathToAndroidAPK);
                capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, PACKAGEAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ACTIVITYAPP);
                capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, WAITACTIVITYAPP);
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;

            case IOS_IPHONE_XR:
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
                capabilities.setCapability(MobileCapabilityType.UDID, "00008020-0008583E3CBA002E");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XR");
                capabilities.setCapability("xcodeSigningId", "iPhone Developer");
                capabilities.setCapability("xcodeOrgId", "6P5Q34RWAU");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
                capabilities.setCapability(MobileCapabilityType.APP, pathToIOSIpa);
                capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS,true);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.switchTo().alert().accept();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case IOS_IPHONE_6_PLUS_SIMULATOR:
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
                capabilities.setCapability(MobileCapabilityType.APP, pathToIOSIpa);
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s Plus");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.switchTo().alert().accept();
                break;

            case IOS_IPHONE_6_PLUS:
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
                capabilities.setCapability(MobileCapabilityType.UDID, "5b7992f7a17209910afaa714f374398721f8db9d");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6 Plus");
                capabilities.setCapability("xcodeSigningId", "iPhone Developer");
                capabilities.setCapability("xcodeOrgId", "6P5Q34RWAU");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
                capabilities.setCapability(MobileCapabilityType.APP, pathToIOSIpa);
                capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS,true);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.switchTo().alert().accept();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case IOS_IPHONE_6S_KONSTANTIN:
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.1");
                capabilities.setCapability(MobileCapabilityType.UDID, "9361adc7765acc867f24798469a567ba99ce64f7");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s");
                capabilities.setCapability("xcodeSigningId", "iPhone Developer");
                capabilities.setCapability("xcodeOrgId", "6P5Q34RWAU");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.APP, pathToIOSIpa);
                capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS,true);
                capabilities.setCapability("simpleIsVisibleCheck", false);
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.switchTo().alert().accept();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case IOS_IPHONE_5S:
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0.1");
                capabilities.setCapability(MobileCapabilityType.UDID, "ccbfb14ed325bb0a643c5799bea2b72840a4e2ba");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 5s");
                capabilities.setCapability("xcodeSigningId", "iPhone Developer");
                capabilities.setCapability("xcodeOrgId", "6P5Q34RWAU");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.APP, pathToIOSIpa);
                //capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
                capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS,true);
                capabilities.setCapability("simpleIsVisibleCheck", false);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.switchTo().alert().accept();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}