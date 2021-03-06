package Pages.AndroidPages.AddProduct


import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.BrandsInterface
import Interface.SearchWhenFieldVisible
import org.openqa.selenium.support.PageFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator

class BrandsScreen(driver: AppiumDriver<*>) : AndroidBaseClass(driver), BrandsInterface, SearchWhenFieldVisible {
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    private val searchFieldID = "com.reposh.dev:id/et_search"


    override fun waitAndClickSearchField() {
        waitAndClickAndroidElementByID(searchFieldID)
    }

    override fun setTextToSearchField(searchQuery: String) {
        sendKeysToAndroidElementWithID(searchFieldID, searchQuery)
    }

    override fun clickByNeededSearchQuery(searchResult: String) {
        clickAndroidElementByText(searchResult)
    }


    override fun waitBrandsPage() {
        isVisibleID(searchFieldID)
    }

    override fun clickByAdamexBrand() {
        swipeVerticalToElementWithTextAndClick("K-Way")
    }

    override fun clickBy08SircusBrand() {
        swipeVerticalToElementWithTextAndClick("Dolce&Gabbana")
    }

    override fun clickConfirm() {
        clickAndroidElementByText("Применить")
    }

    override fun chooseBrand() {
        waitBrandsPage()
        waitAndClickSearchField()
        setTextToSearchField("A. Kar")
        clickByNeededSearchQuery("A . Karina")
        clickConfirm()

    }
}
