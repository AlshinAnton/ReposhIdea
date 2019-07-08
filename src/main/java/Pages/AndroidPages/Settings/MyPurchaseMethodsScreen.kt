package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.MyPurchaseMethodsInterface
import io.appium.java_client.AppiumDriver

class MyPurchaseMethodsScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), MyPurchaseMethodsInterface {
    override fun waitMyPurchaseMethodsScreen() {
        waitANDROIDElementByTEXT("Банковская карта")
    }

    override fun clickByAddBankCard() {
        clickAndroidElementByText("Банковская карта")
    }

    override fun assertNameInCard() {

    }

    override fun assertCardExpireDate() {

    }

    override fun assertCardNumber() {

    }
}