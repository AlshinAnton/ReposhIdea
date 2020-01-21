package Test.Checkout

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.jupiter.api.Test

class BuyProductWithDpdPostamat : BaseTestClass() {

    @Test
    fun buyProductWithPostamatDelivery() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User7())
        tapeInterface.closeTooltips()
        tapeInterface.clickSearchIcon()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setDeliveryQueryText()
        searchPageInterface.choosePostamatQuery()
        searchPageInterface.chooseFirstItem()
        productCardInterface.waitAndClickBuyBtn()

        checkoutInterface.choosePostamat()
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






    /*@Test
    fun bueProductWithDpdPostamatTest() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = true,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = true,
                useSize = true,
                useBrand = true,
                useCondition = false,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = false,
                sizeTemplate = SizeTemplate(oneSize = true),
                deliveryTemplate = DeliveryTemplate(dpdCourier = true)
        )
        addProductByTemplate(createProductTemplate)
        publish()

    }




    private fun publish() {
        addProductInterface.clickPublish()
        addProductOrDraftConfirmationInterface.clickMoveToMyProductsOrDrafts()
        myProductsInterface.setInitialProductName(addProductInterface.productName)
        myProductsInterface.searchAddedProductInMyProducts()
        productCardInterface.waitId()
        productCardInterface.getInitialProductID()
        productCardInterface.waitMessageOnModeration()
    }*/
