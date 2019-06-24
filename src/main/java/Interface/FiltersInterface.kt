package Interface

interface FiltersInterface {
    fun waitFiltersPage()
    fun clickByFiltersSettings()
    fun clickBySearch()
    fun clickBySort()
    fun clickByFirstItem()
    fun clickBySecondItem()
    fun clickByThirdItem()
    fun checkCountFilters(behaviorFiltersCount: String, filterName: String)

}

interface FiltersSettingsInterface {
    fun waitFilterSettingsPage()
    fun clickByCategory()
    fun clickBySize()
    fun clickByBrand()
    fun clickByColor()
    fun clickByCondition()
    fun clickByPrice()
    fun clickByLocation()
    fun chooseProductWithDeliveryOnly()
    fun clickConfirm()
    fun dropFilterSettings()

}