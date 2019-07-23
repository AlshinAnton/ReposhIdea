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
    fun waitOfferCancelBtn()
}

interface BargainScreenInChatInterface {

    fun waitBargainScreen()

    //Вы договорились
    fun clickByAcceptedBargain()

    //Торг заморожен
    fun clickByFrozenBargain()

    //Ожидает подтверждения покупателем
    fun clickByWaitBuyerConfirmationBargain()

    //Ожидает подтверждения продавцом
    fun clickByWaitSellerConfirmationBargain()

    //Торги закрыты
    fun clickByClosedBargain()

    fun clickByPurchaseFilterBtn()
    fun clickBySellFilterBtn()

    fun clickByCurrentSwitch()

    // Нажатие на иконку пользователя
    fun clickByUserIcon()

    //Нажатие на иконку товара
    fun clickByProductIcon()
}