package Test.AndroidTests.ProductCard

import AppiumSupport.BaseTestClass
import org.junit.Test

class CheckCommentsTest : BaseTestClass() {

    // надо перепроверить, когда появятся черновики

    @Test
    fun checkCommentsInMyGoodsForSaleTest() {
        //TODO("Ждем пока ребята починят, товар на продаже со статусом продано, так как сейчас мы переходим в проданный товар ")
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        profilePageInterface.waitTooltip()
        profilePageInterface.closeTooltip()
        profilePageInterface.swipeToMyProducts()
        profilePageInterface.clickByMyProducts()
        myProductsInterface.clickByFirstProduct()
        productCardInterface.waitCommentsIcon()
        productCardInterface.clickByCommentsIcon()
        commentsInterface.waitinputField()
        commentsInterface.sendKeysToInputField()
        commentsInterface.sendComment()
        commentsInterface.clickBack()
        productCardInterface.getCommentsCount()
        productCardInterface.clickByCommentsIcon()
        commentsInterface.waitinputField()
        commentsInterface.sendKeysToInputField()
        commentsInterface.sendComment()
        commentsInterface.clickBack()
        productCardInterface.assertCommentCount()


    }
}