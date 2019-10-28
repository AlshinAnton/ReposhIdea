package Interface

interface SignUpInterface {

    fun waitEmailField()
    fun fillEmail()
    fun fillNickName()
    fun fillPassword()
    fun fillName()
    fun fillLastName()
    fun clickRegistration()

    fun setWrongEmail()
    fun setWrongNickName()
    fun setShortPassword()
    fun setPasswordWithoutNum()
    fun setWrongName()
    fun setUsedNickName()

    fun waitWrongEmailMessageField()
    fun waitWrongNickNameMessageField()
    fun waitNONNumericPasswordField()
    fun waitWrongNameField()
    fun waitUsedNickNameMessageField()
    fun waitShortPasswordMessageField()

    fun assertWrongEmailMessage()
    fun assertWrongNickNameMessage()
    fun assertShortPasswordMessage()
    fun assertNoNumbersPasswordMessage()
    fun assertWrongNameMessage()
    fun assertUsedNickNameMessage()
    fun hideKeyboard()
}

interface SignUpAvatarInterface {
    fun waitAddPhotoPage()
    fun waitMakePhotoFragment()
    fun clickAddPhoto()
    fun clickSkipPage()
    fun clickNext()
    fun choosePhotoFromGalery()
    fun makePhoto()
    fun waitGallery()
    fun clickByFirstPhoto()
    fun confirmChoosingPhoto()
}

interface SignUpGeoInterface {
    fun waitSearchField()
    fun clickSkip()
    fun clickNext()
}

interface SignUpFriendsInterface {
    fun clickSkip()
    fun clickNext()
}

interface SignUpBrandsInterface {
    fun waitBrandsPage()
    fun chooseFirstBrand()
    fun clickNext()
    fun clickSkip()
}