package Interface

import Pages.AndroidPages.model.User

interface LoginInterface {
    fun enterPhoneNumber(phoneNum : String)
    fun enterIncorrectPhoneNumber()
    fun waitErrorPhoneFormat()
    fun assertErrorPhoneFormat()
    fun clickReceiveCodeBtn()

    fun waitCodeScreen()
    fun enterCode()
    fun enterIncorrectCode()
    fun clickConfirmCodeBtn()
    fun login(user: User)
    fun waitErrorCode()
    fun assertErrorCode()
}

interface OnboardingInterface {
    fun allowNotifications()
    fun waitThenCloseOnBoardingPage()
}