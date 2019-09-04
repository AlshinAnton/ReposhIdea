package TestingPageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginScreenNew  extends AndroidBaseClass2 {
    public LoginScreenNew(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy (id ="com.reposh.dev:id/btnCode")
    protected AndroidElement receiveCodeBtnLocator;
    @AndroidFindBy (id = "\"com.reposh.dev:id/etPhone\"")
    protected AndroidElement phoneFieldLocator;
    @AndroidFindBy (id = "com.reposh.dev:id/textinput_error")
    protected AndroidElement errorPhoneLocator;
    @AndroidFindBy (id = "com.reposh.dev:id/etCode")
    protected AndroidElement codeFieldLocator;
    @AndroidFindBy (id = "com.reposh.dev:id/btnConfirm")
    protected AndroidElement confirmCodeBtnLocator;
    @AndroidFindBy (id ="com.reposh.dev:id/btnEnter")
    protected AndroidElement enter;



    /*By receiveCodeBtnLocator = By.id("com.reposh.dev:id/btnCode");
    By phoneFieldLocator = By.id("com.reposh.dev:id/etPhone");
    By errorPhoneLocator = By.id("com.reposh.dev:id/textinput_error");
    By codeFieldLocator = By.id("com.reposh.dev:id/etCode");
    By confirmCodeBtnLocator = By.id("com.reposh.dev:id/btnConfirm");

    By enter = By.id("com.reposh.dev:id/btnEnter");*/


    protected void closeOnBoardingNew() {

        //isDisplayed(enter);
        clickByElement(enter);
    }

    protected void enterPhoneNumberNew() {
        isDisplayed(phoneFieldLocator);
        sendKeysToElement(phoneFieldLocator, "9999999999");
    }

    protected void clickReceiveCodeBtnNew() {
        isDisplayed(receiveCodeBtnLocator);
        clickByElement(receiveCodeBtnLocator);
    }

    protected void waitCodeScreenNew() {
        isDisplayed(codeFieldLocator);
    }

    protected void assertErrorCodeNew() {

    }

    protected void waitErrorCodeNew() {

    }

    protected void clickConfirmCodeBtnNew() {
        isDisplayed(confirmCodeBtnLocator);
        clickByElement(confirmCodeBtnLocator);
    }

    protected void enterCorrectCodeNew() {
        sendKeysToElement(codeFieldLocator, "4315");
    }


}
