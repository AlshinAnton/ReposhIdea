package Pages.AndroidPages.ProductCard


import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.CommentsInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidKeyCode
import java.awt.event.KeyEvent

class CommentsScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), CommentsInterface {

    val inputFieldID = "com.reposh.dev:id/et_comment"
    val sendComment = "com.reposh.dev:id/button_send_comment"

    override fun waitInputField() {
        waitAndroidViewById(inputFieldID)
    }

    override fun clickByInputField() {
        waitAndClickAndroidElementByID(inputFieldID)
    }

    override fun sendKeysToInputField() {
        sendKeysToAndroidElementWithID(inputFieldID, "Это пробный комментарий")
    }

    override fun sendComment() {
        waitAndClickAndroidElementByID(sendComment)
    }

    override fun clickBack() {
        clickEnter(AndroidKeyCode.BACK)
    }

    private fun clickEnter(keyEvent: KeyEvent) {

    }

}