package Pages.IOSPages;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.DeliveryInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPageIOS extends AndroidBaseClass implements DeliveryInterface {
    public DeliveryPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitDeliveryScreen() {

    }

    @Override
    public void clickConfirm() {

    }

    @Override
    public void clickDpdСourier() {

    }

    @Override
    public void clickChooseRateCourier() {

    }

    @Override
    public void waitChooseRateScreen() {

    }

    @Override
    public void chooseRateMINI() {

    }

    @Override
    public void chooseRateCLASSIC() {

    }

    @Override
    public void chooseRateMAX() {

    }

    @Override
    public void chooseRateSUPERMAX() {

    }

    @Override
    public void clickChooseAddressCourier() {

    }

    @Override
    public void waitChooseAddressCourierScreen() {

    }

    @Override
    public void chooseMainAddress() {

    }

    @Override
    public void switchPackToBox() {

    }

    @Override
    public void chooseCourierDpd() {
        waitDeliveryScreen();
        clickDpdСourier();
        clickChooseRateCourier();
        waitChooseRateScreen();
        chooseRateMINI();
        clickChooseAddressCourier();
        waitChooseAddressCourierScreen();
        chooseMainAddress();
        switchPackToBox();
        clickConfirm();
    }

    @Override
    public void clickDpdPostamat() {

    }

    @Override
    public void clickChooseRatePostamat() {

    }

    @Override
    public void clickChooseAdressPostamat() {

    }

    @Override
    public void choosePostamatAddress() {

    }

    @Override
    public void waitChooseAddressPostamatScreen() {

    }
}
