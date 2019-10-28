package Interface

interface MyAddressesInterface {

    fun swipeToTop()

    fun waitMyAddressesPage()
    fun clickAddAddress()
    fun clickConfirm()
    fun waitAndClickRegionField()
    fun waitAndClickCityField()
    fun waitAndClickStreetField()
    fun waitAndClickHouseField()
    fun waitAndClickBuildingField()
    fun waitAndClickStroenieField()
    fun waitAndClickFlatField()
    fun setRegion()
    fun setCity()
    fun setStreet()
    fun setHouse()
    fun setBuilding()
    fun setStroenie()
    fun setFlat()
    fun setComment()

    fun clickBySwitch()


    fun assertThatAddressAdded()

}