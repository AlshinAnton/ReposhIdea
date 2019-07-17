package Pages.IOSPages.LoginAndRegistration;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.LoginInterface;
import Pages.AndroidPages.model.User;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.support.PageFactory;

public class LoginPageIOS extends IOSBaseClass implements LoginInterface {

    private String codeFieldID = "phoneNodeInputArea";
    private String helper_tvID = "";

    public LoginPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void enterPhoneNumber(@NotNull String phoneNum) {
        String phoneFieldID = "phoneNodeInputArea";
        waitIOSViewById(phoneFieldID);
        sendKeysToIOSElementWithID(phoneFieldID, phoneNum);
    }

    @Override
    public void enterIncorrectPhoneNumber() {}

    @Override
    public void waitErrorPhoneFormat() {}

    @Override
    public void assertErrorPhoneFormat() {}

    @Override
    public void clickReceiveCodeBtn() {
        String receiveCodeBtnName = "Получить код";
        waitIOSViewById(receiveCodeBtnName);
        clickViewById(receiveCodeBtnName);
    }

    @Override
    public void waitCodeScreen() {
        waitIOSViewById(codeFieldID);
    }

    @Override
    public void enterCode() {
        String code = "43150";
        sendKeysToIOSElementWithID(codeFieldID, code);
    }

    @Override
    public void enterIncorrectCode() {}

    @Override
    public void clickConfirmCodeBtn() {
        String confirmCodeBtnName = "Подтвердить";
        waitIOSViewById(confirmCodeBtnName);
        clickViewById(confirmCodeBtnName);
    }

    private void similarLogin() {
        clickReceiveCodeBtn();
        waitCodeScreen();
        enterCode();
        clickConfirmCodeBtn();
    }

    @Override
    public void waitErrorCode() {

    }

    @Override
    public void assertErrorCode() {

    }

    @Override
    public void login(@NotNull User user) {

    }
}