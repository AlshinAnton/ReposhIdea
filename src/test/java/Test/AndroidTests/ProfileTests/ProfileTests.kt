package Test.AndroidTests.ProfileTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.Test

class ProfileTests : BaseTestClass() {

    private fun goToProfile() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User1())
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        profilePageInterface.waitTooltip()
        profilePageInterface.closeTooltip()
    }

    @Test
    fun checkMyProducts() {
        goToProfile()
        profilePageInterface.swipeToMyProducts()
        println("Переход в Мои товары выполнен успешно")
    }

    @Test
    fun checkLikedTest() {
        goToProfile()
        profilePageInterface.swipeToLiked()
        likedInterface.waitLikedPage()
        likedInterface.swipeToRepost()
        println("Переход во вкладку Мне понравилось выполнен успешно")
    }

    @Test
    fun checkGuide() {
        goToProfile()
        profilePageInterface.swipeToGuid()
        println("Переход на вкладку Гид выполнен успешно")
    }

    /*@Test
    fun checkMyReview() {
        goToProfile()
        settingsPageInterface.swipeToReviews()
        reviewInterface.waitReceivedReviewPage()
        reviewInterface.swipeToPostedReview()
        println("Переход на экран Отзывы выполнен успешно")
    }*/

    /*@Test
    fun checkMySales() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        settingsPageInterface.swipeToMySales()
        mySalesInterface.waitCompletedSales()
        mySalesInterface.swipeToCompletedSales()
        println("Переход в Мои продажи выполнен успешно")
    }*/

    /*@Test
    public void checkBalance() {
        onboardingInterface.waitThenCloseOnBoardingPage();
        loginInterface.loginAsTeste()
        tapeInterface.closeTooltips()
        loginInterface.clickReceiveCodeBtn();
        bottomToolbarInterface.clickProfile();
        settingsPageInterface.swipeToBalance();
        System.out.println("Переход на экран Баланс выполнен успешно");
    }*/

    /*@Test
    fun checkClicksMyPurchaseTest() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        settingsPageInterface.swipeToMyPurchaseMethods()
        settingsPageInterface.clickByMyPurchaseMethods()
        myPurchaseMethodsInterface.waitMyPurchaseMethodsScreen()
        myPurchaseMethodsInterface.clickByAddBankCard()
        addingCardInterface.waitAddingBankCardScreen()
    }

    @Test
    fun addCreditCard() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.loginAsTester9()
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickProfile()
        settingsPageInterface.swipeToMyPurchaseMethods()
        settingsPageInterface.clickByMyPurchaseMethods()
        myPurchaseMethodsInterface.waitMyPurchaseMethodsScreen()
        myPurchaseMethodsInterface.clickByAddBankCard()
        addingCardInterface.waitAddingBankCardScreen()
        addingCardInterface.waitFieldCardNumber()
        addingCardInterface.sendKeysToCardNumberField()
        addingCardInterface.waitFieldValidityCard()
        addingCardInterface.sendKeysToValidityField()
        addingCardInterface.waitFieldCardOwner()
        addingCardInterface.sendKeysToOwnerField()
        addingCardInterface.waitFieldCVC()
        addingCardInterface.sendKeysToCVCField()

    }*/

}