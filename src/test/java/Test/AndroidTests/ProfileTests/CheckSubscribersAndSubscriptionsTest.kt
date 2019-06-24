package Test.AndroidTests.ProfileTests

import AppiumSupport.BaseTestClass
import org.junit.Test

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
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        profilePageInterface.waitTooltip()
        profilePageInterface.closeTooltip()
    }
}