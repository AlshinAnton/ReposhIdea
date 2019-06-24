package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.MyProductsInterface

import org.openqa.selenium.support.PageFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator

import io.appium.java_client.android.AndroidKeyCode.ENTER

class MyProductsActivity(driver: AppiumDriver<*>) : AndroidBaseClass(driver), MyProductsInterface {

    private val onModerationBtn = "На модерации"
    private val sellBtn = "Продаю"
    private val soldBtn = "Продано"
    private val repostsBtn = "Репосты"

    private val filtersBtnID = "com.reposh.dev:id/filter_layout"
    private val searchBtnID = "com.reposh.dev:id/tv_search_query"
    private val sortBtnID = "com.reposh.dev:id/bt_sort"
    //private val searchFieldID = "com.reposh.dev:id/tv_search_query"
    private val searchFieldID = "com.reposh.dev:id/et_search"

    internal var productName: String = ""
    private val searchedProductText = "Adamex"/*"com.reposh.dev:id/ivProductPhoto"*/

    override fun setInitialProductName(productName: String) {
        this.productName = productName
    }

    override fun searchAddedProductInMyProducts() {
        Thread.sleep(2000)
        clickSearchProduct()
        setProductNameToSearch()
        clickEnter()
        Thread.sleep(2000)
        clickByFirstProduct()
    }

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    override fun waitMyProductsPage() {
        waitANDROIDElementByTEXT(onModerationBtn)
    }

    override fun clickOnModeration() {
        clickAndroidElementByText(onModerationBtn)
    }

    override fun clickSell() {
        
        clickAndroidElementByText(sellBtn)
    }

    override fun clickSold() {
        clickAndroidElementByText(soldBtn)
    }

    override fun clickFilters() {
        waitAndClickAndroidElementByID(filtersBtnID)
    }

    override fun clickSearchProduct() {
        Thread.sleep(500)
        waitAndClickAndroidElementByID(searchBtnID)
    }

    override fun clickSort() {
        waitAndClickAndroidElementByID(sortBtnID)
    }

    override fun setProductNameToSearch() {
        sendKeysToAndroidElementWithID(searchFieldID, productName)
    }

    override fun clickEnter() {
        clickEnter(ENTER)
    }

    override fun swipeToProduct() {
        swipeVerticalToElementWithText(productName)
    }

    override fun assertNameAddedProduct() {

    }

    override fun clickByFirstProduct() {
        waitAndClickAndroidElementByID("com.reposh.dev:id/tvBrand")
    }

    override fun swipeToNextTab() {
        swipeToRight(0.9,0.1,0.6)
    }

}
