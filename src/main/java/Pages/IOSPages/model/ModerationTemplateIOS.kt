package Pages.IOSPages.model

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.model.UserTemplate


data class ModerationTemplateIOS (
        val userTemplate: UserTemplate,
        val publish: Boolean = true,
        val reject: RejectTemplateIOS = RejectTemplateIOS()
)

data class RejectTemplateIOS (
        val rejectedBy: Reason = Reason.BAD_PRODUCT_NAME) {
    enum class Reason {
        BAD_PRODUCT_NAME,
        BAD_DESCRIPTION,
        WRONG_CATEGORY,
        BAD_IMAGES
    }
}


fun BaseTestClass.moderationTemplateIOS(template: ModerationTemplateIOS) {
    onboardingInterface.waitThenCloseOnBoardingPage()
    loginInterface.login(template.userTemplate.user)
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





