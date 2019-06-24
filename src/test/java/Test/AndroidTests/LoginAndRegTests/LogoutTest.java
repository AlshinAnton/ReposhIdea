package Test.AndroidTests.LoginAndRegTests;

import AppiumSupport.BaseTestClass;

import org.junit.Test;

public class LogoutTest extends BaseTestClass {

    @Test
    public void logoutTest() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.loginAsTester9();
        tapeInterface.closeTooltips();
        bottomToolbarInterface.clickProfile();
        profilePageInterface.waitTooltip();
        profilePageInterface.closeTooltip();
        profilePageInterface.waitSettings();
        profilePageInterface.clickSettings();
        settingsInterface.swipeToLogOut();
        onboardingInterface.waitThenCloseOnBoardingPage();
    }
}
