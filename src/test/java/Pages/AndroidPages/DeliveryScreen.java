package Pages.AndroidPages;


import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.DeliveryInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DeliveryScreen extends AndroidBaseClass implements DeliveryInterface {
    private String confirmBtnID = "com.reposh.dev:id/action_apply";
    private String checkBoxID = "com.reposh.dev:id/checkbox";

    public DeliveryScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitDeliveryScreen() {
        isVisibleID(confirmBtnID);
    }

    @Override
    public void clickConfirm() {
        waitAndClickAndroidElementByID(confirmBtnID);
    }

    @Override
    public void clickDpdСourier() {
        clickAndroidElementByIDAndInstance(checkBoxID, 0);
    }

    @Override
    public void clickChooseRateCourier() {
        clickAndroidElementByText("Выберите тариф");
    }

    @Override
    public void waitChooseRateScreen() {
        isVisibleID("com.reposh.dev:id/priceTv");
    }

    @Override
    public void chooseRateMINI() {
        clickAndroidElementByText("Мини");
    }

    @Override
    public void chooseRateCLASSIC() {
        clickAndroidElementByText("Классик");
    }

    @Override
    public void chooseRateMAX() {
        clickAndroidElementByText("Макс");
    }

    @Override
    public void chooseRateSUPERMAX() {
        clickAndroidElementByText("Супермакс");
    }

    @Override
    public void clickChooseAddressCourier() {
        clickAndroidElementByText("Укажите адрес доставки");
    }

    @Override
    public void waitChooseAddressCourierScreen() {
        waitANDROIDElementByTEXT("Мои адреса");
    }

    @Override
    public void chooseMainAddress() {
        waitAndClickAndroidElementByText("ул. Вавилова, 3, Москва, Россия, 115419");
    }

    @Override
    public void switchPackToBox() {
        waitAndClickAndroidElementByID("com.reposh.dev:id/boxSwitch");
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
        clickAndroidElementByIDAndInstance(checkBoxID, 1);
    }

    @Override
    public void clickChooseRatePostamat() {
        clickAndroidElementByIDAndInstance("com.reposh.dev:id/edit_text", 2);
        //clickAndroidElementByText("Выберите тариф");
    }

    @Override
    public void clickChooseAdressPostamat() {
        clickAndroidElementByText("Адрес");
    }

    @Override
    public void choosePostamatAddress() {
        waitAndClickAndroidElementByText("Пункт выдачи");
    }

    @Override
    public void waitChooseAddressPostamatScreen() {
        waitANDROIDElementByTEXT("Пункт выдачи");
    }
}
