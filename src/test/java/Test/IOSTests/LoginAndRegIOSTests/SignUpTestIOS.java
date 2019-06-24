package Test.IOSTests.LoginAndRegIOSTests;

import AppiumSupport.BaseTestClass;

public class SignUpTestIOS extends BaseTestClass {
    /*@Test //кейсы на всех экранах (выбор брендов, аватарки...) = пропустить
    public void correctSignUp() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.clickSignUp();
        signUpInterface.waitEmailField(); // здесь зависает и больше ничего не происходит
        signUpInterface.fillEmail();
        signUpInterface.fillNickName();
        signUpInterface.fillPassword();
        signUpInterface.fillName();
        signUpInterface.fillLastName();
        signUpInterface.hideKeyboard();
        signUpInterface.clickRegistration();
        signUpAvatarInterface.waitAddPhotoPage();
        signUpAvatarInterface.clickSkipPage();
        signUpBrandsInterface.clickSkip();
        signUpGeoInterface.clickSkip();
        signUpFriendsInterface.clickSkip();
        try {
            bottomToolbarInterface.waitTape();
            System.out.println("Регистрация прошла успешно");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void wrongEmailInSignUp() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.clickSignUp();
        signUpInterface.waitEmailField();
        signUpInterface.setWrongEmail();
        signUpInterface.fillNickName();
        signUpInterface.fillPassword();
        signUpInterface.fillName();
        signUpInterface.fillLastName();
        signUpInterface.hideKeyboard();
        signUpInterface.clickRegistration();
        signUpInterface.waitWrongEmailMessageField();
        signUpInterface.assertWrongEmailMessage();
    }

    @Test
    public void wrongNickNameInSignUp() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.clickSignUp();
        signUpInterface.waitEmailField();
        signUpInterface.fillEmail();
        signUpInterface.setWrongNickName();
        signUpInterface.fillPassword();
        signUpInterface.fillName();
        signUpInterface.fillLastName();
        signUpInterface.hideKeyboard();
        signUpInterface.clickRegistration();
        signUpInterface.waitWrongNickNameMessageField();
        signUpInterface.assertWrongNickNameMessage();
    }

    @Test
    public void usedNickNameInSignUp() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.clickSignUp();
        signUpInterface.waitEmailField();
        signUpInterface.fillEmail();
        signUpInterface.setUsedNickName();
        signUpInterface.fillPassword();
        signUpInterface.fillName();
        signUpInterface.fillLastName();
        signUpInterface.hideKeyboard();
        signUpInterface.clickRegistration();
        signUpInterface.waitUsedNickNameMessageField();
        signUpInterface.assertUsedNickNameMessage();
    }

    @Test
    public void shortPasswordInSignUp() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.clickSignUp();
        signUpInterface.waitEmailField();
        signUpInterface.fillEmail();
        signUpInterface.fillNickName();
        signUpInterface.setShortPassword();
        signUpInterface.fillName();
        signUpInterface.fillLastName();
        signUpInterface.hideKeyboard();
        signUpInterface.clickRegistration();
        signUpInterface.waitShortPasswordMessageField();
        signUpInterface.assertShortPasswordMessage();
    }

    @Test
    public void wrongNAMEInSignUp() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.clickSignUp();
        signUpInterface.waitEmailField();
        signUpInterface.fillEmail();
        signUpInterface.fillNickName();
        signUpInterface.fillPassword();
        signUpInterface.setWrongName();
        signUpInterface.fillLastName();
        signUpInterface.hideKeyboard();
        signUpInterface.clickRegistration();
        signUpInterface.waitWrongNameField();
        signUpInterface.assertWrongNameMessage();
    }*/
}

