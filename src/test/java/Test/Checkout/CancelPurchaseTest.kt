package Test.Checkout

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.Test

class CancelPurchaseTest : BaseTestClass() {

    @Test
    fun cancelPurchaseBySellerTest() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User9())
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()

        // Доделать надо
    }
}