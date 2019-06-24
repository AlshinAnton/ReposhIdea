package Pages.AndroidPages.Checkout

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.CheckoutPaymentInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

class CheckoutPaymentPageAndroid (driver: AppiumDriver<*>) : AndroidBaseClass(driver), CheckoutPaymentInterface {
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    val cardNumberFieldID = "form-card-number-input"
    val monthFieldID = "form-month-input"
    val yearFieldID = "form-year-input"
    val cVcFieldID = "form-cvc-input"
    val receiveMailCheckBoxID = "form-sendmail-checkbox"
    val paymentSabmitBtnID = "form-submit"



    override fun assertPrice() {

    }

    override fun waitPaymentScreen() {
        waitANDROIDElementByTEXT("Оплата")
    }

    override fun enterCardNumber() {
        sendKeysToAndroidElementWithID(cardNumberFieldID, "4300000000000777")
    }

    override fun enterMonthExpire() {
        clickAndroidElementByText("Месяц")
        sendKeysToAndroidElementWithID(monthFieldID, "11")
    }

    override fun enterYearExpire() {
        clickAndroidElementByText("Год")
        sendKeysToAndroidElementWithID(yearFieldID, "22")
    }

    override fun enterCVC() {
        clickAndroidElementByText("CVV/CVC")
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
        enterMonthExpire()
        enterYearExpire()
        enterCVC()
        hideKeyboard()
    }


}
