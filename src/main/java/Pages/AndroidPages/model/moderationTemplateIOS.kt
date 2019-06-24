package Pages.AndroidPages.model

import AppiumSupport.BaseTestClass

data class ModerationTemplate (
        val publish: Boolean = true,
        val reject: RejectTemplate = RejectTemplate()
)

data class RejectTemplate (
        val rejectedBy: Reason = Reason.BAD_PRODUCT_NAME) {
    enum class Reason {
        BAD_PRODUCT_NAME,
        BAD_DESCRIPTION,
        WRONG_CATEGORY,
        BAD_IMAGES
    }
}


fun BaseTestClass.moderationTemplate(template: ModerationTemplate) {
    onboardingInterface.waitThenCloseOnBoardingPage()
    loginInterface.loginAsTester9()
    tapeInterface.closeTooltips()
    bottomToolbarInterface.clickProfile()
    settingsPageInterface.swipeToMyProducts()
    myProductsInterface.swipeToNextTab()
    myProductsInterface.swipeToNextTab()
    myProductsInterface.clickByFirstProduct()
    productCardInterface.waitId()
    APIInterface.setProductId(productCardInterface.getInitialProductID())
    if (template.publish) {
        APIInterface.loginApi()
        settingsPageInterface.back()
        bottomToolbarInterface.clickTape()
        bottomToolbarInterface.clickProfile()
        settingsPageInterface.swipeToMyProducts()
        myProductsInterface.clickSell()

        // дальше нет клика , надо сверить id
        myProductsInterface.clickByFirstProduct()
        productCardInterface.assertPublishId()

    }
    /*else
        when (template.reject.rejectedBy) {
            RejectTemplate.Reason.BAD_IMAGES ->
                RejectTemplate.Reason.BAD_PRODUCT_NAME ->
            RejectTemplate.Reason.BAD_DESCRIPTION ->
            RejectTemplate.Reason.WRONG_CATEGORY ->
        }*/

}





