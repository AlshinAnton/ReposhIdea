package Interface

interface ChatInterface {
    fun waitSendMessageBtn()
    fun waitMessageField()

    fun writeMessage()
    fun write5messages()
    fun writeLongMessage()
    fun writeMessageWithHieroglyphs()

    fun clickSendButton()

    fun clickAddPhoto()
}

interface ChatListInterface {
    fun waitTestChat()
    fun clickByTestChat()

    fun swipeToBargain()
    fun swipeToDisputes()

}