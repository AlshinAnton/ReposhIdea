package Interface

interface SearchPageInterface : SearchWhenFieldVisible {
    fun clickTop()
    fun clickCategory()
    fun clickBrands()
    fun clickPeople()

    fun waitAndClickSearchIconTop()
    fun waitAndClickSearchPageCategory()
    fun waitAndClickSearchPageBrands()
    fun waitAndClickSearchPagePeople()


    fun setTextToTOPSearchField()
    fun clickSearch()
    fun clickBack()

    fun clearSearchHistory()

    fun setTextToCATEGORYSearchField()

    fun setTextToBrandsSearchField()

    fun setTextToPEOPLESearchField()

    fun clickByAdamex()

    fun clearSearchHistoryBrands()

    fun hideKeyboard()

    fun swipeAndClickByTester()

    fun setTextForSearchTester()
    fun setTextForSearchHeadPhones()
    fun clickByHeadPhonesProduct()
    fun clickEnter()
    fun confirmSearch()
    fun choseDpdCourierQuery()
    fun chooseFirstItem()
    fun setDeliveryQueryText()
    fun choosePostamatQuery()
    fun chooseRussianPost()
}

interface SearchWhenFieldVisible {
    fun waitAndClickSearchField()
    fun setTextToSearchField(searchQuery:  String)
    fun clickByNeededSearchQuery(searchResult: String)


}