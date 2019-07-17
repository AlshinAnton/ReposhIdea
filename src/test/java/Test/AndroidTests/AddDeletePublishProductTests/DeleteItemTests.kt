package Test.AndroidTests.AddDeletePublishProductTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.model.User
import Pages.AndroidPages.model.UserTemplate
import org.junit.Test

class DeleteItemTests : BaseTestClass() {

    data class DeleteTemplate(
            val userTemplate: UserTemplate,
            val deleteFrom_ENUM: DELETE_FROM? = null) {
        enum class DELETE_FROM {
            PUBLISHED,
            ON_MODERATION,
            DRAFT
        }
    }

    @Test
    fun deleteItemFromMyProducts() {
        val deleteTemplateLocal = DeleteTemplate(
                deleteFrom_ENUM = DeleteTemplate.DELETE_FROM.PUBLISHED,
                userTemplate = UserTemplate(user = User.User1()))
        deleteProductByTemplateZDES_OPISANIE_DEISTVII(deleteTemplateLocal)
    }

    @Test
    fun deleteItemFromDraft() {
        val deleteTemplateLocal = DeleteTemplate(
                deleteFrom_ENUM = DeleteTemplate.DELETE_FROM.DRAFT,
                userTemplate = UserTemplate(user = User.User1())
        )
        deleteProductByTemplateZDES_OPISANIE_DEISTVII(deleteTemplateLocal)
    }

    @Test
    fun deleteItemFromInModeration() {
        val deleteTemplateLocal = DeleteTemplate(
                deleteFrom_ENUM = DeleteTemplate.DELETE_FROM.ON_MODERATION,
                userTemplate = UserTemplate(user = User.User1())
        )
        deleteProductByTemplateZDES_OPISANIE_DEISTVII(deleteTemplateLocal)
    }

    private fun deleteProductByTemplateZDES_OPISANIE_DEISTVII(template: DeleteTemplate) {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(template.userTemplate.user)
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