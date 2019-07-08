package AppiumSupport;

import Interface.*;
import Pages.AndroidPages.*;
import Pages.AndroidPages.AddProduct.*;
import Pages.AndroidPages.Chat.ChatScreen;
import Pages.AndroidPages.Chat.ChatListPage;
import Pages.AndroidPages.Checkout.CheckoutOrderScreen;
import Pages.AndroidPages.Checkout.CheckoutPageScreen;
import Pages.AndroidPages.Checkout.CheckoutPaymentConfirmationScreen;
import Pages.AndroidPages.Checkout.CheckoutPaymentScreen;
import Pages.AndroidPages.Filters.FiltersScreen;
import Pages.AndroidPages.Filters.FiltersSettingsScreen;
import Pages.AndroidPages.LoginAndRegistration.*;
import Pages.AndroidPages.ProductCard.CommentsScreen;
import Pages.AndroidPages.ProductCard.ProductCardScreen;
import Pages.AndroidPages.Profile.ProfileScreen;
import Pages.AndroidPages.Search.SearchScreen;
import Pages.AndroidPages.Settings.*;
import Pages.AndroidPages.Tape.TapeScreen;
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
        onboardingInterface = new OnBoardingScreen(driver());
        loginInterface = new LoginScreen(driver());
        signUpInterface = new SignUpScreen(driver());
        settingsInterface = new SettingsScreen(driver());
        signUpAvatarInterface = new SignUpAvatarScreen(driver());
        bottomToolbarInterface = new BottomToolbar(driver());
        signUpBrandsInterface = new SignUpBrandsScreen(driver());
        tapeInterface = new TapeScreen(driver());
        signUpGeoInterface = new SignUpGeoScreen(driver());
        signUpFriendsInterface = new SignUpFriendsScreen(driver());
        addProductInterface = new AddProductScreen(driver());
        addPhotoFromGalleryInterface = new AddPhotoFromGalleryOrCameraAndroid(driver());
        categoryInterface = new CategoryScreen(driver());
        sizeInterface = new SizeScreen(driver());
        brandsInterface = new BrandsScreen(driver());
        colorInterface = new ColorScreen(driver());
        conditionInterface = new ConditionScreen(driver());
        locationInterface = new LocationScreen(driver());
        searchPageInterface = new SearchScreen(driver());
        chatListInterface = new ChatListPage(driver());
        chatInterface = new ChatScreen(driver());
        deliveryInterface = new DeliveryScreen(driver());
        addProductOrDraftConfirmationInterface = new AddProductOrDraftConfirmationScreen(driver());
        myProductsInterface = new MyProductsScreen(driver());
        productCardInterface = new ProductCardScreen(driver());
        myDraftsInterface = new MyDraftsScreen(driver());
        commentsInterface = new CommentsScreen(driver());
        bargainInterface = new BargainScreen(driver());
        filtersInterface = new FiltersScreen(driver());
        filtersSettingsInterface = new FiltersSettingsScreen(driver());
        myPurchaseInterface = new MyPurchaseScreen(driver());
        mySalesInterface = new MySalesScreen(driver());
        likedInterface = new LikedScreen(driver());
        reviewInterface = new ReviewScreen(driver());
        mySizesInterface = new MySizesScreen(driver());
        myPurchaseMethodsInterface = new MyPurchaseMethodsScreen(driver());
        addingCardInterface = new AddingCreditCardScreen(driver());
        editProfileInterface = new EditProfileScreen(driver());
        notificationsInterface = new NotificationsPageAndroid(driver());
        myAddressesInterface = new MyAddressesScreen(driver());
        checkoutInterface = new CheckoutPageScreen(driver());
        checkoutPaymentInterface = new CheckoutPaymentScreen(driver());
        checkoutOrderInterface = new CheckoutOrderScreen(driver());
        checkoutPaymentConfirmationInterface = new CheckoutPaymentConfirmationScreen(driver());
        profilePageInterface = new ProfileScreen(driver());
    }

    @After
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
