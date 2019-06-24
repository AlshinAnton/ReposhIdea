package Pages.IOSPages

import AndroidAndIOSHelpers.IOSBaseClass
import Interface.MySalesInterface
import io.appium.java_client.AppiumDriver

class MySalesPageIOS(driver: AppiumDriver<*>?) : IOSBaseClass(driver), MySalesInterface {
    override fun waitCurrentSalesScreen() {
    }

    override fun swipeToCompletedSales() {
    }

    override fun waitCompletedSales() {

    }
}