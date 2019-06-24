package Pages.IOSPages;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.AddPhotoFromGalleryInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddPhotoFromGalleryOrCameraIOS extends IOSBaseClass implements AddPhotoFromGalleryInterface {

    public AddPhotoFromGalleryOrCameraIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private String chooseGalleryBtnID = "ui_test_id_gallery_alert_button";
    private String chooseCameraBtnID = "ui_test_id_camera_alert_button";
    private String makePhotoBtnID = "PhotoCapture";

    private String confirmCameraPhotoID = "Исп. фото";
    private String cropCameraPhotoID = "Готово";



    @Override
    public void waitAddPhotoFragment() {
        waitIOSViewById(chooseGalleryBtnID);
    }

    @Override
    public void clickChooseFromGallery1() {
        waitIOSViewById(chooseGalleryBtnID);
        clickViewById(chooseGalleryBtnID);
    }

    @Override
    public void clickChooseCamera() {
        waitIOSViewById(chooseCameraBtnID);
        clickViewById(chooseCameraBtnID);
    }

    @Override
    public void clickMakePhoto() {
        waitIOSViewById(makePhotoBtnID);
        clickViewById(makePhotoBtnID);
    }

    @Override
    public void clickConfirmPhoto() {
            waitIOSViewById(confirmCameraPhotoID);
            clickViewById(confirmCameraPhotoID);

    }

    @Override
    public void clickCropPhoto() {
        waitIOSViewById(cropCameraPhotoID);
        clickViewById(cropCameraPhotoID);
    }

    @Override
    public void waitChooseGalleryFragment() {
        //waitAndroidViewById(secondFragmentGalleryID);
    }

    @Override
    public void clickChooseFromGallery2() {
    }

    @Override
    public void waitChoosePicturePage() { }

    @Override
    public void clickAllPhotoPage() { }

    @Override
    public void waitGallery() { }

    @Override
    public void chooseFirstPhoto() { }

    @Override
    public void confirmChoosingFirstPhoto() { }

    @Override
    public void confirmChoosingPhoto() { }

    @Override
    public void chooseSecondPhoto() { }

    @Override
    public void chooseThirdPhoto() { }

    @Override
    public void chooseForthPhoto() { }

    @Override
    public void addPhoto() {
        clickChooseCamera();
        clickMakePhoto();
        clickConfirmPhoto();
        clickCropPhoto();
    }
}
