package Pages.AndroidPages;

import AndroidAndIOSHelpers.AndroidBaseClass;
import AppiumSupport.AppiumController;
import Interface.AddPhotoFromGalleryInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddPhotoFromGalleryOrCameraAndroid extends AndroidBaseClass implements AddPhotoFromGalleryInterface {


    public AddPhotoFromGalleryOrCameraAndroid(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private String firstFragmentGalleryID = "com.reposh.dev:id/tv_gallery";
    private String firstFragmentCameraID = "com.reposh.dev:id/tv_camera";
    private String secondFragmentGalleryID = "android:id/text1";

    private String confirmCameraPhotoID = "com.oppo.camera:id/btn_done";
    private String confirm1PLUSCameraPhotoID = "com.oneplus.camera:id/review_ok_button";
    private String cropCameraPhotoID = "com.reposh.dev:id/menu_crop";
    private String makePhoto1PLUSID = "com.oneplus.camera:id/primary_capture_button";

    private String choosePhotoID = "com.reposh.dev:id/check_view";


    @Override
    public void waitAddPhotoFragment() {
        waitAndroidViewById(firstFragmentGalleryID);
    }

    @Override
    public void clickChooseFromGallery1() {
        waitAndClickAndroidElementByID(firstFragmentGalleryID);
    }

    @Override
    public void clickChooseCamera() {
        waitAndClickAndroidElementByID(firstFragmentCameraID);
    }

    @Override
    public void clickMakePhoto() {
        if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_OPPOA37)) {
            clickEnter(AndroidKeyCode.KEYCODE_CAMERA);
        } else {
            waitAndClickAndroidElementByID(makePhoto1PLUSID);
        }
    }

    @Override
    public void clickConfirmPhoto() {
        if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_OPPOA37)) {
            waitAndClickAndroidElementByID(confirmCameraPhotoID);
        } else {
            waitAndClickAndroidElementByID(confirm1PLUSCameraPhotoID);
        }
    }

    @Override
    public void clickCropPhoto() {
        waitAndClickAndroidElementByID(cropCameraPhotoID);
    }

    @Override
    public void waitChooseGalleryFragment() {
        waitAndroidViewById(secondFragmentGalleryID);
    }

    @Override
    public void clickChooseFromGallery2() {
        clickAndroidViewByTextAndID(secondFragmentGalleryID, "Галерея", "не могу найти элемент с именем галерея");
    }

    @Override
    public void waitChoosePicturePage() {

    }

    @Override
    public void clickAllPhotoPage() {

    }

    @Override
    public void waitGallery() {
        waitAndroidViewById(choosePhotoID);
    }

    @Override
    public void chooseFirstPhoto() {

    }

    @Override
    public void confirmChoosingFirstPhoto() {

    }

    @Override
    public void confirmChoosingPhoto() {

    }

    @Override
    public void chooseSecondPhoto() {

    }

    @Override
    public void chooseThirdPhoto() {

    }

    @Override
    public void chooseForthPhoto() {

    }

    @Override
    public void addPhoto() {
        clickChooseCamera();
        clickMakePhoto();
        clickConfirmPhoto();
        clickCropPhoto();

    }

    public void addPhotoFromGallery() {
        clickChooseFromGallery1();
        waitGallery();

    }
}
