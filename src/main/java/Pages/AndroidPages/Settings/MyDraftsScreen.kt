package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.MyDraftsInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

class MyDraftsScreen(driver: AppiumDriver<*>) : AndroidBaseClass(driver), MyDraftsInterface {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }


    override fun clickByFirstDraft() {
        val searchedProductImageID = "com.reposh.dev:id/product_image"
        waitAndClickAndroidElementByID(searchedProductImageID)
    }
}