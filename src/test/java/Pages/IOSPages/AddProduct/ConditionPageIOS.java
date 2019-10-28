package Pages.IOSPages.AddProduct;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.ConditionInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ConditionPageIOS extends IOSBaseClass implements ConditionInterface {

    public ConditionPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void clickNew() {

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
