package Test.AndroidTests.ChatTests

import AppiumSupport.BaseTestClass
import org.junit.Test

class SendMessagesFromListChatTests : BaseTestClass() {

    @Test
    fun send5MessagesTest() {
        preCondition()
        chatInterface.write5messages()
    }

    @Test
    fun writeMessageWithHieroglyphs() {
        preCondition()
        chatInterface.writeMessageWithHieroglyphs()
        chatInterface.clickSendButton()
    }

    @Test
    fun writeLongMessageTest() {
        preCondition()
        chatInterface.writeLongMessage()
        chatInterface.clickSendButton()
    }

    private fun preCondition() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickNews()
        chatListInterface.waitTestChat()
        chatListInterface.clickByTestChat()
        chatInterface.waitMessageField()
    }
}
