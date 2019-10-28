package Pages.AndroidPages.LoginAndRegistration;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.SignUpInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpScreen extends AndroidBaseClass implements SignUpInterface {

    String randomSign = String.valueOf((int) (Math.random() * 100000) + 1);

    String idEditText = "com.reposh.dev:id/edit_text"; // поля editText
    String helper_tvID = "com.reposh.dev:id/helper_tv"; //error message
    String registrationID = "com.reposh.dev:id/btn_registration";

    //эксперимент с id (не успешен)
    private String eMailFieldID = "com.reposh.dev:id/et_email";
    private String nickNameFieldID = "com.reposh.dev:id/et_username";
    private String passwordFieldID = "com.reposh.dev:id/et_password";
    private String nameFieldID = "com.reposh.dev:id/et_first_name";
    private String lastNameFieldID = "com.reposh.dev:id/et_second_name";

    private String wrongEmail = "skfhks";
    private String wrongNickName = "tes 0";
    private String alreadyUsedNickName = "tester";
    private String shortPassword = "q";
    private String passwordWithoutNum = "qweqweqwe";
    private String wrongName = "asd asd";

    private String wrongEmailMessage = "Значение «Email» не является правильным email адресом.";
    private String wrongNameMessage = "В Имя допустимы только буквы и дефис";
    private String shortPasswordMessage = "Значение «Пароль» должно содержать минимум 8 символов.";
    private String nonNumericPassMessage = "Пароль должен состоять из букв и цифр.";
    private String wrongNickNameMessage = "В поле Имя пользователя допустимы только буквы и дефис";
    private String usedNickNameMessage = "Данное имя пользователя уже занято";

    private String normalEmail = "delete" + randomSign + "@delete.com";
    private String normalPassword = "qqq111qqq";
    private String normalNickName = "delete" + randomSign;
    private String normalName = "delete";
    private String lastName = "deleteov";


    public SignUpScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    // Метод на ожидание поля eMail
    @Override
    public void waitEmailField() {
        waitAndroidViewByIdAndInstance(idEditText, 0);
    }

    //Методы на заполнение полей
    @Override
    public void fillEmail() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 0, normalEmail);
    }

    @Override
    public void fillNickName() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 1, normalNickName);
    }

    @Override
    public void fillPassword() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 2, normalPassword);
    }

    @Override
    public void fillName() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 3, normalName);
    }

    @Override
    public void fillLastName() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 4, lastName);
    }

    // методы для теста с некорректным eMail (ex. kjfdshkds)
    @Override
    public void setWrongEmail() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 0, wrongEmail);
    }

    @Override
    public void waitWrongEmailMessageField() {
        waitElementWithIDAndInstanceTemplate(helper_tvID, 0, wrongEmailMessage);
    }

    @Override
    public void assertWrongEmailMessage() {
        String catchMesage = "Сообщение о некорректном eMail/пользователе отличается от: ";
        assertTemplateStringsByIdAndInstance(helper_tvID, 0, wrongEmailMessage, catchMesage);
    }

    //ниже некорректное имя пользователя (уникальный NickName). Подойдет любой NickName с пробелом (ex. fd dfd)
    @Override
    public void setWrongNickName() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 1, wrongNickName);
    }

    @Override
    public void waitWrongNickNameMessageField() {
        waitElementWithIDAndInstanceTemplate(helper_tvID, 0, wrongNickNameMessage);
    }

    @Override
    public void assertWrongNickNameMessage() {
        String catchMessage = "Сообщение о некорректном Имени пользователя отличается от: ";
        assertTemplateStringsByIdAndInstance(helper_tvID, 0, wrongNickNameMessage, catchMessage);
    }

    // используем уже заюзанное Имя пользователя
    @Override
    public void setUsedNickName() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 1, alreadyUsedNickName);
    }

    @Override
    public void waitUsedNickNameMessageField() {
        waitElementWithIDAndInstanceTemplate(helper_tvID, 0, usedNickNameMessage);
    }

    @Override
    public void assertUsedNickNameMessage() {
        String catchMessage = "Сообщение об уже занятом имени пользователя отличается от: ";
        assertTemplateStringsByIdAndInstance(helper_tvID, 0, usedNickNameMessage, catchMessage);
    }

    //проверка на короткий пароль
    @Override
    public void setShortPassword() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 2, shortPassword);
    }

    @Override
    public void waitShortPasswordMessageField() {
        waitElementWithIDAndInstanceTemplate(helper_tvID, 0, shortPasswordMessage);
    }

    @Override
    public void assertShortPasswordMessage() {
        String catchMessage = "Сообщение о коротком пароле отличается от: ";
        assertTemplateStringsByIdAndInstance(helper_tvID, 0, shortPasswordMessage, catchMessage);
    }

    //проверка на пароль без цифр
    @Override
    public void setPasswordWithoutNum() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 2, passwordWithoutNum);
    }

    @Override
    public void waitNONNumericPasswordField() {
        waitElementWithIDAndInstanceTemplate(helper_tvID, 0, nonNumericPassMessage);
    }

    @Override
    public void assertNoNumbersPasswordMessage() {
        String catchMessage = "Сообщение о пароле без цифр отличается от: ";
        assertTemplateStringsByIdAndInstance(helper_tvID, 0, nonNumericPassMessage, catchMessage);
    }

    //проверка на неправильное имя ( с пробелом)
    @Override
    public void setWrongName() {
        sendKeysToAndroidElementByIDAndInstance(idEditText, 3, wrongName);
    }

    @Override
    public void waitWrongNameField() {
        waitElementWithIDAndInstanceTemplate(helper_tvID, 0, wrongNameMessage);
    }

    @Override
    public void assertWrongNameMessage() {
        String catchMessage = "Сообщение о непраильном имени отличается от: ";
        assertTemplateStringsByIdAndInstance(helper_tvID, 1, wrongNameMessage, catchMessage);
    }

    @Override
    public void clickRegistration() {
        waitAndClickAndroidElementByID(registrationID);
    }

    @Override
    public void hideKeyboard() {

    }
}
