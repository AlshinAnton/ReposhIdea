package Pages.AndroidPages.Checkout

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.CheckoutInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

class CheckoutPageScreen (driver: AppiumDriver<*>) : AndroidBaseClass(driver), CheckoutInterface {
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    private val checkBoxId = "com.reposh.dev:id/checkbox"
    private val payBtnID = "com.reposh.dev:id/actionButton"
    private val choosePostamatAddressID = "com.reposh.dev:id/addressBigTitledTextWidget"

    override fun waitCityField() {
        waitANDROIDElementByTEXT("Город")
    }

    override fun clickByCityField() {
        clickAndroidElementByText("Город")
    }

    override fun chooseCourier() {
        waitAndroidViewByIdAndInstance(checkBoxId, 0)
        clickAndroidElementByIDAndInstance(checkBoxId, 0)
    }

    override fun choosePostamat() {
        waitAndroidViewByIdAndInstance(checkBoxId, 1)
        clickAndroidElementByIDAndInstance(checkBoxId, 1)
    }

    override fun chooseRussainPost() {
        waitAndroidViewByIdAndInstance(checkBoxId, 0)
        clickAndroidElementByIDAndInstance(checkBoxId, 0)
    }

    override fun waitaddressField() {
        isVisibleID("com.reposh.dev:id/addressTV")
    }

    override fun chooseAnotherAddress() {
        clickAndroidElementByText("Выбрать другой адрес")
    }

    override fun choosePostamatAddress() {
        waitAndClickAndroidElementByID(choosePostamatAddressID)
    }

    override fun clickByNameField() {
        swipeVerticalToElementWithText("Имя")
        clickAndroidElementByText("Имя")
    }

    override fun enterName() {
        sendKeysToActiveElement("Иван")
    }

    override fun deleteName() {
        clickByNameField()

    }

    override fun enterLastName() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByLastNameField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteLastName() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun enterPhone() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByPhoneField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deletePhone() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByEmailField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun enterEmail() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteEmail() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertEmptyNameError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertEmptyLastNameError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertEmptyPhoneError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertEmptyEmailError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipetoClickPayBtn() {
        swipeVerticalToElementWithText("Оплатить")
    }

    override fun clickPayBtn() {
        waitAndClickAndroidElementByID(payBtnID)
    }

    override fun assertItemPrice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertDeliveryPrice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertTotalPrice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}