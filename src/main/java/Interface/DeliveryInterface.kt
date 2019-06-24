package Interface

interface DeliveryInterface {

    fun waitDeliveryScreen()

    fun clickConfirm()
    fun clickDpdСourier()
    fun clickChooseRateCourier()
    fun waitChooseRateScreen()

    fun chooseRateMINI()
    fun chooseRateCLASSIC()
    fun chooseRateMAX()
    fun chooseRateSUPERMAX()

    fun clickChooseAddressCourier()
    fun waitChooseAddressCourierScreen()
    fun chooseMainAddress()

    fun switchPackToBox()

    fun chooseCourierDpd()


    fun clickDpdPostamat()
    fun clickChooseRatePostamat()
    fun clickChooseAdressPostamat()

    fun choosePostamatAddress()

    fun waitChooseAddressPostamatScreen()
}
