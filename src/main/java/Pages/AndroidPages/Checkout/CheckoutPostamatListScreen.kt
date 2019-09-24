package Pages.AndroidPages.Checkout

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.CheckoutPostamatListInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

class CheckoutPostamatListScreen(driver: AppiumDriver<*>) : AndroidBaseClass(driver), CheckoutPostamatListInterface {
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    private val searchFieldID = "com.reposh.dev:id/et_search"
    private val filterBtnId = "com.reposh.dev:id/action_self_pickup_filter"


    override fun chooseMap() {
        waitANDROIDElementByTEXT("Карта")
        clickAndroidElementByText("Карта")
    }

    override fun chooseList() {
        waitANDROIDElementByTEXT("Список")
        clickAndroidElementByText("Список")
    }

    override fun clickFilter() {
        waitAndClickAndroidElementByID(filterBtnId)
    }

    override fun clickBySearchField() {
        waitAndClickAndroidElementByID(searchFieldID)
    }

    override fun chooseFirstPostamatFromList() {
        waitAndClickAndroidElementByText("Отделение Почты России")
        clickAndroidElementByText("Отделение Почты России")
    }
}