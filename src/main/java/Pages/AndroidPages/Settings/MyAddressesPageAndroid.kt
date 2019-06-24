package Pages.AndroidPages.Settings

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.MyAddressesInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidKeyCode

class MyAddressesPageAndroid(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), MyAddressesInterface {

    val addAddressBtnID = "com.reposh.dev:id/action_create_address"
    val regionFieldID = "com.reposh.dev:id/regionSV"
    val cityFieldID = "com.reposh.dev:id/citySV"
    val streetFieldID = "com.reposh.dev:id/streetSV"
    val houseFieldID = "com.reposh.dev:id/houseSV"
    val buildingFieldID = "com.reposh.dev:id/structureET"
    val stroenieFieldID = "com.reposh.dev:id/buildET"
    val flatFieldID = "com.reposh.dev:id/apartmentET"
    val commentFieldID = "com.reposh.dev:id/commentET"
    val saveBtnID = "com.reposh.dev:id/saveBtn"
    val switchID = "com.reposh.dev:id/boxSwitch"

    val regionShort = "Саратовская обл"
    val regionFullName = "Саратовская область"
    val cityShort = "Саратов"
    val cityFullName = "г Саратов"
    val streetShort = "Центральная"
    val streetFullName = "ул Центральная"
    val houseShort = "10"
    val houseFullName = "д10"
    val building = "1"
    val stroenie = "2"
    val flat = "1234"

    override fun clickAddAddress() {
        waitAndClickAndroidElementByID(addAddressBtnID)
    }

    override fun waitMyAddressesPage() {
        waitAndroidViewById(addAddressBtnID)
    }

    override fun waitAndClickRegionField() {
        waitAndClickAndroidElementByID(regionFieldID)
    }

    override fun waitAndClickCityField() {
        waitAndClickAndroidElementByID(cityFieldID)

    }

    override fun waitAndClickStreetField() {
        waitAndClickAndroidElementByID(streetFieldID)

    }

    override fun waitAndClickHouseField() {
        waitAndClickAndroidElementByID(houseFieldID)

    }

    override fun waitAndClickBuildingField() {
        waitAndClickAndroidElementByID(buildingFieldID)

    }

    override fun waitAndClickStroenieField() {
        waitAndClickAndroidElementByID(stroenieFieldID)

    }

    override fun waitAndClickFlatField() {
        waitAndClickAndroidElementByID(flatFieldID)

    }

    override fun setRegion() {
        sendKeysToAndroidElementWithID(regionFieldID, regionShort)
        clickEnter(AndroidKeyCode.ACTION_DOWN)
    }

    override fun swipeToTop() {
        swipeVerticalToElementWithText("Основной адрес")
    }

    override fun setCity() {
        sendKeysToAndroidElementWithID(cityFieldID, cityShort)
        clickEnter(AndroidKeyCode.ACTION_DOWN)

    }

    override fun setStreet() {
        sendKeysToAndroidElementWithID(streetFieldID, streetShort)
        clickEnter(AndroidKeyCode.ACTION_DOWN)
    }

    override fun setHouse() {
        sendKeysToAndroidElementWithID(houseFieldID, houseShort)
        clickEnter(AndroidKeyCode.ACTION_DOWN)
    }

    override fun setBuilding() {
        sendKeysToAndroidElementWithID(buildingFieldID, building)
    }

    override fun setStroenie() {
        sendKeysToAndroidElementWithID(stroenieFieldID, stroenie)
    }

    override fun setFlat() {
        sendKeysToAndroidElementWithID(flatFieldID, flat)
    }

    override fun setComment() {
        val comment = "Тестовый коментарий"
        sendKeysToAndroidElementWithID(commentFieldID, comment)
    }

    override fun clickConfirm() {
        waitAndClickAndroidElementByID(saveBtnID)
    }

    override fun assertThatAddressAdded() {
        val waitingAddress = "$streetShort, $houseShort, $stroenie, $building, $cityShort, $regionFullName"
        val addedAddress = getTextFromElementWithIdAndInstance("com.reposh.dev:id/tv_address", 0)
        assertTemplateStringsByIdAndInstance(
               "com.reposh.dev:id/tv_address",
                0,
                waitingAddress,
                " Ожидаем $waitingAddress " + "\n" +
                                "Приходит $addedAddress"
        )
    }

    override fun clickBySwitch() {
        waitAndClickAndroidElementByID(switchID)
    }
}



