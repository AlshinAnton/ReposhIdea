package Test.AndroidTests.ProfileTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.jupiter.api.Test

class CheckSubscribersAndSubscriptionsTest : BaseTestClass() {

    @Test
    fun clickBySubscripersTest() {
        goToProfile()
        profilePageInterface.waitSubscribersField()
        profilePageInterface.clickSubscribersField()
    }

    @Test
    fun clickBySubscriptions() {
        goToProfile()
        profilePageInterface.waitSubscriptionsField()
        profilePageInterface.clickSubscriptionsField()


    }

    fun goToProfile() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User1())
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        profilePageInterface.waitTooltip()
        profilePageInterface.closeTooltip()
    }
}