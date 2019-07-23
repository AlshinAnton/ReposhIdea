package Test.AndroidTests.Bargain

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.Test

class BargainTabTests : BaseTestClass() {

    @Test
    fun checkUserAndProductIcons() {
        moveToBargainTab()
        bargainScreenInChatInterface.clickByUserIcon()
        profilePageInterface.waitSubscribersField()
        profilePageInterface.back()
        bargainScreenInChatInterface.clickByProductIcon()
        productCardInterface.waitLikeIcon()
    }

    @Test
    fun checkBtnAndSwitch() {
        moveToBargainTab()
        bargainScreenInChatInterface.clickByPurchaseFilterBtn()
        bargainScreenInChatInterface.clickByPurchaseFilterBtn()
        bargainScreenInChatInterface.clickBySellFilterBtn()
        bargainScreenInChatInterface.clickBySellFilterBtn()
        bargainScreenInChatInterface.clickByCurrentSwitch()
        bargainScreenInChatInterface.clickByCurrentSwitch()
    }

    @Test
    fun checkTextInFrozenBargain() {
        moveToBargainTab()
        bargainScreenInChatInterface.clickByFrozenBargain()
        bargainInterface.waitFrozenBragainText()
    }

    @Test
    fun checkWaitSellerAnswerText() {
        moveToBargainTab()
        bargainScreenInChatInterface.clickByWaitSellerConfirmationBargain()
        bargainInterface.waitOfferCancelBtn()
    }

    @Test
    fun checkWaitBuyerAnswerText() {
        moveToBargainTab()
        bargainScreenInChatInterface.clickByWaitBuyerConfirmationBargain()
        bargainInterface.waitOfferCancelBtn()
    }

    @Test
    fun checkCancelBargainText() {
        moveToBargainTab()
        bargainScreenInChatInterface.clickByCurrentSwitch()
        bargainScreenInChatInterface.clickByClosedBargain()
        bargainInterface.waitCloseBargainText()
    }


    private fun moveToBargainTab() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User9())
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickNews()
        chatListInterface.waitTestChat()
        chatListInterface.swipeToBargain()
        bargainScreenInChatInterface.waitBargainScreen()
    }
}