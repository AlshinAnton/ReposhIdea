package Test.Checkout

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.Test

class BuyProductWithDpdCourier : BaseTestClass() {

    @Test
    fun buyProductWithCourierDelivery() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User7())
        tapeInterface.closeTooltips()
        tapeInterface.clickSearchIcon()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setDeliveryQueryText()
        searchPageInterface.choseDpdCourierQuery()
        searchPageInterface.chooseFirstItem()
        productCardInterface.waitAndClickBuyBtn()

        checkoutInterface.chooseCourier()
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


