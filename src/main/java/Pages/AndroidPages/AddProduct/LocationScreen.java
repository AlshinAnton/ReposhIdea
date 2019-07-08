package Pages.AndroidPages.AddProduct;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.LocationInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LocationScreen extends AndroidBaseClass implements LocationInterface {

    private String doneButtonID = "com.reposh.dev:id/action_done";
    private String searchFieldID = "com.reposh.dev:id/et_search";

    public LocationScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    @Override
    public void waitLocationPage() {
        waitAndClickAndroidElementByText("Основной адрес");
    }

    @Override
    public void clickSearchField() {
        waitAndClickAndroidElementByID(searchFieldID);
    }

    @Override
    public void setLocation() {
        String someAddress = "enter adress here in Location activity";
        sendKeysToAndroidElementWithID(searchFieldID, someAddress);
    }

    @Override
    public void clickDone() {
        waitAndClickAndroidElementByID(doneButtonID);
    }

    @Override
    public void enterCity() {
        sendKeysToAndroidElementWithID(searchFieldID, "Мос");
    }

    @Override
    public void clickByFirstCity() {
        waitAndClickAndroidElementByText("Москва");
    }

    @Override
    public void waitSearchField() {
        waitAndroidViewById(searchFieldID);
    }
}
