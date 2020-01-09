package Pages.AndroidPages.Checkout

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.CheckoutPaymentInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

class CheckoutPaymentScreen (driver: AppiumDriver<*>) : AndroidBaseClass(driver), CheckoutPaymentInterface {
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    val cardNumberFieldID = "pan"
    val dateFieldID = "expDate"
    val cVcFieldID = "card_cvc"
    val receiveMailCheckBoxID = "email"
    val paymentSabmitBtnID = "form-submit"

    val cardNumberFieldText = "Номер карты"
    val dateFieldText = "Срок"
    val cVcFieldIText = "Код"
    val confirmPaymentBtnText = "Оплатить"

    val cardNumber = "4300000000000777"
    val expDate = "11/22"
    val cvc = "123"
    val email = "Alshin@reposh.com"


    override fun assertPrice() {

    }

    override fun waitPaymentScreen() {
        waitANDROIDElementByTEXT("Оплата")
    }

    override fun enterCardNumber() {
        sendKeysToAndroidElementWithID(cardNumberFieldID, cardNumber)
    }

    override fun enterDate() {
        clickAndroidElementByText(dateFieldText)
        sendKeysToAndroidElementWithID(dateFieldID, expDate)
    }

    override fun enterCVC() {
        clickAndroidElementByText(cVcFieldIText)
        sendKeysToAndroidElementWithID(cVcFieldID, cvc)
    }

    override fun clickMailReceiveCheckBox() {
        waitAndClickAndroidElementByID(receiveMailCheckBoxID)
    }

    override fun swipeToPayBtn() {
        swipeVerticalToElementWithText(confirmPaymentBtnText)
    }

    override fun clickPayBtn() {
        clickAndroidElementByText(confirmPaymentBtnText)
    }


    override fun setCardData() {
        enterCardNumber()
        enterDate()
        enterCVC()
        hideKeyboard()
    }


}
