package Test.AndroidTests.ProductCard

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.model.User
import org.junit.Test

class BargainTest : BaseTestClass() {

    @Test
    fun BargainCloseAndOpenTest() {
        moveToBargain()
        bargainInterface.sendYourPrice("2000")
        bargainInterface.clickSendOffer()
        productCardInterface.waitBargainMoveToBargain()
        productCardInterface.clickBargain()
        bargainInterface.waitCancelOrderBtn()
        bargainInterface.clickCancelOrderBtn()
        bargainInterface.waitCloseBargainAllert()
        bargainInterface.clickCloseBargainInAllert()
        bargainInterface.waitCloseBargainText()
    }

    @Test
    fun LowOfferInBargain() {
        moveToBargain()
        bargainInterface.sendPriceLessThen300()
        bargainInterface.clickSendOffer()
        bargainInterface.waitErrorMessage()
        bargainInterface.assertLowPriceErrorMessage()
    }

    @Test
    fun HighOfferInBargain() {
        moveToBargain()
        bargainInterface.sendHighPrice()
        bargainInterface.clickSendOffer()
        bargainInterface.waitErrorMessage()
        bargainInterface.assertHighPriceErrorMessage()
    }

    @Test
    fun FullAcceptBargain() {
        //login as tester 3
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User1())
        tapeInterface.closeTooltips()
        tapeInterface.clickSearchIcon()
        searchPageInterface.waitAndClickSearchField()
        //Search tester 4
        // click by first product in sell tab
        // normal bargain scenario
        // tester 3 = logout
        // login tester 4
        // move to chat/bargain
        // find last offer with status = ожидает вашего ответа
        // confirm price + assert
        // tester 4 = logout
        // tester 3 = login
        // move to chat/bargain
        // assert status
    }


    private fun moveToBargain() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User1())
        tapeInterface.closeTooltips()
        tapeInterface.clickSearchIcon()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setTextForSearchHeadPhones()
        searchPageInterface.clickEnter()
        searchPageInterface.clickByHeadPhonesProduct()
        productCardInterface.waitBargainOfferPrice()
        productCardInterface.clickBargain()
        bargainInterface.waitBargainScreen()
    }
}