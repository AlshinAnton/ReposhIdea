package Pages.AndroidPages.LoginAndRegistration;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.LoginInterface;

import Pages.AndroidPages.model.User;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen extends AndroidBaseClass implements LoginInterface {

    //id
    private String receiveCodeBtnID = "com.reposh.dev:id/btnCode";
    private String phoneFieldID = "com.reposh.dev:id/etPhone";
    private String errorPhoneID = "com.reposh.dev:id/textinput_error";
    private String codeFieldID = "com.reposh.dev:id/etCode";
    private String confirmCodeBtnID = "com.reposh.dev:id/btnConfirm";

    private String phone9 = "99999999999";
    private String phone8 = "98888888888";
    private String phone7 = "97777777777";
    private String code = "4315";
    private String code911 = "7642";
    private String incorrectPhone = "1111111111";
    private String incorrectCode = "11111";

    private String incorrectPhoneError = "Код мобильного оператора должен начинаться с 9";
    private String incorrectCodeError = "Неправильный код. Осталось 4 попытки";
    private String phone1 = "9111111111";
    private String phone2 = "9222222222";
    private String phone3 = "9333333333";
    private String phone4 = "9444444444";


    public LoginScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void enterPhoneNumber(String phoneNum) {
        waitAndroidViewById(phoneFieldID);
        sendKeysToAndroidElementWithID(phoneFieldID, phoneNum);
    }

    @Override
    public void enterIncorrectPhoneNumber() {
        waitAndroidViewById(phoneFieldID);
        sendKeysToAndroidElementWithID(phoneFieldID, incorrectPhone);
    }

    @Override
    public void waitErrorPhoneFormat() {
        assertWaitElementWithIDTemplate(errorPhoneID, "неверный формат номера телефона");
        waitAndroidViewById(errorPhoneID);
    }

    @Override
    public void assertErrorPhoneFormat() {
        assertTemplateStringsById(errorPhoneID, incorrectPhoneError,  incorrectPhoneError + " не выводится, либо текст не совпадает");
    }

    @Override
    public void clickReceiveCodeBtn() {
        waitAndClickAndroidElementByID(receiveCodeBtnID);
    }

    @Override
    public void waitCodeScreen() {
        waitAndroidViewById(codeFieldID);
    }

    @Override
    public void enterCode() {
        sendKeysToAndroidElementWithID(codeFieldID, code);
    }

    @Override
    public void enterIncorrectCode() {
        sendKeysToAndroidElementWithID(codeFieldID, incorrectCode);
    }

    @Override
    public void clickConfirmCodeBtn() {
        waitAndClickAndroidElementByID(confirmCodeBtnID);
    }

    private void similarLogin() {
        clickReceiveCodeBtn();
        waitCodeScreen();
        enterCode();
        clickConfirmCodeBtn();
    }

    @Override
    public void waitErrorCode() {
        assertWaitElementWithIDTemplate(errorPhoneID, "код ошибки отсутствует");
    }

    @Override
    public void assertErrorCode() {
        assertTemplateStringsById(errorPhoneID, incorrectCodeError,  incorrectPhoneError + " текст не совпадает");
    }

    @Override
    public void login(@NotNull User user) {
        enterPhoneNumber(user.getPhone());
        clickReceiveCodeBtn();
        waitCodeScreen();
        sendKeysToAndroidElementWithID(codeFieldID, user.getCode());
        clickConfirmCodeBtn();
    }
}
