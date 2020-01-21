package Pages.AndroidPages.Toolbars;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.BottomToolbarInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BottomToolbar extends AndroidBaseClass implements BottomToolbarInterface {

    String tapeTABID = "com.reposh.dev:id/tab_feed";
    String searchTABID = "com.reposh.dev:id/tab_search";
    String sellTABID = "com.reposh.dev:id/tab_sell";
    String chatTABID = "com.reposh.dev:id/tab_chat";
    String profileTABID = "com.reposh.dev:id/tab_profile";

    public BottomToolbar(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickTape() { waitAndClickAndroidElementByID(tapeTABID);}

    public void clickSearch() { waitAndClickAndroidElementByID(searchTABID); }

    public void clickAddProduct() {waitAndClickAndroidElementByID(sellTABID);}

    public void clickNews() {waitAndClickAndroidElementByID(chatTABID);}

    public void clickProfile() {waitAndClickAndroidElementByID(profileTABID);}

    @Override
    public void waitTape() {
        isVisibleID(tapeTABID);
    }
}
