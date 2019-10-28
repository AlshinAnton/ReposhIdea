package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.ReviewInterface
import io.appium.java_client.AppiumDriver

class ReviewScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), ReviewInterface {
    override fun waitReceivedReviewPage() {
        waitANDROIDElementByTEXT("Полученные")
    }

    override fun swipeToPostedReview() {
        swipeToRightWithData()
    }
}