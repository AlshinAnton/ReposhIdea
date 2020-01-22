package Pages.IOSPages;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.SearchPageInterface;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchPageIOS extends IOSBaseClass implements SearchPageInterface {

    public SearchPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private String searchFieldID = "";
    private String clearSearchButtonID = "";
    private String clearSearchButtonBrandsID = "";
    private String searchHistoryResultID = "";
    private String searchedBrandID = "Adamex";
    private String searchedPeopleID = "com.reposh.dev:id/tv_username";

    @Override
    public void clickTop() {

    }

    @Override
    public void clickCategory() {

    }

    @Override
    public void clickBrands() {

    }

    @Override
    public void clickPeople() {

    }

    @Override
    public void waitAndClickSearchIconTop() {

    }

    @Override
    public void waitAndClickSearchPageCategory() {

    }

    @Override
    public void waitAndClickSearchPageBrands() {

    }

    @Override
    public void waitAndClickSearchPagePeople() {

    }

    @Override
    public void waitAndClickSearchField() {

    }

    @Override
    public void setTextToTOPSearchField() {

    }

    @Override
    public void clickSearch() {

    }

    @Override
    public void clickBack() {

    }

    @Override
    public void clearSearchHistory() {

    }

    @Override
    public void setTextToCATEGORYSearchField() {

    }

    @Override
    public void setTextToBrandsSearchField() {

    }

    @Override
    public void setTextToPEOPLESearchField() {

    }

    @Override
    public void clickByAdamex() {

    }

    @Override
    public void clearSearchHistoryBrands() {

    }

    @Override
    public void hideKeyboard() {

    }

    @Override
    public void swipeAndClickByTester() {

    }

    @Override
    public void setTextForSearchTester() {

    }

    @Override
    public void setTextForSearchHeadPhones() {

    }

    @Override
    public void clickByHeadPhonesProduct() {

    }

    @Override
    public void clickEnterIOS() {

    }

    @Override
    public void clickEnter() {

    }

    @Override
    public void confirmSearch() {

    }

    @Override
    public void chooseFirstItem() {

    }

    @Override
    public void setDeliveryQueryText() {

    }

    @Override
    public void choseDpdCourierQuery() {

    }

    @Override
    public void choosePostamatQuery() {

    }

    @Override
    public void setTextToSearchField(@NotNull String searchQuery) {

    }

    @Override
    public void clickByNeededSearchQuery(@NotNull String searchResult) {

    }

    @Override
    public void chooseRussianPost() {

    }
}
