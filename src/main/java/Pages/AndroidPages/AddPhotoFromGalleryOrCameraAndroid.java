package Pages.AndroidPages;

import AndroidAndIOSHelpers.AndroidBaseClass;
import AppiumSupport.AppiumController;
import Interface.AddPhotoFromGalleryInterface;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.applet.AppletStub;

public class AddPhotoFromGalleryOrCameraAndroid extends AndroidBaseClass implements AddPhotoFromGalleryInterface {


    public AddPhotoFromGalleryOrCameraAndroid(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private String firstFragmentGalleryID = "com.reposh.dev:id/tv_gallery";
    private String firstFragmentCameraID = "com.reposh.dev:id/tv_camera";
    private String secondFragmentGalleryID = "android:id/text1";

    private String confirmOPPOCameraPhotoID = "com.oppo.camera:id/btn_done";
    private String confirm1PLUSCameraPhotoID = "com.oneplus.camera:id/review_ok_button";
    private String confirmXiaoMi5CameraPhotoID = "com.android.camera:id/inten_done_apply";
    private String confirmNEXUSCameraPhotoID = "com.google.android.GoogleCamera:id/shutter_button";

    private String makePhoto1PLUSID = "com.oneplus.camera:id/primary_capture_button";
    private String makePhotoXiaoMiID = "com.android.camera:id/v9_shutter_button_internal";
    private String makePhotoNexusID = "com.google.android.GoogleCamera:id/shutter_button";

    //На Nexus кнопки "сделать фото" и "подтвердить фото" имеют одинаковый id поэтому ждем кнопку возврата
    private String waitConfirmPhotoScreenNexusID = "com.google.android.GoogleCamera:id/retake_button";
    private String cropCameraPhotoID = "com.reposh.dev:id/menu_crop";
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
        if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_1_PLUS_5T)) {
            waitAndClickAndroidElementByID(makePhoto1PLUSID);
        } else if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_1_PLUS_6)) {
            waitAndClickAndroidElementByID(makePhoto1PLUSID);
        } else if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_XIAOMI)) {
            waitAndClickAndroidElementByID(makePhotoXiaoMiID);
        } else if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_NEXUS)) {
            waitAndClickAndroidElementByID(makePhotoNexusID);
        } else {
            clickEnter(AndroidKeyCode.KEYCODE_CAMERA);
        }
    }

    @Override
    public void clickConfirmPhoto() {
        if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_OPPOA37)) {
            waitAndClickAndroidElementByID(confirmOPPOCameraPhotoID);
        } else if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_XIAOMI)) {
            waitAndClickAndroidElementByID(confirmXiaoMi5CameraPhotoID);
        } else if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_1_PLUS_5T )) {
            waitAndClickAndroidElementByID(confirm1PLUSCameraPhotoID);
        } else if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_1_PLUS_6)) {
            waitAndClickAndroidElementByID(confirm1PLUSCameraPhotoID);
        } else if (AppiumController.executionOS.equals(AppiumController.OS.ANDROID_NEXUS)) {
            waitAndroidViewById(waitConfirmPhotoScreenNexusID);
            waitAndClickAndroidElementByID(confirmNEXUSCameraPhotoID);
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
