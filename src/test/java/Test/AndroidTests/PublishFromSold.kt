package Test.AndroidTests

import AppiumSupport.BaseTestClass
import org.junit.Test

class PublishFromSold : BaseTestClass() {

    @Test
    fun publishFromSoldWithoutChanges() {
        moveToMyProducts()
        moveToEditProduct()
        addProductInterface.clickPublish()
        chooseOneSize()
        addProductInterface.clickPublish()
        addProductOrDraftConfirmationInterface.clickMoveToMyProductsOrDrafts()
        myProductsInterface.clickSell()
        myProductsInterface.clickSearchProduct()
        myProductsInterface.setInitialProductName(productCardInterface.productName)
        myProductsInterface.setProductNameToSearch()
        myProductsInterface.clickEnter()
        myProductsInterface.clickByFirstProduct()
        productCardInterface.waitSendToSoldBtn()
    }

    @Test
    fun sendToModerationFromSoldWithChanges() {
        moveToMyProducts()
        moveToEditProduct()
        addProductInterface.clickBrands()
        brandsInterface.clickBy08SircusBrand()
        brandsInterface.clickConfirm()
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

    private fun moveToMyProducts() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        profilePageInterface.waitTooltip()
        profilePageInterface.closeTooltip()
        profilePageInterface.swipeToMyProducts()
        profilePageInterface.clickByMyProducts()
    }

    private fun moveToEditProduct() {
        Thread.sleep(2000)
        myProductsInterface.clickSold()
        myProductsInterface.clickByFirstProduct()
        productCardInterface.waitProductName()
        productCardInterface.getProductName()
        productCardInterface.assertSoldStatus()
        productCardInterface.clickMenuAction()
        productCardInterface.clickEdit()
        addProductInterface.closeTooltips()
    }

    private fun chooseOneSize() {
        addProductInterface.clickSize()
        sizeInterface.waitConfirmButton()
        sizeInterface.chooseOneSize()
        Thread.sleep(500)
        sizeInterface.chooseOneSize()
        sizeInterface.clickConfirmButton()
    }
}