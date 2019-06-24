package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.MySalesInterface
import io.appium.java_client.AppiumDriver

class MySalesPageAndroid(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), MySalesInterface {
    override fun waitCurrentSalesScreen() {
        waitANDROIDElementByTEXT("Текущие")
    }

    override fun swipeToCompletedSales() {
        swipeToRight(0.9,0.1,0.6)
    }

    override fun waitCompletedSales() {

    }
}