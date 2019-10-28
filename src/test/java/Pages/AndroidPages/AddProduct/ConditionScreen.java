package Pages.AndroidPages.AddProduct;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.ConditionInterface;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ConditionScreen extends AndroidBaseClass implements ConditionInterface {

    public ConditionScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private String newCondition = "com.reposh.dev:id/title";

    @Override
    public void clickNew() {
        waitAndroidViewByIdAndInstance(newCondition, 1);
        clickAndroidElementByIDAndInstance(newCondition, 1);
    }

    @Override
    public void clickNewWithoutTag() {

    }

    @Override
    public void clickGoodCondition() {

    }

    @Override
    public void clickMiddleCondition() {

    }

    @Override
    public void clickBadCondition() {

    }
}
