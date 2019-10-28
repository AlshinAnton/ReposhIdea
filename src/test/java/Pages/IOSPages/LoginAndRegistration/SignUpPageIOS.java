package Pages.IOSPages.LoginAndRegistration;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.SignUpInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.HideKeyboardStrategy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageIOS extends IOSBaseClass implements SignUpInterface {

    String randomSign = String.valueOf((int) (Math.random() * 100000) + 1);

    private String eMailFieldID = "eMailFieldID";
    private String nickNameFieldID = "nickNameFieldID";
    private String passwordFieldID = "passwordFieldID";
    private String userNameFieldID = "nameFieldID";
    private String lastNameFieldID = "lastNameFieldID";
    private String nextButtonID = "next_button";
    private String haveAccount = "createAccountBtnId";   // не сделано

    private String errorEmailFieldID = "eMailErMessageID";
    private String errorNickNameFieldID = "nickNameErMessageID";
    private String errorPasswordFieldID = "passwordErMessageID";
    private String errorNameFieldID = "nameErMessageID";

    private String wrongEmail = "skfhks";
    private String wrongNickName = "tes 0";
    private String alreadyUsedNickName = "tester";
    private String shortPassword = "q";
    private String passwordWithoutNum = "qweqweqwe";
    private String wrongName = "asd asd";
    private String lastName = "SomeLastName";
    private String normalEmail = "delete" + randomSign + "@delete.com";
    private String normalPassword = "qqq111qqq";
    private String normalNickName = "delete" + randomSign;
    private String normalName = "delete";

    private String wrongNameMessage = "В Имя допустимы только буквы и дефис";
    private String wrongEmailMessage = "Значение «Email» не является правильным email адресом.";
    private String shortPasswordMessage = "Значение «Пароль» должно содержать минимум 8 символов.";
    private String nonNumericPassMessage = "Пароль должен состоять из букв и цифр.";
    private String wrongNickNameMessage = "В поле Имя пользователя допустимы только буквы и дефис";
    private String usedNickNameMessage = "Данное имя пользователя уже занято";

    public SignUpPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Ожидание поля eMail
    @Override
    public void waitEmailField() {
        waitIOSViewById(eMailFieldID);
    }

    //методы на заполнение полей при корректной регистрации
    @Override
    public void fillEmail() {
        clickViewById(eMailFieldID);
        sendKeysToIOSElementWithID(eMailFieldID, normalEmail);
    }

    @Override
    public void fillNickName() {
        clickViewById(nickNameFieldID);
        sendKeysToIOSElementWithID(nickNameFieldID, normalNickName);
    }

    @Override
    public void fillPassword() {
        clickViewById(passwordFieldID);
        sendKeysToIOSElementWithID(passwordFieldID, normalPassword);
    }

    @Override
    public void fillName() {
        clickViewById(userNameFieldID);
        sendKeysToIOSElementWithID(userNameFieldID, normalName);
    }

    @Override
    public void fillLastName() {
        clickViewById(lastNameFieldID);
        sendKeysToIOSElementWithID(lastNameFieldID, lastName);
    }

    // проверка на неправильный eMail (ex. kjldkhgld)
    @Override
    public void setWrongEmail() {
        clickViewById(eMailFieldID);
        sendKeysToIOSElementWithID(eMailFieldID, wrongEmail);
    }

    @Override
    public void waitWrongEmailMessageField() {
        waitTemplate(errorEmailFieldID, wrongEmailMessage);
    }

    @Override
    public void assertWrongEmailMessage() {
        String catchMessage = "Сообщение о некорректном eMail отличается от: ";
        assertTemplate(errorEmailFieldID, wrongEmailMessage, catchMessage);
    }

    // проверка на некорректный nickName (например с пробелом)
    @Override
    public void setWrongNickName() {
        clickViewById(nickNameFieldID);
        sendKeysToIOSElementWithID(nickNameFieldID, wrongNickName);
    }

    @Override
    public void waitWrongNickNameMessageField() {
        waitTemplate(errorNickNameFieldID, wrongNickNameMessage);
    }

    @Override
    public void assertWrongNickNameMessage() {
        String catchMessage = "Сообщение о некорректном имени пользователя отличается от: ";
        assertTemplate(errorNickNameFieldID, wrongNickNameMessage, catchMessage);
    }

    //проверка на короткий пароль
    @Override
    public void setShortPassword() {
        clickViewById(passwordFieldID);
        sendKeysToIOSElementWithID(passwordFieldID, shortPassword);
    }
    @Override
    public void waitShortPasswordMessageField() {
        waitTemplate(errorPasswordFieldID, shortPasswordMessage);
    }
    @Override
    public void assertShortPasswordMessage() {
        String catchMessage = "Сообщение о коротком пароле отличается от: ";
        assertTemplate(errorPasswordFieldID, shortPasswordMessage, catchMessage);
    }

    //проверка на пароль без цифр (больше 8 символов)
    @Override
    public void setPasswordWithoutNum() {
        clickViewById(passwordFieldID);
        sendKeysToIOSElementWithID(passwordFieldID, passwordWithoutNum);
    }
    @Override
    public void waitNONNumericPasswordField() {
        waitTemplate(errorPasswordFieldID, nonNumericPassMessage);
    }
    @Override
    public void assertNoNumbersPasswordMessage() {
        String catchMessage = "Сообщение о пароле без цифр отличается от: ";
        assertTemplate(errorPasswordFieldID, nonNumericPassMessage, catchMessage);
    }

    //проверка на некорректное имя (имя с пробелом)
    @Override
    public void setWrongName() {
        clickViewById(nickNameFieldID);
        sendKeysToIOSElementWithID(userNameFieldID, wrongName);
    }
    @Override
    public void waitWrongNameField() {
        waitTemplate(errorNameFieldID, wrongNameMessage);
    }
    @Override
    public void assertWrongNameMessage() {
        String catchMessage = "Сообщение о непраильном имени отличается от: ";
        assertTemplate(errorNameFieldID, wrongNameMessage, catchMessage);
    }

    //проверка на занятый nickName
    @Override
    public void setUsedNickName() {
        clickViewById(nickNameFieldID);
        sendKeysToIOSElementWithID(nickNameFieldID, alreadyUsedNickName);
    }
    @Override
    public void waitUsedNickNameMessageField() {
        waitTemplate(errorNickNameFieldID, usedNickNameMessage);
    }
    @Override
    public void assertUsedNickNameMessage() {
        String catchMessage = "Сообщение об уже заюзанном имени пользователя отличается от: ";
        assertTemplate(errorNickNameFieldID, usedNickNameMessage, catchMessage);
    }

    //нажатия по элементам
    @Override
    public void clickRegistration() {
        waitIOSViewById(nextButtonID);
        clickViewById(nextButtonID);
    }

    @Override
    public void hideKeyboard() {
        closeKeyboard(HideKeyboardStrategy.TAP_OUTSIDE);
    }
}
