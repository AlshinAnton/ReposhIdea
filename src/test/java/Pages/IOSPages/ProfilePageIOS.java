package Pages.IOSPages;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.ProfilePageInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public  class ProfilePageIOS extends IOSBaseClass implements ProfilePageInterface {

    private String guideID = "guide_profile_button";
    private String etiqueteID = "etiquette_profile_button";
    private String inviteFriendsID = "inviteFriends_profile_button";
    private String findUsersID = "findUsers_profile_button";
    private String myProductsID = "products_profile_button";
    private String shkafID = "closet_profile_button";
    private String draftID = "draft_profile_button";
    private String likedID = "likes_profile_button";
    private String mySizeID = "mySizes_profile_button";
    private String editProfileID = "editProfile_profile_button";
    private String myPurchaseID = "myPurchase_profile_button";
    private String myPaymentMethodsID = "payments_profile_button";
    private String myAdressID = "myAdress_profile_button";
    private String mySalesID = "mySales_profile_button";
    private String balanceID = "balance_profile_button";
    private String reviewsID = "reviews_profile_button";
    private String statisticID = "statistics_profile_button";
    private String manageSalesID = "manageSales_profile_button";
    private String settingsID = "settings_profile_button";
    private String logoutID = "logOut_profile_button";
    private String supportID = "support_profile_button";
    private String faqID = "faq_profile_button";
    private String aboutID = "about_profile_button";

    public ProfilePageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void waitProfilePage() {
        waitIOSViewById(guideID);
    }

    @Override
    public void clickAboutProjectField() {
        clickViewById(aboutID);
    }

    public void swipeToGuid() {

    }

    @Override
    public void swipeToMyProducts() {

    }

    @Override
    public void swipeToLiked() {

    }

    @Override
    public void swipeToMyPurchace() {

    }

    @Override
    public void swipeToMySales() {

    }

    @Override
    public void back() {

    }

    @Override
    public void waitTooltip() {

    }

    @Override
    public void closeTooltip() {

    }

    @Override
    public void waitSettings() {

    }

    @Override
    public void clickSettings() {

    }

    @Override
    public void clickByGuide() {

    }

    @Override
    public void waitSubscriptionsField() {

    }

    @Override
    public void clickSubscriptionsField() {

    }

    @Override
    public void waitSubscribersField() {

    }

    @Override
    public void clickSubscribersField() {

    }

    @Override
    public void swipeToEtiquette() {

    }

    @Override
    public void clickByEtiquette() {

    }

    @Override
    public void clickByMyProducts() {

    }

    @Override
    public void clickByMyPurchase() {

    }

    @Override
    public void clickByMySales() {

    }

    @Override
    public void clickLiked() {

    }

    @Override
    public void swipeToInvitePeopleField() {

    }

    @Override
    public void clickByInvitePeopleField() {

    }

    @Override
    public void swipeToFindUsersField() {

    }

    @Override
    public void clickByFindUsersField() {

    }

    @Override
    public void swipeToAboutProjectField() {

    }

    @Override
    public void swipeToContactsField() {

    }

    @Override
    public void clickByContactsField() {

    }

    @Override
    public void swipeToOfferField() {

    }

    @Override
    public void clickByOfferField() {

    }

    @Override
    public void waitSearchBtn() {

    }

    @Override
    public void clickSearchBtn() {

    }

    @Override
    public void waitSortBtn() {

    }

    @Override
    public void clickSortBtb() {

    }

    @Override
    public void waitFiltersBtn() {

    }

    @Override
    public void clickFiltersBtn() {

    }
}
