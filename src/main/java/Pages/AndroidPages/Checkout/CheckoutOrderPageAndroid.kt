package Pages.AndroidPages.Checkout

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.CheckoutOrderInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

class CheckoutOrderPageAndroid(driver: AppiumDriver<*>) : AndroidBaseClass(driver), CheckoutOrderInterface {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    val titleID = "com.reposh.dev:id/toolbar_title"
    val statusID = "com.reposh.dev:id/stateTV"

    val sellerCardID = "com.reposh.dev:id/widgetUserItem"
    val messageBtnID = "com.reposh.dev:id/btnWrite"
    val productCardFieldID = "com.reposh.dev:id/productItemWidget" //для проверки статуса заказа
    val priceProductID = "com.reposh.dev:id/firstPriceTV"
    val priceDeliveryID = "com.reposh.dev:id/secondPriceTV"
    val priceTotalID = "com.reposh.dev:id/totalPriceTV"
    val cancelOrderBtnID = "com.reposh.dev:id/cancelBtn"

    override fun waitOrderScreen() {
        waitANDROIDElementByTEXT("Доставка")
    }

    override fun assertOrderNumber() {

    }

    override fun assertDeliveryTipe() {

    }

    override fun swipeToPaymentDetails() {
        swipeVerticalToElementWithText("Итого")
    }

    override fun assertProductPrice() {

    }

    override fun assertDeliveryPrice() {

    }

    override fun assertTotalPrice() {

    }

    override fun swipeToCancelOrder() {
        swipeVerticalToElementWithText("Отменить заказ")
    }

    override fun clickCancelOrder() {
        waitAndClickAndroidElementByID(cancelOrderBtnID)
    }

    override fun waitStatus() {
        waitAndroidViewById(statusID)
    }

    override fun assertStatus() {

    }

    override fun clickBySellerInfo() {
        swipeVerticalToElementWithText("Продавец")
        waitAndClickAndroidElementByID(sellerCardID)
    }

    override fun clickByProductInfo() {
        waitAndClickAndroidElementByID(productCardFieldID)
    }

}