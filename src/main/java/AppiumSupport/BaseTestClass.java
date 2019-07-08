package AppiumSupport;

import Interface.*;
import Pages.AndroidPages.*;
import Pages.AndroidPages.AddProduct.*;
import Pages.AndroidPages.Chat.ChatActivity;
import Pages.AndroidPages.Chat.ChatListPage;
import Pages.AndroidPages.Checkout.CheckoutOrderPageAndroid;
import Pages.AndroidPages.Checkout.CheckoutPageAndroid;
import Pages.AndroidPages.Checkout.CheckoutPaymentConfirmationPageAndroid;
import Pages.AndroidPages.Checkout.CheckoutPaymentPageAndroid;
import Pages.AndroidPages.Filters.FiltersPageAndroid;
import Pages.AndroidPages.Filters.FiltersSettingsPageAndroid;
import Pages.AndroidPages.LoginAndRegistration.*;
import Pages.AndroidPages.ProductCard.CommentsActivity;
import Pages.AndroidPages.ProductCard.ProductCardActivity;
import Pages.AndroidPages.Profile.ProfilePage;
import Pages.AndroidPages.Search.SearchPageAndroid;
import Pages.AndroidPages.Settings.*;
import Pages.AndroidPages.Tape.TapeActivity;
import Pages.AndroidPages.Toolbars.BottomToolbar;
import Pages.IOSPages.*;
import Pages.IOSPages.AddProduct.*;
import Pages.IOSPages.CategoryPageIOS;
import Pages.IOSPages.ChatIOS.ChatPageIOS;
import Pages.IOSPages.LoginAndRegistration.*;
import Pages.IOSPages.Toolbars.BottomToolbarIOS;
import Pages.Notifications.NotificationsPageAndroid;
import org.junit.After;
import org.junit.Before;

public class BaseTestClass extends AppiumBaseClass {

    public OnboardingInterface onboardingInterface;
    public LoginInterface loginInterface;
    public SignUpInterface signUpInterface;
    public ProfilePageInterface settingsPageInterface;
    public SignUpAvatarInterface signUpAvatarInterface;
    public SignUpBrandsInterface signUpBrandsInterface;
    public BottomToolbarInterface bottomToolbarInterface;
    public TapeInterface tapeInterface;
    public SignUpGeoInterface signUpGeoInterface;
    public SignUpFriendsInterface signUpFriendsInterface;
    public AddProductInterface addProductInterface;
    public AddPhotoFromGalleryInterface addPhotoFromGalleryInterface = new AddPhotoFromGalleryOrCameraAndroid(driver());
    public CategoryInterface categoryInterface;
    public SizeInterface sizeInterface;
    public BrandsInterface brandsInterface;
    public ColorInterface colorInterface;
    public ConditionInterface conditionInterface;
    public LocationInterface locationInterface;
    public SearchPageInterface searchPageInterface;
    public ChatListInterface chatListInterface;
    public ChatInterface chatInterface;
    public DeliveryInterface deliveryInterface;
    public AddProductOrDraftConfirmationInterface addProductOrDraftConfirmationInterface;
    public MyProductsInterface myProductsInterface;
    public MyDraftsInterface myDraftsInterface;
    public ProductCardInterface productCardInterface;
    public APIInterface APIInterface;
    public CommentsInterface commentsInterface;
    public BargainInterface bargainInterface;
    public FiltersInterface filtersInterface;
    public FiltersSettingsInterface filtersSettingsInterface;
    public MyPurchaseInterface myPurchaseInterface;
    public MySalesInterface mySalesInterface;
    public LikedInterface likedInterface;
    public ReviewInterface reviewInterface;
    public MySizesInterface mySizesInterface;
    public MyPurchaseMethodsInterface myPurchaseMethodsInterface;
    public AddingCardInterface addingCardInterface;
    public EditProfileInterface editProfileInterface;
    public NotificationsInterface notificationsInterface;
    public MyAddressesInterface myAddressesInterface;
    public CheckoutInterface checkoutInterface;
    public CheckoutOrderInterface checkoutOrderInterface;
    public CheckoutPaymentInterface checkoutPaymentInterface;
    public CheckoutPaymentConfirmationInterface checkoutPaymentConfirmationInterface;
    public ProfilePageInterface profilePageInterface;
    public SettingsInterface settingsInterface;


    @Before
    public void setUp() throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            case ANDROID:
                preConditionAndroid();
                break;
            case ANDROID_1_PLUS_6:
                preConditionAndroid();
                break;
            case ANDROID_1_PLUS_5T:
                preConditionAndroid();
                break;
            case ANDROID_NEXUS:
                preConditionAndroid();
                break;
            case IOS_IPHONE_6_PLUS_SIMULATOR:
                preConditionIOS();
                break;
            case IOS_IPHONE_6S_KONSTANTIN:
                preConditionIOS();
                break;
            case IOS_IPHONE_5S:
                preConditionIOS();
                break;
            case IOS_IPHONE_6_PLUS:
                preConditionIOS();
                break;
            case ANDROID_XIAOMI:
                preConditionAndroid();
                break;
            case ANDROID_GALAXY_S8:
                preConditionAndroid();
                break;
        }
    }

    private void preConditionIOS() {
        onboardingInterface = new OnBoardingPageIOS(driver());
        loginInterface = new LoginPageIOS(driver());
        signUpInterface = new SignUpPageIOS(driver());
        settingsPageInterface = new ProfilePageIOS(driver());
        signUpAvatarInterface = new SignUpAvatarPageIOS(driver());
        bottomToolbarInterface = new BottomToolbarIOS(driver());
        signUpBrandsInterface = new SignUpBrandsPageIOS(driver());
        tapeInterface = new TapePageIOS(driver());
        signUpGeoInterface = new SignUpGeoPageIOS(driver());
        signUpFriendsInterface = new SignUpFriendsPageIOS(driver());
        addProductInterface = new AddProductPageIOS(driver());
        categoryInterface = new CategoryPageIOS(driver());
        sizeInterface = new SizePageIOS(driver());
        brandsInterface = new BrandsPageIOS(driver());
        colorInterface = new ColorPageIOS(driver());
        conditionInterface = new ConditionPageIOS(driver());
        locationInterface = new LocationPageIOS(driver());
        searchPageInterface = new SearchPageIOS(driver());
        chatInterface = new ChatPageIOS(driver());
        deliveryInterface = new DeliveryPageIOS(driver());
        addProductOrDraftConfirmationInterface = new AddProductOrDraftConfirmationPageIOS(driver());
        myProductsInterface = new MyProductsPageIOS(driver());
        productCardInterface = new ProductCardPageIOS(driver());
        myDraftsInterface = new MyDraftsPageIOS(driver());
        commentsInterface = new CommentsPageIOS(driver());
        bargainInterface = new BargainPageIOS(driver());
        filtersInterface = new FiltersPageIOS(driver());
        filtersSettingsInterface = new FiltersSettingsPageIOS(driver());
        myPurchaseInterface = new MyPurchasePageIOS(driver());
        mySalesInterface = new MySalesPageIOS(driver());
        likedInterface = new LikedPageIOS(driver());
        reviewInterface = new ReviewPageIOS(driver());
        mySizesInterface = new MySizesPageIOS(driver());
        myPurchaseMethodsInterface = new MyPurchaseMethodsPageIOS(driver());
        addingCardInterface = new AddingCreditCardPageIOS(driver());
        editProfileInterface = new EditProfilePageIOS(driver());
        addPhotoFromGalleryInterface = new AddPhotoFromGalleryOrCameraIOS(driver());
        myAddressesInterface = new MyAddressesPageIOS(driver());
        profilePageInterface = new ProfilePageIOS(driver());

    }

    private void preConditionAndroid() {
        onboardingInterface = new OnBoardingActivity(driver());
        loginInterface = new LoginActivity(driver());
        signUpInterface = new SignUpActivity(driver());
        settingsInterface = new SettingsPageAndroid(driver());
        signUpAvatarInterface = new SignUpAvatarActivity(driver());
        bottomToolbarInterface = new BottomToolbar(driver());
        signUpBrandsInterface = new SignUpBrandsActivity(driver());
        tapeInterface = new TapeActivity(driver());
        signUpGeoInterface = new SignUpGeoActivity(driver());
        signUpFriendsInterface = new SignUpFriendsActivity(driver());
        addProductInterface = new AddProductScreen(driver());
        addPhotoFromGalleryInterface = new AddPhotoFromGalleryOrCameraAndroid(driver());
        categoryInterface = new CategoryActivity(driver());
        sizeInterface = new SizeActivity(driver());
        brandsInterface = new BrandsActivity(driver());
        colorInterface = new ColorActivity(driver());
        conditionInterface = new ConditionActivity(driver());
        locationInterface = new LocationActivity(driver());
        searchPageInterface = new SearchPageAndroid(driver());
        chatListInterface = new ChatListPage(driver());
        chatInterface = new ChatActivity(driver());
        deliveryInterface = new DeliveryActivity(driver());
        addProductOrDraftConfirmationInterface = new AddProductOrDraftConfirmationActivity(driver());
        myProductsInterface = new MyProductsActivity(driver());
        productCardInterface = new ProductCardActivity(driver());
        myDraftsInterface = new MyDraftsActivity(driver());
        commentsInterface = new CommentsActivity(driver());
        bargainInterface = new BargainPageAndroid(driver());
        filtersInterface = new FiltersPageAndroid(driver());
        filtersSettingsInterface = new FiltersSettingsPageAndroid(driver());
        myPurchaseInterface = new MyPurchasePageAndroid(driver());
        mySalesInterface = new MySalesPageAndroid(driver());
        likedInterface = new LikedPageAndroid(driver());
        reviewInterface = new ReviewPageAndroid(driver());
        mySizesInterface = new MySizesPageAndroid(driver());
        myPurchaseMethodsInterface = new MyPurchaseMethodsPageAndroid(driver());
        addingCardInterface = new AddingCreditCardPageAndroid(driver());
        editProfileInterface = new EditProfilePageAndroid(driver());
        notificationsInterface = new NotificationsPageAndroid(driver());
        myAddressesInterface = new MyAddressesPageAndroid(driver());
        checkoutInterface = new CheckoutPageAndroid(driver());
        checkoutPaymentInterface = new CheckoutPaymentPageAndroid(driver());
        checkoutOrderInterface = new CheckoutOrderPageAndroid(driver());
        checkoutPaymentConfirmationInterface = new CheckoutPaymentConfirmationPageAndroid(driver());
        profilePageInterface = new ProfilePage(driver());
    }

    @After
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
