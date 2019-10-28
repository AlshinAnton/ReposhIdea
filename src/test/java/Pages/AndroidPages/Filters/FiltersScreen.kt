package Pages.AndroidPages.Filters

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.FiltersInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.openqa.selenium.WebElement

class FiltersScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), FiltersInterface {

    val filterSettingsBtn = "Фильтры"
    val countFiltersID = "com.reposh.dev:id/tv_item_count_filters"
    val searchIconID = "com.reposh.dev:id/tv_search_query"
    val sortIconID = "com.reposh.dev:id/bt_sort"
    val productsTabName = "Товары"
    val sellersTabName = "Продавцы"
    val productCardImageID = "com.reposh.dev:id/ivProductPhoto"


    override fun waitFiltersPage() {
        waitANDROIDElementByTEXT(filterSettingsBtn)
    }

    override fun clickByFiltersSettings() {
        waitAndClickAndroidElementByID(filterSettingsBtn)
    }

    override fun clickBySearch() {
        waitAndClickAndroidElementByID(searchIconID)
    }

    override fun clickBySort() {
        waitAndClickAndroidElementByID(sortIconID)
    }

    override fun clickByFirstItem() {
        waitElementWithIDAndInstanceTemplate(productCardImageID, 1, "Первый товар не найден")
        clickAndroidElementByIDAndInstance(productCardImageID, 1)

    }

    override fun clickBySecondItem() {
        waitElementWithIDAndInstanceTemplate(productCardImageID, 2, "Второй товар не найден")
        clickAndroidElementByIDAndInstance(productCardImageID, 2)
    }

    override fun clickByThirdItem() {
        waitElementWithIDAndInstanceTemplate(productCardImageID, 3, "Третий товар не найден")
        clickAndroidElementByIDAndInstance(productCardImageID, 3)
    }

    override fun checkCountFilters(behaviorFiltersCount: String, filterName: String) {
        assertTemplateStringsById(
                countFiltersID,
                behaviorFiltersCount,
                "Колличество фильтров при выборе $filterName не верно = ")
    }
}