package Pages.AndroidPages

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.BargainInterface
import io.appium.java_client.AppiumDriver



class BargainScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), BargainInterface {

    var price : String = ""

    override fun waitChooseSizeScreen() {
        waitANDROIDElementByTEXT("Выберите размеры")
    }

    override fun clickByFirstSize() {
        waitAndClickAndroidElementByText("S")
    }

    override fun getProductPrice(){
        price = getTextFromElementWithId("com.reposh.dev:id/tv_cost")
        if (!price.equals("3 000 \u20BD")) {
            println("Цена на первом шаге торга отличается от реальной" + price)
        }
    }

    override fun waitScreen2Bargain() {
        waitANDROIDElementByTEXT("Выбранные товары:")
    }

    override fun checkSize() {
        val checkSize21 = getTextFromElementWithId("com.reposh.dev:id/tvSelectedSizes")
        assertTemplateStringsById(
                "com.reposh.dev:id/tvSelectedSizes",
                "S,",
                "Отображаемый размер отличается от выбранного   " +checkSize21)
    }

    override fun checkPrice() {
        compareStringNumbers(
                "com.reposh.dev:id/tvPrice",
                "3000",
                "Цена на 2 шаге торга отличается от объявленной продавцом")
    }

    override fun sendYourPrice(offer : String) {
        sendKeysToAndroidElementWithID("com.reposh.dev:id/etOffer", offer)
    }

    override fun clickSendOffer() {
        waitAndClickAndroidElementByID("com.reposh.dev:id/btnSendOffer")
    }

    override fun clickContinue() {
        waitAndClickAndroidElementByID("com.reposh.dev:id/btn_next")
    }

    override fun assertBargainMessage() {
        compareStringNumbers(
                "com.reposh.dev:id/message_tv",
                "2500",
                "Предложения цены нет в торгах, либо текст изменен")
    }

    override fun waitCancelBargainBtn() {
        waitAndroidViewById("com.reposh.dev:id/btn_offer_cancel")
    }

    override fun clickCancelBargainBtn() {
        waitAndClickAndroidElementByID("com.reposh.dev:id/btn_offer_cancel")
    }

    override fun waitCancelBargainDialog() {
        waitANDROIDElementByTEXT("ЗАКРЫТЬ И ОТМЕНИТЬ")
    }

    override fun clickConfirmCancelBargain() {
        clickAndroidElementByText("ЗАКРЫТЬ И ОТМЕНИТЬ")
    }

    override fun assertErrorMessageLowPrice() {
        assertTemplateStringsById(
                "com.reposh.dev:id/errorTv",
                "Предложение не может быть меньше 300 рублей",
                "Похоже торг съел цену меньше 300, надо проверить"
        )
    }

    override fun assertErrorMessageHighPrice() {
        assertTemplateStringsById(
                "com.reposh.dev:id/errorTv",
                "Предложение не может превышать стоимость товара",
                "Похоже торг съел цену больше цены товара, надо проверить"
        )
    }
}