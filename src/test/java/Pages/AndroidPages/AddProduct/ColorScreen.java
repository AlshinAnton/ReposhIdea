package Pages.AndroidPages.AddProduct;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.ColorInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ColorScreen extends AndroidBaseClass implements ColorInterface {
    public ColorScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private String checkBoxID = "com.reposh.dev:id/checkbox";
    private String colorFieldID = "com.reposh.dev:id/title";
    private String doneID = "com.reposh.dev:id/action_apply";

    @Override
    public void waitColorPage() {
        isVisibleID(colorFieldID);
    }

    @Override
    public void chooseWhiteAndBlack() {
        waitAndroidViewByIdAndInstance(colorFieldID, 2);
        clickAndroidElementByIDAndInstance(colorFieldID, 4);
    }

    @Override
    public void clickConfirm() {
        waitAndClickAndroidElementByID(doneID);
    }
}
