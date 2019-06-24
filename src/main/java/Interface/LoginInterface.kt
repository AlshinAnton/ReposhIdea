package Interface

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

    fun loginAsTester9()
    fun loginAsTester8()
    fun loginAsTester7()
    fun loginAsTester1()
    fun waitErrorCode()
    fun assertErrorCode()
}

interface OnboardingInterface {
    fun allowNotifications()
    fun waitThenCloseOnBoardingPage()
}