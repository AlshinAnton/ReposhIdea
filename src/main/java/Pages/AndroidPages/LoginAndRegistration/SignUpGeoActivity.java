package Pages.AndroidPages.LoginAndRegistration;


import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.SignUpGeoInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpGeoActivity extends AndroidBaseClass implements SignUpGeoInterface {

    public SignUpGeoActivity(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    private String searchFieldID = "com.reposh.dev:id/et_search";
    private String skipID = "com.reposh.dev:id/btn_miss";
    private String nextID = "com.reposh.dev:id/btn_next";


    @Override
    public void waitSearchField() {
        waitAndroidViewById(searchFieldID);
    }

    @Override
    public void clickSkip() {
        waitAndClickAndroidElementByID(skipID);
    }

    @Override
    public void clickNext() {
        waitAndClickAndroidElementByID(nextID);
    }
}
