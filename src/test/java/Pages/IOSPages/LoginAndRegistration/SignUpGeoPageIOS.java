package Pages.IOSPages.LoginAndRegistration;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.SignUpGeoInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SignUpGeoPageIOS extends IOSBaseClass implements SignUpGeoInterface {
    public SignUpGeoPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitSearchField() {

    }

    @Override
    public void clickSkip() {

    }

    @Override
    public void clickNext() {

    }
}
