package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.SettingsInterface
import org.openqa.selenium.support.PageFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidKeyCode
import io.appium.java_client.pagefactory.AppiumFieldDecorator

class SettingsPageAndroid(driver: AppiumDriver<*>) : AndroidBaseClass(driver), SettingsInterface {

    private val logOutTextTxt = "Выйти из аккаунта"
    private val mySizesTxt = "Мои размеры"
    private val editProfileTxt = "Редактировать профиль"
    private val myAdressessTxt = "Мои адреса"

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    override fun clickByEditProfile() {
        clickAndroidElementByText(editProfileTxt)
    }

    override fun clickLogOut() {
        waitAndClickAndroidElementByText(logOutTextTxt)
    }

    override fun swipeToLogOut() {
        swipeVerticalToElementWithTextAndClick(logOutTextTxt)
    }

    override fun swipeToMyAddressess() {
        swipeVerticalToElementWithText(myAdressessTxt)
    }
    override fun clickMyAddressess() {
        clickAndroidElementByText(myAdressessTxt)
    }

    override fun clickByMySizes() {
        clickAndroidElementByText(mySizesTxt)
    }

    override fun swipeToMySizes() {
        swipeVerticalToElementWithText(mySizesTxt)
    }

    override fun back() {
        clickEnter(AndroidKeyCode.BACK)
    }

    override fun swipeToNotifications() {

    }

    override fun clickByNotifications() {

    }

    override fun swipeToBlackList() {

    }

    override fun clickByBlackList() {

    }
}
