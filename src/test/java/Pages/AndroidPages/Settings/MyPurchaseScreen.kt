package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.MyPurchaseInterface
import io.appium.java_client.AppiumDriver

class MyPurchaseScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), MyPurchaseInterface {
    override fun waitCurrentPurchaseScreen() {
        waitANDROIDElementByTEXT("Текущие")
    }

    override fun swipeToCompletedPurchase() {
        swipeToRight(0.9,0.1,0.6)
    }

    override fun waitCompletedPurchase() {

    }
}