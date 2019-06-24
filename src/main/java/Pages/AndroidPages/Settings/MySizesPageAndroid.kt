package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.MySizesInterface
import io.appium.java_client.AppiumDriver

class MySizesPageAndroid(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), MySizesInterface {
    override fun waitMySizesPage() {
        waitANDROIDElementByTEXT("One Size")
    }

    override fun clickByOneSize() {
        clickAndroidElementByText("One Size")
    }

    override fun waitShoesScreen() {
        waitANDROIDElementByTEXT("Российский")
    }
}