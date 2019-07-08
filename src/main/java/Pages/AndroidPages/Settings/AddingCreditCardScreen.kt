package Pages.AndroidPages.Settings


import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.AddingCardInterface
import io.appium.java_client.AppiumDriver

class AddingCreditCardScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), AddingCardInterface {
    override fun waitAddingBankCardScreen() {
        waitAndroidViewById("com.reposh.dev:id/tv_card_number_empty")
    }

    override fun waitFieldCardNumber() {
        waitAndroidViewById("com.reposh.dev:id/et_card_number")
    }

    override fun waitFieldValidityCard() {
        waitAndroidViewById("com.reposh.dev:id/et_valid_through")
    }

    override fun waitFieldCardOwner() {
        waitAndroidViewById("com.reposh.dev:id/et_cardholder")
    }

    override fun waitFieldCVC() {
        waitAndroidViewById("com.reposh.dev:id/et_cvv")
    }

    override fun sendKeysToCardNumberField() {
        sendKeysToAndroidElementWithID("com.reposh.dev:id/et_card_number", "1234123412341234")
    }

    override fun sendKeysToValidityField() {
        sendKeysToAndroidElementWithID("com.reposh.dev:id/et_valid_through", "1219")
    }

    override fun sendKeysToOwnerField() {
        sendKeysToAndroidElementWithID("com.reposh.dev:id/et_cardholder", "Testerov Tester")
    }

    override fun sendKeysToCVCField() {
        sendKeysToAndroidElementWithID("com.reposh.dev:id/et_cvv", "123")
    }

    override fun clickSaveCard() {

    }
}