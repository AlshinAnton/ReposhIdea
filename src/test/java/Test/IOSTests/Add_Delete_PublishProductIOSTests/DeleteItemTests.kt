package Test.IOSTests.Add_Delete_PublishProductIOSTests

import AppiumSupport.BaseTestClass

class DeleteItemTests : BaseTestClass() {

    /*@Test
    fun deleteItemFromMyProducts() {
        val deleteTemplateLocal = DeleteTemplate(
                deleteFrom_ENUM = DeleteTemplate.DELETE_FROM.PUBLISHED
        )
        deleteProductByTemplateZDES_OPISANIE_DEISTVII(deleteTemplateLocal)
    }

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
        bottomToolbarInterface.clickProfile()
        when (template.deleteFrom_ENUM) {
            DeleteTemplate.DELETE_FROM.PUBLISHED -> {
                settingsPageInterface.swipeToMyProducts()
                deleteProcedure()
            }
            DeleteTemplate.DELETE_FROM.ON_MODERATION -> {
                settingsPageInterface.swipeToMyProducts()
                myProductsInterface.swipeToNextTab()
                myProductsInterface.swipeToNextTab()
                deleteProcedure()
            }
            DeleteTemplate.DELETE_FROM.DRAFT -> {
                settingsPageInterface.swipeToMyProducts()
                myProductsInterface.swipeToNextTab()
                myProductsInterface.swipeToNextTab()
                myProductsInterface.swipeToNextTab()
                deleteProcedure()
            }
        }
    }

    fun deleteProcedure() {
        myProductsInterface.clickByFirstProduct()
        productCardInterface.clickMenuAction()
        productCardInterface.waitMenu()
        productCardInterface.clickEdit()
        addProductInterface.waitAddProductPage()
        addProductInterface.swipeToDelete()
        addProductInterface.clickDelete()
        addProductInterface.waitDeleteConfirmationFragment()
        addProductInterface.clickDeleteConfirm()
    }*/
}