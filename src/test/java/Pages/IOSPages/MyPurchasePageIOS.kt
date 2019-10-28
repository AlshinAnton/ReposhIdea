package Pages.IOSPages

import AndroidAndIOSHelpers.IOSBaseClass
import Interface.MyPurchaseInterface
import io.appium.java_client.AppiumDriver

class MyPurchasePageIOS(driver: AppiumDriver<*>?) : IOSBaseClass(driver), MyPurchaseInterface {
    override fun waitCurrentPurchaseScreen() {
    }

    override fun swipeToCompletedPurchase() {
    }

    override fun waitCompletedPurchase() {

    }
}