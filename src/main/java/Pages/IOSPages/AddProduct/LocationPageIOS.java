package Pages.IOSPages.AddProduct;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.LocationInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LocationPageIOS extends IOSBaseClass implements LocationInterface {

    public LocationPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitLocationPage() {

    }

    @Override
    public void clickSearchField() {

    }

    @Override
    public void setLocation() {

    }

    @Override
    public void clickDone() {

    }

    @Override
    public void waitSearchField() {

    }

    @Override
    public void enterCity() {

    }

    @Override
    public void clickByFirstCity() {

    }
}
