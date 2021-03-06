package Pages.AndroidPages

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.BargainInterface
import io.appium.java_client.AppiumDriver



class BargainScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), BargainInterface {

    private val productPriceId = "com.reposh.dev:id/priceTV"
    private val price_etId = "com.reposh.dev:id/edit_text"
    private val sendOfferBtnId = "com.reposh.dev:id/offerBtn"
    private val cancelOfferBtnId = "com.reposh.dev:id/btn_offer_cancel"
    private val errorMesssageId = "com.reposh.dev:id/helper_tv"
    private val checkoutBtnId = "com.reposh.dev:id/btn_checkout"
    private val offerCancelBtnId = "com.reposh.dev:id/btn_offer_cancel"

    private val setPriceFieldText = "Ваша цена"
    private val frozenBargainText = "Торги остановлены"
    private val closedBargainText = "Торги закрыты"


    override fun waitBargainScreen() {
        isVisibleID(sendOfferBtnId)
    }

    override fun assertProductPriceInBargainScreen() {

    }

    override fun setMyPrice() {
        sendKeysToAndroidElementWithID(price_etId, "2000")
    }

    override fun clickSendOffer() {
        waitAndClickAndroidElementByID(sendOfferBtnId)
    }

    override fun waitCancelOrderBtn() {
        isVisibleID(cancelOfferBtnId)
    }

    override fun clickCancelOrderBtn() {
        waitAndClickAndroidElementByID(cancelOfferBtnId)
    }

    override fun waitFrozenBragainText() {
        waitAndClickAndroidElementByText(frozenBargainText)
    }

    override fun waitCloseBargainText() {
        waitANDROIDElementByTEXT(closedBargainText)
    }

    override fun clickCreateOrderBtn() {
        waitAndClickAndroidElementByID(checkoutBtnId)
    }

    override fun waitOfferCancelBtn() {
        waitAndClickAndroidElementByID(offerCancelBtnId)
    }

    override fun waitCloseBargainAllert() {
        waitANDROIDElementByTEXT("ЗАКРЫТЬ ТОРГ")
    }

    override fun clickCloseBargainInAllert() {
        clickAndroidElementByText("ЗАКРЫТЬ ТОРГ")
    }



    override fun getProductPrice(){
        var price : String = ""
        price = getTextFromElementWithId("com.reposh.dev:id/priceTV")
        if (!price.equals("3 000 \u20BD")) {
            println("Цена на первом шаге торга отличается от реальной" + price)
        }
    }

    override fun sendYourPrice(offer : String) {
        clickAndroidElementByText(setPriceFieldText)
        sendKeysToAndroidElementWithID(price_etId, offer)
    }

    override fun waitErrorMessage() {
        isVisibleID(errorMesssageId)
    }

    override fun assertLowPriceErrorMessage() {
        val waitingText = "Предложение не может быть меньше 300 рублей"
        assertTemplateStringsById(
                errorMesssageId,
                waitingText,
                "Текст ошибок не совпадает"
        )
    }

    override fun sendPriceLessThen300() {
        clickAndroidElementByText(setPriceFieldText)
        sendKeysToAndroidElementWithID(price_etId, "299")
    }

    override fun assertHighPriceErrorMessage() {
        val waitingText = "Предложение не может превышать стоимость товара"
        assertTemplateStringsById(
                errorMesssageId,
                waitingText,
                "Текст ошибок не совпадает"
        )
    }

    override fun sendHighPrice() {
        clickAndroidElementByText(setPriceFieldText)
        sendKeysToAndroidElementWithID(price_etId, "12345678")
    }

}