package Test.AndroidTests.LoginAndRegTests;

import AppiumSupport.BaseTestClass;

import org.junit.Test;

public class Login_test extends BaseTestClass {

    @Test
    public void correctLoginTest() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.loginAsTester9();
        tapeInterface.closeTooltips();

    }

    @Test
    public void incorrectPhoneNumber() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.enterIncorrectPhoneNumber();
        loginInterface.clickReceiveCodeBtn();
        loginInterface.waitErrorPhoneFormat();
        loginInterface.assertErrorPhoneFormat();
    }

    @Test
    public void incorrectCode() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.enterPhoneNumber("9999999999");
        loginInterface.clickReceiveCodeBtn();
        loginInterface.waitCodeScreen();
        loginInterface.enterIncorrectCode();
        loginInterface.clickConfirmCodeBtn();
        loginInterface.waitErrorCode();
        loginInterface.assertErrorCode();
    }
}