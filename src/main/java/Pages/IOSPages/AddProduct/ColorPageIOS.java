package Pages.IOSPages.AddProduct;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.ColorInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ColorPageIOS extends IOSBaseClass implements ColorInterface {
    public ColorPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitColorPage() {

    }

    @Override
    public void chooseWhiteAndBlack() {

    }

    @Override
    public void clickConfirm() {

    }
}
