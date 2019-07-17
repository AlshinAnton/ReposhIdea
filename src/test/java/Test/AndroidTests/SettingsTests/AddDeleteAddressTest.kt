package Test.AndroidTests.SettingsTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.model.User
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
        loginInterface.login(User.User1())
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