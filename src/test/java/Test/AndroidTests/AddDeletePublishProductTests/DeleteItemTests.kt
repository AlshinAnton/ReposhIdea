package Test.AndroidTests.AddDeletePublishProductTests

import AppiumSupport.BaseTestClass
import org.junit.Test

class DeleteItemTests : BaseTestClass() {

    /*@Test
    TODO : Ждем фикса бага, когда товар в продаже отображается как проданный

    fun deleteItemFromMyProducts() {
        val deleteTemplateLocal = DeleteTemplate(
                deleteFrom_ENUM = DeleteTemplate.DELETE_FROM.PUBLISHED
        )
        deleteProductByTemplateZDES_OPISANIE_DEISTVII(deleteTemplateLocal)
    }*/

    @Test
    fun deleteItemFromDraft() {
        val deleteTemplateLocal = DeleteTemplate(
                deleteFrom_ENUM = DeleteTemplate.DELETE_FROM.DRAFT
        )
        deleteProductByTemplateZDES_OPISANIE_DEISTVII(deleteTemplateLocal)
    }

    @Test
    fun deleteItemFromInModeration() {
        val deleteTemplateLocal = DeleteTemplate(
                deleteFrom_ENUM = DeleteTemplate.DELETE_FROM.ON_MODERATION
        )
        deleteProductByTemplateZDES_OPISANIE_DEISTVII(deleteTemplateLocal)
    }

    data class DeleteTemplate(
            val deleteFrom_ENUM: DELETE_FROM? = null) {
        enum class DELETE_FROM {
            PUBLISHED,
            ON_MODERATION,
            DRAFT
        }
    }

    private fun deleteProductByTemplateZDES_OPISANIE_DEISTVII(template: DeleteTemplate) {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        profilePageInterface.waitTooltip()
        profilePageInterface.closeTooltip()
        profilePageInterface.swipeToMyProducts()
        profilePageInterface.clickByMyProducts()
        when (template.deleteFrom_ENUM) {
            DeleteTemplate.DELETE_FROM.PUBLISHED -> {
                deleteProcedure()
            }
            DeleteTemplate.DELETE_FROM.ON_MODERATION -> {
                myProductsInterface.swipeToNextTab()
                Thread.sleep(2000)
                myProductsInterface.swipeToNextTab()
                deleteProcedure()
            }
            DeleteTemplate.DELETE_FROM.DRAFT -> {
                myProductsInterface.swipeToNextTab()
                Thread.sleep(2000)
                myProductsInterface.swipeToNextTab()
                Thread.sleep(1000)
                myProductsInterface.swipeToNextTab()
                deleteProcedure()
            }
        }
    }

    fun deleteProcedure() {
        myProductsInterface.clickByFirstProduct()
        productCardInterface.waitMenu()
        productCardInterface.clickMenuAction()
        productCardInterface.clickEdit()
        addProductInterface.closeTooltips()
        //addProductInterface.waitAddProductPage()
        addProductInterface.swipeToDelete()
        addProductInterface.clickDelete()
        addProductInterface.waitDeleteConfirmationFragment()
        addProductInterface.clickDeleteConfirm()
    }
}