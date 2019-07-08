package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.LikedInterface
import io.appium.java_client.AppiumDriver

class LikedScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), LikedInterface {
    override fun waitLikedPage() {
        waitANDROIDElementByTEXT("Лайки")
    }

    override fun swipeToRepost() {
        swipeToRightWithData()
    }
}