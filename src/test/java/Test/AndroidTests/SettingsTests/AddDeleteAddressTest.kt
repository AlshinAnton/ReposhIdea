package Test.AndroidTests.SettingsTests

import AppiumSupport.BaseTestClass
import org.junit.Test

class AddDeleteAddressTest : BaseTestClass() {

    @Test
    fun AddAddressTestWithAllField() {
        goToAddAddressForm()
        myAddressesInterface.clickBySwitch()
        myAddressesInterface.waitAndClickRegionField()
        myAddressesInterface.setRegion()
        myAddressesInterface.waitAndClickCityField()
        myAddressesInterface.setCity()
        myAddressesInterface.waitAndClickStreetField()
        myAddressesInterface.setStreet()
        myAddressesInterface.waitAndClickHouseField()
        myAddressesInterface.setHouse()
        myAddressesInterface.waitAndClickBuildingField()
        myAddressesInterface.setBuilding()
        myAddressesInterface.waitAndClickStroenieField()
        myAddressesInterface.setStroenie()
        myAddressesInterface.waitAndClickFlatField()
        myAddressesInterface.setFlat()
        myAddressesInterface.setComment()
        myAddressesInterface.clickConfirm()
        myAddressesInterface.waitMyAddressesPage()
        myAddressesInterface.assertThatAddressAdded()
    }

    private fun goToAddAddressForm() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        profilePageInterface.waitTooltip()
        profilePageInterface.closeTooltip()
        profilePageInterface.waitSettings()
        profilePageInterface.clickSettings()
        settingsInterface.swipeToMyAddressess()
        settingsInterface.clickMyAddressess()
        myAddressesInterface.clickAddAddress()
    }

}