package Test.AndroidTests.SearchTests;

import AppiumSupport.BaseTestClass;

import org.junit.Test;

import static java.lang.Thread.sleep;

public class ClearSearchHistoryTest extends BaseTestClass {

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
    public void clearSearchHistoryInCategory() {
        preConditions();
        searchPageInterface.clickCategory();
        searchPageInterface.waitAndClickSearchField();
        searchPageInterface.setTextToCATEGORYSearchField();
        searchPageInterface.clickSearch();
        searchPageInterface.clickBack();
        searchPageInterface.clickBack();
        searchPageInterface.waitAndClickSearchIconTop();
        searchPageInterface.clearSearchHistory();
    }

    @Test
    public void clearSearchHistoryInBrands() {
        preConditions();
        searchPageInterface.clickBrends();
        searchPageInterface.waitAndClickSearchField();
        searchPageInterface.setTextToBrandsSearchField();
        searchPageInterface.clickByAdamex();
    }

    @Test
    public void clearSearchHistoryInPeople() {
        preConditions();
        System.out.print("R1-255 - AND: Проверять на уникальность/помеченность пользователя при переходя в профиль из поиска");
        searchPageInterface.clickPeople();
        searchPageInterface.waitAndClickSearchField();
        searchPageInterface.setTextToPEOPLESearchField();
        searchPageInterface.hideKeyboard();
        searchPageInterface.swipeAndClickByTester();
        searchPageInterface.clickBack();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchPageInterface.clickBack();
        searchPageInterface.waitAndClickSearchIconTop();
        searchPageInterface.clickPeople();
        searchPageInterface.clearSearchHistory();
    }

    private void preConditions(){
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.loginAsTester9();
        tapeInterface.closeTooltips();
        bottomToolbarInterface.clickSearch();
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchPageInterface.waitAndClickSearchIconTop();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
