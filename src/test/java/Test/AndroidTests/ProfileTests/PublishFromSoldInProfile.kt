package Test.AndroidTests.ProfileTests

import AppiumSupport.BaseTestClass

class PublishFromSoldInProfile : BaseTestClass() {

    /*@Test
    fun publishFromSoldWithoutChanges() {
        moveToProfile()
        moveToEditProduct()
        addProductInterface.clickPublish()
        addProductOrDraftConfirmationInterface.clickMoveToMyProductsOrDrafts()
        settingsPageInterface.back()
        Thread.sleep(1000)
        settingsPageInterface.back()
        settingsPageInterface.back()
        profileMainPageInterface.clickSellTab()
        myProductsInterface.clickSearchProduct()
        myProductsInterface.setInitialProductName(productCardInterface.productName)
        myProductsInterface.setProductNameToSearch()
        myProductsInterface.clickEnter()
        myProductsInterface.clickByFirstProduct()
        productCardInterface.waitSendToSoldBtn()
    }

    @Test
    fun sendToModerationFromSoldWithChanges() {
        moveToProfile()
        moveToEditProduct()
        addProductInterface.clickCategory()
        categoryInterface.womensWardrobe()
        categoryInterface.womensWardrobe()
        addProductInterface.clickSize()
        sizeInterface.chooseOneSize()
        addProductInterface.clickPublish()
        addProductOrDraftConfirmationInterface.clickMoveToMyProductsOrDrafts()
        myProductsInterface.clickOnModeration()
        myProductsInterface.clickSearchProduct()
        myProductsInterface.setInitialProductName(productCardInterface.productName)
        myProductsInterface.setProductNameToSearch()
        myProductsInterface.clickEnter()
        myProductsInterface.clickByFirstProduct()
        productCardInterface.waitMessageOnModeration()
    }

    private fun moveToProfile() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        profileMainPageInterface.waitSettings()
    }

    private fun moveToEditProduct() {
        profileMainPageInterface.clickSoldTab()
        myProductsInterface.clickByFirstProduct()
        productCardInterface.waitProductName()
        productCardInterface.getProductName()
        productCardInterface.assertSoldStatus()
        productCardInterface.clickMenuAction()
        productCardInterface.clickEdit()
        addProductInterface.closeTooltips()
    }*/
}