package Interface

interface MyProductsInterface {

    fun waitMyProductsPage()
    fun clickOnModeration()
    fun clickSell()
    fun clickSold()
    fun clickFilters()
    fun clickSearchProduct()
    fun clickSort()

    fun setProductNameToSearch()
    fun clickEnter()

    fun swipeToProduct()
    fun assertNameAddedProduct()
    fun clickByFirstProduct()

    fun setInitialProductName(productName: String)

    fun searchAddedProductInMyProducts()

    fun swipeToNextTab()
}

interface MyDraftsInterface {
    fun clickByFirstDraft()
}