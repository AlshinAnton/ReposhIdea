package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.EditProfileInterface
import io.appium.java_client.AppiumDriver

class EditProfileScreen(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), EditProfileInterface {

    private val avatarID = "com.reposh.dev:id/ivAvatar"
    private val backgroundImageID = "com.reposh.dev:id/ivCover"


    override fun waitEditProfilePage() {
        waitAndroidViewById(avatarID)
    }

    override fun clickByAvatar() {
        waitAndClickAndroidElementByID(avatarID)
    }

    override fun clickByBackgroundImage() {
        waitAndClickAndroidElementByID(backgroundImageID)
    }

    override fun waitChangeImageDialog() {
        waitANDROIDElementByTEXT("Открыть")
    }

    override fun clickOpenimage() {
        clickAndroidElementByText("Открыть")
    }

    override fun waitCloseImageIcon() {
        waitAndroidViewById("com.reposh.dev:id/btnClose")
    }

    override fun clickCloseImageIcon() {
        waitAndClickAndroidElementByID("com.reposh.dev:id/btnClose")
    }

    override fun clickChangeimage() {
        clickAndroidElementByText("Изменить")
    }

    override fun waitCameraOrGalleryDialog() {
        waitANDROIDElementByTEXT("Сделать фотографию")
    }

    override fun closeCameraOrGalleryDialog() {
        waitAndClickAndroidElementByID("com.reposh.dev:id/btnClose")
    }

    override fun clickDeleteImage() {

    }

    override fun assertLoginName() {
        assertTemplateStringsById(
                "com.reposh.dev:id/etUsername",
                "Tester",
                "Логин не совпадает с Tester")
    }

    override fun assertName() {
        assertTemplateStringsById(
                "com.reposh.dev:id/etFirstName",
                "Toni",
                "Имя не совпадает с Toni"
        )
    }

    override fun swipeToPhoneNumber() {
        swipeVerticalToElementWithText("Телефон")
    }

    override fun swipeToEmail() {
        swipeVerticalToElementWithText("Email")
    }

    override fun swipeToChangePassword() {
        swipeVerticalToElementWithText("Изменить пароль")
    }

    override fun assertPhoneNumber() {
        assertTemplateStringsById(
                "com.reposh.dev:id/etPhone",
                "+7 (123) 123 45 67",
                "Номер не совпадает с +7 (123) 123 45 67"
        )
    }

    override fun assertEmail() {
        assertTemplateStringsById(
                "com.reposh.dev:id/etEmail",
                "Alshinanton@gmail.com",
                "eMail не совпадает с Alshinanton@gmail.com"
        )
    }

    override fun clickChangePassword() {
        clickAndroidElementByText("Изменить пароль")
    }
}