package Pages.AndroidPages.LoginAndRegistration;


import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.SignUpBrandsInterface;
import io.appium.java_client.AppiumDriver;

public class SignUpBrandsScreen extends AndroidBaseClass implements SignUpBrandsInterface {

    private String firstBrendID = "com.reposh.dev:id/iv_brand";
    private String nextID = "com.reposh.dev:id/btn_next";
    private String skipID = "com.reposh.dev:id/btn_miss";

    public SignUpBrandsScreen(AppiumDriver driver) {
        super(driver);
    }

    public void waitBrandsPage() {
        waitAndClickAndroidElementByID(skipID);
    }

    public void chooseFirstBrand() {
        waitAndroidViewByIdAndInstance(firstBrendID, 0);
        clickAndroidElementByIDAndInstance(firstBrendID, 0);
    }

    public void clickNext() {
        waitAndClickAndroidElementByID(nextID);
    }

    public void clickSkip() {waitAndClickAndroidElementByID(skipID);}

}
