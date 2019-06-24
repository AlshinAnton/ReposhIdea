package Test.IOSTests.SearchTests;

import AppiumSupport.BaseTestClass;

public class ClearSearchHistoryTestIOS extends BaseTestClass {

    // не реализовано , так как не добавлены id . просто скопировано с андроида, сначала надо добавить методы в SearchPageIOS


   /* @Test
    public void clearSearchHistoryInTOP() throws InterruptedException {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.enterEmail();
        loginInterface.enterPassword();
        loginInterface.clickReceiveCodeBtn();
        bottomToolbarInterface.clickSearch();
        searchPageInterface.waitAndClickSearchField();
        searchPageInterface.setTextToTOPSearchField();
        searchPageInterface.clickSearch();
        Thread.sleep(1000);
        searchPageInterface.clickBack();
        searchPageInterface.clearSearchHistory();
        System.out.println("Поиск и удаление из недавних в Search (ТОП) зашло нормально");
    }


    @Test
    public void clearSearchHistoryInCategory() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.enterEmail();
        loginInterface.enterPassword();
        loginInterface.clickReceiveCodeBtn();
        bottomToolbarInterface.clickSearch();
        searchPageInterface.clickCategory();
        searchPageInterface.waitAndClickSearchField();
        searchPageInterface.setTextToCATEGORYSearchField();
        searchPageInterface.clickSearch();
        searchPageInterface.clickBack();
        searchPageInterface.clearSearchHistory();
        System.out.println("Поиск и удаление из недавних в Search (Категории) все чики пуки");
    }

    @Test
    public void clearSearchHistoryInBrands() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.enterEmail();
        loginInterface.enterPassword();
        loginInterface.clickReceiveCodeBtn();
        bottomToolbarInterface.clickSearch();
        searchPageInterface.clickBrands();
        searchPageInterface.waitAndClickSearchField();
        searchPageInterface.setTextToBrandsSearchField();
        searchPageInterface.clickByAdamex();
        searchPageInterface.clickBack();
        searchPageInterface.clearSearchHistoryBrands();
        System.out.println("Поиск и удаление из недавних в Search (Бренды) и тут все норм");
    }*/

/*    @Test
    public void clearSearchHistoryInPeople() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.enterEmail();
        loginInterface.enterPassword();
        loginInterface.clickReceiveCodeBtn();
        bottomToolbarInterface.clickSearch();
        searchPageInterface.clickPeople();
        searchPageInterface.waitAndClickSearchField();
        searchPageInterface.setTextToPEOPLESearchField();
        searchPageInterface.hideKeyboard();
        searchPageInterface.swipeAndClickByTester();
        searchPageInterface.clickBack();
        searchPageInterface.clearSearchHistory();
        System.out.println("Поиск и удаление из недавних в Search (Люди) как ни странно, но здесь тоже все норм");
    }*/

}
