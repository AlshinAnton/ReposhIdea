package Pages.AndroidPages.Chat

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.BargainScreenInChatInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

class BargainTabInChat(driver: AppiumDriver<*>) : AndroidBaseClass(driver), BargainScreenInChatInterface {
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    val purchaseBtnId = "com.reposh.dev:id/filterByPurchaseBtn"
    val saleBtnId = "com.reposh.dev:id/filterBySaleBtn"
    val currentSwitchId = "com.reposh.dev:id/currentSwitch"

    val userIconId = "com.reposh.dev:id/userIV"
    val productIconId = "com.reposh.dev:id/productIV"

    val confirmStatus = "Вы договорились"
    val freezenStatus = "Торг заморожен"
    val waitSellerAnswerStatus = "Ожидает ответа продавца"
    val waitBuyerAnswerStatus = "Ожидает ответа покупателя"
    val closeBargainStatus = "Торги закрыты"



    override fun waitBargainScreen() {
        waitAndroidViewById(currentSwitchId)
    }

    override fun clickByAcceptedBargain() {
        swipeVerticalToElementWithTextAndClick(confirmStatus)
    }

    override fun clickByFrozenBargain() {
swipeVerticalToElementWithTextAndClick(freezenStatus)
    }

    override fun clickByWaitBuyerConfirmationBargain() {
        swipeVerticalToElementWithTextAndClick(waitBuyerAnswerStatus)
    }

    override fun clickByWaitSellerConfirmationBargain() {
        swipeVerticalToElementWithTextAndClick(waitSellerAnswerStatus)
    }

    override fun clickByClosedBargain() {
        swipeVerticalToElementWithTextAndClick(closeBargainStatus)
    }

    override fun clickByPurchaseFilterBtn() {
        waitAndClickAndroidElementByID(purchaseBtnId)
    }

    override fun clickBySellFilterBtn() {
        waitAndClickAndroidElementByID(saleBtnId)
    }

    override fun clickByCurrentSwitch() {
        waitAndClickAndroidElementByID(currentSwitchId)
    }

    override fun clickByUserIcon() {
        waitAndClickAndroidElementByID(userIconId)
    }

    override fun clickByProductIcon() {
        waitAndClickAndroidElementByID(productIconId)
    }
}