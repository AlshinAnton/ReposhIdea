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



    override fun assertPrice() {

    }

    override fun waitPaymentScreen() {
        waitANDROIDElementByTEXT("Оплата")
    }

    override fun enterCardNumber() {
        sendKeysToAndroidElementWithID(cardNumberFieldID, "4300000000000777")
    }

    override fun enterDate() {
        clickAndroidElementByText("Дата")
        sendKeysToAndroidElementWithID(dateFieldID, "11/22")
    }

    override fun enterCVC() {
        clickAndroidElementByText("Код")
        sendKeysToAndroidElementWithID(cVcFieldID, "123")
    }

    override fun clickMailReceiveCheckBox() {
        waitAndClickAndroidElementByID(receiveMailCheckBoxID)
    }

    override fun swipeToPayBtn() {
        swipeVerticalToElementWithText("Оплатить")
    }

    override fun clickPayBtn() {
        clickAndroidElementByText("Оплатить")
    }


    override fun setCardData() {
        enterCardNumber()
        enterDate()
        enterCVC()
        hideKeyboard()
    }


}
