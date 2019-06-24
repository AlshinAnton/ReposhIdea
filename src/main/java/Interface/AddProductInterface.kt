package Interface

interface AddProductInterface {
    val productName: String

    fun closeTooltips()
    fun waitAddProductPage()
    fun clickAddPhoto()
    fun clickAddPhotoIOS(int: Int)
    fun clickProductName()
    fun clickEnter()
    fun sendKeysToProductDescriptionField()
    fun closeKeyboard()
    fun clickCategory()
    fun clickSize()
    fun clickBrands()
    fun clickColor()
    fun swipeToCondition()
    fun clickCondition()
    fun swipeToPurchasePrice()
    fun swipeToSellingPrice()
    fun setPurchasePrice()
    fun setSellingPrise()
    fun clickLocation()
    fun clickBySubsidy()
    fun swipeToSaveToDraft()
    fun clickSaveToDraft()
    fun swipeToDelete()
    fun clickPublish()
    fun clickPurchasePrice()
    fun waitDeleteConfirmationFragment()
    fun clickDeleteConfirm()
    fun clickDelete()
    fun assertNoPhotoErrorMessage()
    fun assertNoPriceErrorMessage()
    fun clickDeleteAndroid()
    fun swipeToDpdCourier()
    fun clickDpdCourier()
    fun swipeToDpdPostamat()
    fun clickDpdPostamat()
    fun setProductNameCourier()
    fun setProductNamePostamat()
    fun setproductNameBothDeliveries()
    fun swipeToDescription()
    fun swipeToTop()
}

interface AddProductOrDraftConfirmationInterface {
    fun waitAddProductOrDraftConfirmationPage()
    fun clickCheckProductOrDraft()
    fun clickMoveToMyProductsOrDrafts()
}

interface BrandsInterface {
    fun waitBrandsPage()
    fun clickByAdamexBrand()
    fun clickBy08SircusBrand()
    fun chooseBrand()
    fun clickConfirm()
}

interface CategoryInterface {
    fun waitCategoryScreen()
    fun womensWardrobe()
    fun clickAccessories()
    fun chooseAccessoriesCategory()
}

interface ConditionInterface {
    fun clickNew()
    fun clickNewWithoutTag()
    fun clickGoodCondition()
    fun clickMiddleCondition()
    fun clickBadCondition()
}

interface LocationInterface {
    fun waitLocationPage()
    fun clickSearchField()
    fun setLocation()
    fun clickDone()
    fun waitSearchField()
    fun enterCity()
    fun clickByFirstCity()
}

interface SizeInterface {
    fun waitConfirmButton()
    fun clickConfirmButton()
    fun switchToMultiSize()
    fun clickFirstSize()
    fun clickSecondSize()
    fun clickThirdSize()
    fun clickForthSize()
    fun clickFifthSize()
    fun waitSizeCount()
    fun chooseSizeCount()
    fun chooseOneSize()
    fun chooseMultiSize()
}

interface ColorInterface {
    fun waitColorPage()
    fun chooseWhiteAndBlack()
    fun clickConfirm()
}

