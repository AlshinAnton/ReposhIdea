package Pages.IOSPages.AddProduct;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.SizeInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SizePageIOS extends IOSBaseClass implements SizeInterface {

    public SizePageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitConfirmButton() {

    }

    @Override
    public void clickConfirmButton() {

    }

    @Override
    public void switchToMultiSize() {

    }

    @Override
    public void clickFirstSize() {

    }

    @Override
    public void clickSecondSize() {

    }

    @Override
    public void clickThirdSize() {

    }

    @Override
    public void clickForthSize() {

    }

    @Override
    public void clickFifthSize() {

    }

    @Override
    public void waitSizeCount() {

    }

    @Override
    public void chooseSizeCount() {

    }

    @Override
    public void chooseOneSize() {
        waitConfirmButton();
        clickFirstSize();
        clickConfirmButton();
    }

    @Override
    public void chooseMultiSize() {
        waitConfirmButton();
        switchToMultiSize();
        clickFirstSize();
        waitSizeCount();
        chooseSizeCount();
        clickSecondSize();
        waitSizeCount();
        chooseSizeCount();
        clickThirdSize();
        waitSizeCount();
        chooseSizeCount();
        clickForthSize();
        waitSizeCount();
        chooseSizeCount();
        clickFifthSize();
        waitSizeCount();
        chooseSizeCount();
        clickConfirmButton();
    }
}
