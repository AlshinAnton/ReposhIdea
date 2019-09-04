package TestingPageObject;

import AppiumSupport.BaseTestClass;
import org.junit.Test;

public class LoginTestNew extends BaseTestClass {

    @Test
    public void  incorrectCode() {
        LoginScreenNew loginScreenNew = new LoginScreenNew(driver());
        loginScreenNew.closeOnBoardingNew();
        loginScreenNew.enterPhoneNumberNew();
        loginScreenNew.clickReceiveCodeBtnNew();
        loginScreenNew.waitCodeScreenNew();
        loginScreenNew.enterCorrectCodeNew();
        loginScreenNew.clickConfirmCodeBtnNew();
        loginScreenNew.waitErrorCodeNew();
        loginScreenNew.assertErrorCodeNew();
    }
}
