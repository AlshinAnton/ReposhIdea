package Test.AndroidTests.SearchTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.jupiter.api.Test

class ClearSearchHistoryTest : BaseTestClass() {

    @Test
    fun clearSearchHistoryInTOP() {
        preConditions()
        searchPageInterface.setTextToTOPSearchField()
        searchPageInterface.clickSearch()
        searchPageInterface.clickByHeadPhonesProduct()
        searchPageInterface.clickBack()
        searchPageInterface.clickBack()
        searchPageInterface.clickBack()
        searchPageInterface.waitAndClickSearchIconTop()
        searchPageInterface.clearSearchHistory()
    }

    @Test
    fun clearSearchHistoryInCategory() {
        preConditions()
        searchPageInterface.clickCategory()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setTextToCATEGORYSearchField()
        searchPageInterface.clickSearch()
        searchPageInterface.clickBack()
        searchPageInterface.clickBack()
        searchPageInterface.waitAndClickSearchIconTop()
        searchPageInterface.clickCategory()
        searchPageInterface.clearSearchHistory()
    }

    @Test
    fun clearSearchHistoryInBrands() {
        preConditions()
        searchPageInterface.clickBrands()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setTextToBrandsSearchField()
        searchPageInterface.clickByAdamex()
        searchPageInterface.clickBack()
        searchPageInterface.clickBack()
        searchPageInterface.waitAndClickSearchIconTop()
        searchPageInterface.clickBrands()
        searchPageInterface.clearSearchHistory()
    }

    @Test
    fun clearSearchHistoryInPeople() {
        preConditions()
        searchPageInterface.clickPeople()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setTextToPEOPLESearchField()
        searchPageInterface.hideKeyboard()
        searchPageInterface.swipeAndClickByTester()
        searchPageInterface.clickBack()
        searchPageInterface.clickBack()
        searchPageInterface.clickBack()
        searchPageInterface.waitAndClickSearchIconTop()
        searchPageInterface.clickPeople()
        searchPageInterface.clearSearchHistory()
    }

    private fun preConditions() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User9())
        tapeInterface.closeTooltips()
        //bottomToolbarInterface.clickSearch()
        searchPageInterface.waitAndClickSearchIconTop()
    }
}
