package Pages.AndroidPages.Search


import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.SearchPageInterface
import org.openqa.selenium.support.PageFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidKeyCode
import io.appium.java_client.pagefactory.AppiumFieldDecorator

class SearchScreen(driver: AppiumDriver<*>) : AndroidBaseClass(driver), SearchPageInterface {

    private val searchFieldID = "com.reposh.dev:id/et_search"
    private val searchIconID = "com.reposh.dev:id/buttonSearch"
    private val clearSearchButtonID = "com.reposh.dev:id/btn_clear_search_history"
    private val clearSearchButtonBrandsID = "com.reposh.dev:id/clear"
    private val searchHistoryResultID = "com.reposh.dev:id/tv_text"
    private val searchedBrand = "Adamex"
    private val searchedPeopleID = "com.reposh.dev:id/tv_username"

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }


    //Верхний toolbar
    override fun clickTop() {
        waitAndClickAndroidElementByText("Топ")
    }

    override fun clickCategory() {
        waitAndClickAndroidElementByText("Категории")
    }

    override fun clickBrends() {
        waitAndClickAndroidElementByText("Бренды")
    }

    override fun clickPeople() {
        waitAndClickAndroidElementByText("Люди")
    }

    override fun waitAndClickSearchIconTop() {
        Thread.sleep(2000)
        waitAndClickAndroidElementByID(searchIconID)
        Thread.sleep(1000)
    }

    override fun waitAndClickSearchPageCategory() {
        waitAndClickAndroidElementByText("Искать товары")
    }

    override fun waitAndClickSearchPageBrands() {
        waitAndClickAndroidElementByText("Поиск бренда")
    }

    override fun waitAndClickSearchPagePeople() {
        waitAndClickAndroidElementByText("Поиск людей")
    }

    override fun waitAndClickSearchField() {
        isClickableID(searchFieldID)
        clickAndroidElementByIDAndInstance(searchFieldID, 0)
    }

    override fun setTextToTOPSearchField() {
        sendKeysToAndroidElementByIDAndInstance(searchFieldID, 0, "Уши")
    }

    override fun setTextToCATEGORYSearchField() {
        sendKeysToAndroidElementByIDAndInstance(searchFieldID, 0, "Игрушки")
    }

    override fun setTextToBrandsSearchField() {
        sendKeysToAndroidElementByIDAndInstance(searchFieldID, 0, searchedBrand)
    }

    override fun setTextToPEOPLESearchField() {
        sendKeysToAndroidElementByIDAndInstance(searchFieldID, 0, "teste")
    }

    override fun clickByAdamex() {
        waitAndroidViewByIdAndInstance("com.reposh.dev:id/title", 0)
        clickAndroidElementByIDAndInstance("com.reposh.dev:id/title", 0)
    }

    override fun clearSearchHistoryBrands() {
        waitAndClickAndroidElementByID(clearSearchButtonBrandsID)
    }

    override fun hideKeyboard() {
        clickEnter(AndroidKeyCode.KEYCODE_BACK)
    }

    override fun swipeAndClickByTester() {
        val searchedMan = "tester"
        waitANDROIDElementByTEXT(searchedMan)
        clickAndroidElementByText(searchedMan)
    }

    // for testing chat
    override fun setTextForSearchTester() {
        sendKeysToAndroidElementByIDAndInstance(searchFieldID, 0, "Tester2")
    }

    override fun setTextForSearchHeadPhones() {
        sendKeysToAndroidElementByIDAndInstance(searchFieldID, 0, "Уши")
    }


    override fun clickSearch() {
        clickEnter(AndroidKeyCode.KEYCODE_ENTER)
    }

    override fun clickBack() {
        clickEnter(AndroidKeyCode.KEYCODE_BACK)
    }

    override fun clearSearchHistory() {
        waitAndClickAndroidElementByID(clearSearchButtonID)
    }

    override fun clickByHeadPhonesProduct() {
        waitAndClickAndroidElementByText("08Sircus")
    }

    override fun choosePostamatQuery() {
        val txt = "Товар с доставкой постамат"
        waitANDROIDElementByTEXT(txt)
        clickAndroidElementByText(txt)
    }

    override fun setDeliveryQueryText() {
        sendKeysToAndroidElementWithID(searchFieldID, "Товар с доставкой")
    }

    override fun choseDpdCourierQuery() {
        val txt = "Товар с доставкой курьер"
        waitANDROIDElementByTEXT(txt)
        clickAndroidElementByText(txt)
    }

    override fun chooseRussianPost() {
        val txt = "Товар с доставкой Почта России"
        waitANDROIDElementByTEXT(txt)
        clickAndroidElementByText(txt)
    }

    override fun chooseFirstItem() {
        waitAndClickAndroidElementByID("com.reposh.dev:id/ivProductPhoto")
    }

    override fun confirmSearch() {
        waitAndClickAndroidElementByText("Искать")
    }

    override fun clickEnter() {
        clickEnter(AndroidKeyCode.ENTER)
    }

    override fun setTextToSearchField(searchQuery: String) {
        sendKeysToAndroidElementWithID(searchFieldID, searchQuery)
    }

    override fun clickByNeededSearchQuery(searchResult: String) {
        clickAndroidElementByText(searchResult)
    }
}
