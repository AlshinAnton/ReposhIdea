package Test.AndroidTests.SettingsTests

import AppiumSupport.BaseTestClass

class EditProfileTests : BaseTestClass() {

    /*@Test
    fun openAndChangeAvatarTest() {
        preCondition()
        editProfileInterface.clickByAvatar()
        editProfileInterface.waitChangeImageDialog()
        editProfileInterface.clickOpenimage()
        editProfileInterface.waitCloseImageIcon()
        editProfileInterface.clickCloseImageIcon()
        editProfileInterface.waitEditProfilePage()
        editProfileInterface.clickByAvatar()
        editProfileInterface.waitChangeImageDialog()
        editProfileInterface.clickChangeimage()
        editProfileInterface.waitCameraOrGalleryDialog()
        editProfileInterface.clickCloseImageIcon()
    }



    @Test
    fun openAndChangeBackgroundImageTest() {
        preCondition()
        editProfileInterface.clickByBackgroundImage()
        editProfileInterface.waitChangeImageDialog()
        editProfileInterface.clickOpenimage()
        editProfileInterface.waitCloseImageIcon()
        editProfileInterface.clickCloseImageIcon()
        editProfileInterface.waitEditProfilePage()
        editProfileInterface.clickByBackgroundImage()
        editProfileInterface.waitChangeImageDialog()
        editProfileInterface.clickChangeimage()
        editProfileInterface.waitCameraOrGalleryDialog()
        editProfileInterface.clickCloseImageIcon()
    }*/

    /*@Test
    fun checkFieldsInEditProfileTest() {
        preCondition()
        editProfileInterface.assertLoginName()
        editProfileInterface.assertName()
        editProfileInterface.swipeToPhoneNumber()
        editProfileInterface.assertPhoneNumber()
        editProfileInterface.swipeToEmail()
        editProfileInterface.assertEmail()
    }*/



    private fun preCondition() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        bottomToolbarInterface.clickProfile()
        settingsInterface.clickByEditProfile()
        editProfileInterface.waitEditProfilePage()
    }
}