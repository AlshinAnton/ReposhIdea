package Test.AndroidTests.LoginAndRegTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User

import org.junit.Before

import org.junit.Test

class Login_test : BaseTestClass() {



    @Test
    fun correctLoginTest() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User1())
        tapeInterface.closeTooltips()

    }

    @Test
    fun incorrectPhoneNumber() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.enterIncorrectPhoneNumber()
        loginInterface.clickReceiveCodeBtn()
        loginInterface.waitErrorPhoneFormat()
        loginInterface.assertErrorPhoneFormat()
    }

    @Test
    fun incorrectCode() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.enterPhoneNumber("9999999999")
        loginInterface.clickReceiveCodeBtn()
        loginInterface.waitCodeScreen()
        loginInterface.enterIncorrectCode()
        loginInterface.clickConfirmCodeBtn()
        loginInterface.waitErrorCode()
        loginInterface.assertErrorCode()
    }
}