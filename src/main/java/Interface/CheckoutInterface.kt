package Interface
interface CheckoutInterface {

    fun waitCityField()
    fun clickByCityField()
    fun chooseCourier()
    fun choosePostamat()
    fun waitaddressField()
    fun chooseAnotherAddress()
    fun clickByNameField()
    fun enterName()
    fun deleteName()
    fun enterLastName()
    fun clickByLastNameField()
    fun deleteLastName()
    fun enterPhone()
    fun clickByPhoneField()
    fun deletePhone()
    fun clickByEmailField()
    fun enterEmail()
    fun deleteEmail()

    fun assertEmptyNameError()
    fun assertEmptyLastNameError()
    fun assertEmptyPhoneError()
    fun assertEmptyEmailError()
    fun swipetoClickPayBtn()
    fun clickPayBtn()


    fun assertItemPrice()
    fun assertDeliveryPrice()
    fun assertTotalPrice()
}

interface CheckoutOrderInterface {

    fun waitOrderScreen()

    fun assertOrderNumber()
    fun assertDeliveryTipe()

    fun swipeToPaymentDetails()
    fun assertProductPrice()
    fun assertDeliveryPrice()
    fun assertTotalPrice()

    fun swipeToCancelOrder()
    fun clickCancelOrder()

    fun waitStatus()
    fun assertStatus()

    fun clickBySellerInfo()
    fun clickByProductInfo()
}

interface CheckoutPaymentConfirmationInterface {
    fun waitConfirmationText()

    fun waitContinueShoppingBtn()
    fun clickContinueShoppingBtn()

    fun waitCheckOrderBtn()
    fun clickCheckOrderBtn()
}

interface CheckoutPaymentInterface {
    fun assertPrice()
    fun waitPaymentScreen()
    fun enterCardNumber()
    fun enterMonthExpire()
    fun enterYearExpire()
    fun enterCVC()
    fun clickMailReceiveCheckBox()
    fun swipeToPayBtn()
    fun clickPayBtn()
    fun setCardData()
}

interface CancelOrderScreenInterface {
    fun waitCancelOrderScreen()
    fun clickByFirstReason()
    fun swipeToComment()
    fun addComment()
    fun swipeToCancelOrder()
    fun clickByCancelOrder()
}

