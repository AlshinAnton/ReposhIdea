package Test.AndroidTests.ProductCard

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.jupiter.api.Test

class CheckCommentsTest : BaseTestClass() {

    // надо перепроверить, когда появятся черновики

    @Test
    fun checkCommentsInMyGoodsForSaleTest() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User1())
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        profilePageInterface.waitTooltip()
        profilePageInterface.closeTooltip()
        profilePageInterface.swipeToMyProducts()
        profilePageInterface.clickByMyProducts()
        myProductsInterface.clickByFirstProduct()
        productCardInterface.waitCommentsIcon()
        productCardInterface.clickByCommentsIcon()
        commentsInterface.waitInputField()
        commentsInterface.sendKeysToInputField()
        commentsInterface.sendComment()
        commentsInterface.clickBack()
        productCardInterface.getCommentsCount()
        productCardInterface.clickByCommentsIcon()
        commentsInterface.waitInputField()
        commentsInterface.sendKeysToInputField()
        commentsInterface.sendComment()
        commentsInterface.clickBack()
        productCardInterface.assertCommentCount()


    }
}