package Test.AndroidTests.SearchTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User

import org.junit.Test

import java.lang.Thread.sleep

class ClearSearchHistoryTest : BaseTestClass() {

    /*@Test
    public void clearSearchHistoryInTOP() throws InterruptedException {
        preConditions();
        Thread.sleep(500);
        searchPageInterface.setTextToTOPSearchField();
        searchPageInterface.clickSearch();
        Thread.sleep(1000);
        //searchPageInterface.confirmSearch();
        searchPageInterface.clickBack();
        searchPageInterface.waitAndClickSearchIconTop();
        searchPageInterface.clearSearchHistory();
    }*/


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
        searchPageInterface.clearSearchHistory()
    }

    @Test
    fun clearSearchHistoryInBrands() {
        preConditions()
        searchPageInterface.clickBrends()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setTextToBrandsSearchField()
        searchPageInterface.clickByAdamex()
    }

    @Test
    fun clearSearchHistoryInPeople() {
        preConditions()
        print("R1-255 - AND: Проверять на уникальность/помеченность пользователя при переходя в профиль из поиска")
        searchPageInterface.clickPeople()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setTextToPEOPLESearchField()
        searchPageInterface.hideKeyboard()
        searchPageInterface.swipeAndClickByTester()
        searchPageInterface.clickBack()
        try {
            Thread.sleep(500)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        searchPageInterface.clickBack()
        searchPageInterface.waitAndClickSearchIconTop()
        searchPageInterface.clickPeople()
        searchPageInterface.clearSearchHistory()
    }

    private fun preConditions() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User9())
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickSearch()
        try {
            sleep(3000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        searchPageInterface.waitAndClickSearchIconTop()
        try {
            sleep(1000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

    }
}
