package Pages.AndroidPages.Checkout

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.CheckoutPaymentConfirmationInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

class CheckoutPaymentConfirmationScreen(driver: AppiumDriver<*>) : AndroidBaseClass(driver), CheckoutPaymentConfirmationInterface {
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    val continueShoppingBtnID = "com.reposh.dev:id/btnRound"
    val checkOrderBtnID = "com.reposh.dev:id/btnText"


    override fun waitConfirmationText() {
        waitANDROIDElementByTEXT("Спасибо за заказ!")
    }

    override fun waitContinueShoppingBtn() {
        isVisibleID(continueShoppingBtnID)
    }

    override fun clickContinueShoppingBtn() {
        waitAndClickAndroidElementByID(continueShoppingBtnID)
    }

    override fun waitCheckOrderBtn() {
        isVisibleID(checkOrderBtnID)
    }

    override fun clickCheckOrderBtn() {
        waitAndClickAndroidElementByID(checkOrderBtnID)
    }

}