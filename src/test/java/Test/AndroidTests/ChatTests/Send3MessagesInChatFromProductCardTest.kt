package Test.AndroidTests.ChatTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.jupiter.api.Test

class Send3MessagesInChatFromProductCardTest : BaseTestClass() {

    @Test
    fun send5MessagesTest() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User9())
        tapeInterface.closeTooltips()
        searchPageInterface.waitAndClickSearchIconTop()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setTextForSearchHeadPhones()
        searchPageInterface.clickEnter()
        searchPageInterface.clickByHeadPhonesProduct()
        productCardInterface.waitLikeIcon()
        productCardInterface.swipeToAnotherProducts()
        productCardInterface.clickConnectWithSeller()
        chatInterface.waitMessageField()
        chatInterface.write5messages()
    }
}