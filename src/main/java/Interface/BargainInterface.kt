package Interface
interface BargainInterface {
    fun waitChooseSizeScreen()
    fun clickByFirstSize()
    fun getProductPrice()
    fun clickContinue()
    fun waitScreen2Bargain()
    fun checkSize()
    fun checkPrice()
    fun sendYourPrice(offer : String)
    fun clickSendOffer()
    fun assertBargainMessage()
    fun waitCancelBargainBtn()
    fun clickCancelBargainBtn()
    fun waitCancelBargainDialog()
    fun clickConfirmCancelBargain()
    fun assertErrorMessageLowPrice()
    fun assertErrorMessageHighPrice()

}