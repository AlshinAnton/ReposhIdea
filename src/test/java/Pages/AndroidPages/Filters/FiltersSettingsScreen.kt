package Pages.AndroidPages.Filters

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.FiltersSettingsInterface
import io.appium.java_client.AppiumDriver

class FiltersSettingsScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), FiltersSettingsInterface {

    private val dropFiltersBtnID = "com.reposh.dev:id/clear_filter_container"
    private val confirmBtnID = "com.reposh.dev:id/action_apply"
    private val filterByLocationID = "com.reposh.dev:id/layout_location"
    private val productWithDeliverySwitchID = "com.reposh.dev:id/delivery_switch"

    override fun waitFilterSettingsPage() {
        assertWaitElementWithIDTemplate(dropFiltersBtnID, "страница с настройками фильтров не открылась(")
    }

    override fun clickByCategory() {
        findChildElementByID(
                "com.reposh.dev:id/category_ttv",
                "com.reposh.dev:id/text_il").click()
    }

    override fun clickBySize() {
        findChildElementByID(
                "com.reposh.dev:id/size_ttv",
                "com.reposh.dev:id/text_il").click()
    }

    override fun clickByBrand() {
        findChildElementByID(
                "com.reposh.dev:id/brand_ttv",
                "com.reposh.dev:id/text_il").click()
    }

    override fun clickByColor() {
        findChildElementByID(
                "com.reposh.dev:id/layout_color",
                "com.reposh.dev:id/text_il").click()
    }

    override fun clickByCondition() {
        findChildElementByID(
                "com.reposh.dev:id/condition_ttv",
                "com.reposh.dev:id/text_il").click()
    }

    override fun clickByPrice() {
        findChildElementByID(
                "com.reposh.dev:id/price_ttv",
                "com.reposh.dev:id/text_il").click()
    }

    override fun clickByLocation() {
        waitAndClickAndroidElementByID(filterByLocationID)
    }

    override fun chooseProductWithDeliveryOnly() {
        waitAndClickAndroidElementByID(productWithDeliverySwitchID)
    }

    override fun clickConfirm() {
        waitAndClickAndroidElementByID(confirmBtnID)
    }

    override fun dropFilterSettings() {
        waitAndClickAndroidElementByID(dropFiltersBtnID)
    }
}