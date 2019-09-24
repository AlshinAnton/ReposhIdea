package Test.Checkout

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.Test

class BuyProductWithRussianPost : BaseTestClass() {
    @Test
    fun buyProductWithRussianPostDelivery() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User7())
        tapeInterface.closeTooltips()
        tapeInterface.clickSearchIcon()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setDeliveryQueryText()
        searchPageInterface.chooseRussianPost()
        searchPageInterface.chooseFirstItem()
        productCardInterface.waitAndClickBuyBtn()

        checkoutInterface.chooseRussainPost()
        checkoutInterface.choosePostamatAddress()

        checkoutInterface.swipetoClickPayBtn()
        checkoutInterface.clickPayBtn()
        checkoutPaymentInterface.waitPaymentScreen()
        checkoutPaymentInterface.setCardData()
        checkoutPaymentInterface.swipeToPayBtn()
        checkoutPaymentInterface.clickPayBtn()
        checkoutPaymentConfirmationInterface.clickContinueShoppingBtn()
        tapeInterface.clickSearchIcon()
    }
}