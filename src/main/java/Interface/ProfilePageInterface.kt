package Interface

interface ProfilePageInterface {

    fun waitSettings()
    fun clickSettings()

    fun swipeToGuid()
    fun clickByGuide()

    fun waitTooltip()
    fun closeTooltip()

    fun waitSubscriptionsField()
    fun clickSubscriptionsField()

    fun waitSubscribersField()
    fun clickSubscribersField()

    fun swipeToEtiquette()
    fun clickByEtiquette()

    fun swipeToMyProducts()
    fun clickByMyProducts()

    fun swipeToMyPurchace()
    fun clickByMyPurchase()

    fun swipeToMySales()
    fun clickByMySales()

    fun swipeToLiked()
    fun clickLiked()

    fun swipeToInvitePeopleField()
    fun clickByInvitePeopleField()

    fun swipeToFindUsersField()
    fun clickByFindUsersField()

    fun swipeToAboutProjectField()
    fun clickAboutProjectField()

    fun swipeToContactsField()
    fun clickByContactsField()

    fun swipeToOfferField()
    fun clickByOfferField()

    fun back()

    fun waitSearchBtn()
    fun clickSearchBtn()

    fun waitSortBtn()
    fun clickSortBtb()

    fun waitFiltersBtn()
    fun clickFiltersBtn()
}

interface EditProfileInterface {
    fun waitEditProfilePage()
    fun clickByAvatar()
    fun clickByBackgroundImage()
    fun waitChangeImageDialog()
    fun clickOpenimage()
    fun waitCloseImageIcon()
    fun clickCloseImageIcon()
    fun clickChangeimage()
    fun waitCameraOrGalleryDialog()
    fun closeCameraOrGalleryDialog()
    fun clickDeleteImage()

    fun assertLoginName()
    fun assertName()
    fun swipeToPhoneNumber()
    fun swipeToEmail()
    fun swipeToChangePassword()
    fun assertPhoneNumber()
    fun assertEmail()
    fun clickChangePassword()
}