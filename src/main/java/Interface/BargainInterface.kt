package Interface
interface BargainInterface {

    fun getProductPrice()
    fun sendYourPrice(offer : String)

    fun waitBargainScreen()
    fun assertProductPriceInBargainScreen()
    fun setMyPrice()
    fun clickSendOffer()
    fun waitCancelOrderBtn()
    fun clickCancelOrderBtn()

    fun waitFrozenBragainText()
    fun waitCloseBargainText()

    fun clickCreateOrderBtn()
    fun waitCloseBargainAllert()
    fun clickCloseBargainInAllert()

    fun waitErrorMessage()
    fun assertLowPriceErrorMessage()
    fun assertHighPriceErrorMessage()
    fun sendPriceLessThen300()
    fun sendHighPrice()
}