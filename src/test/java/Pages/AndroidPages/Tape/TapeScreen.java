package Pages.AndroidPages.Tape;


import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.TapeInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TapeScreen extends AndroidBaseClass implements TapeInterface {


    private String searchID = "com.reposh.dev:id/et_search";

    private String tooltipID = "com.reposh.dev:id/tooltipText";
    private String searchIconID = "com.reposh.dev:id/buttonSearch";

    public TapeScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitSearchField() {
        waitAndClickAndroidElementByID(searchID);
    }

    @Override
    public void clickBySearchField() {
        waitAndClickAndroidElementByID(searchID);
    }

    @Override
    public void sendTESTEToSearch() {
        String searchIDLocal = "com.reposh.dev:id/et_search";
        sendKeysToAndroidElementByIDAndInstance(searchIDLocal, 0, "teste");
    }

    @Override
    public void clickSearch() {
        clickEnter(AndroidKeyCode.KEYCODE_ENTER);
    }

    @Override
    public void switchToSellers() {
        swipeToRight(0.9,0.1,0.6);
    }

    @Override
    public void clickTESTE() {
        clickAndroidElementByText("teste");    }

    @Override
    public boolean waitSortIcon() {
        waitAndroidViewById("com.reposh.dev:id/bt_sort");
        return false;
    }

    @Override
    public void closeTooltips() {
        for (int i = 0; i <3; i++) {
            try {
                waitAndClickAndroidElementByID(tooltipID);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean tapeScreenIsVisible() {
        return waitSortIcon();
    }

    @Override
    public void clickSearchIcon() {
        waitAndClickAndroidElementByID(searchIconID);
    }
}
