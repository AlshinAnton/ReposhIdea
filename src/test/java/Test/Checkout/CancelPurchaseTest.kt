package Test.Checkout

import AppiumSupport.BaseTestClass
import org.junit.Test

class CancelPurchaseTest : BaseTestClass() {

    @Test
    fun cancelPurchaseBySellerTest() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
    }
}