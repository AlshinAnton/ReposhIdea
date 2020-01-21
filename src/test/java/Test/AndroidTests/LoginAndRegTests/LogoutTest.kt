package Test.AndroidTests.LoginAndRegTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User

import org.junit.jupiter.api.Test

class LogoutTest : BaseTestClass() {

    @Test
    fun logoutTest() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User9())
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        profilePageInterface.waitTooltip()
        profilePageInterface.closeTooltip()
        profilePageInterface.waitSettings()
        profilePageInterface.clickSettings()
        settingsInterface.swipeToLogOut()
        onboardingInterface.waitThenCloseOnBoardingPage()
    }
}
