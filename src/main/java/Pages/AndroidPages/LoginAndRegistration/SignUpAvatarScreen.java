package Pages.AndroidPages.LoginAndRegistration;


import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.SignUpAvatarInterface;
import io.appium.java_client.AppiumDriver;

public class SignUpAvatarScreen extends AndroidBaseClass implements SignUpAvatarInterface {
    String addPhotoID = "com.reposh.dev:id/btn_add_photo";
    String skipID = "com.reposh.dev:id/btn_miss";
    String nextID = "com.reposh.dev:id/btn_next";
    String chooseGaleryID = "com.reposh.dev:id/tv_gallery";
    String makePhoto = "com.reposh.dev:id/tv_camera";
    String galleryID = "com.android.gallery:id/grid";
    String confirmPhotoID = "com.reposh.dev:id/menu_crop";

    public SignUpAvatarScreen(AppiumDriver driver) {
        super(driver);
    }


    public void waitAddPhotoPage() {
        waitAndroidViewById(addPhotoID);
    }

    public void waitMakePhotoFragment() {
        waitAndroidViewById(chooseGaleryID);
    }

    public void clickAddPhoto() {
        waitAndClickAndroidElementByID(addPhotoID);
    }

    public void  clickSkipPage() {
        waitAndClickAndroidElementByID(skipID);
    }

    public void clickNext() {
        waitAndClickAndroidElementByID(nextID);
    }

    public void choosePhotoFromGalery () {
        waitAndClickAndroidElementByID(chooseGaleryID);
    }

    public void makePhoto () {
        waitAndClickAndroidElementByID(chooseGaleryID);
    }

    public void waitGallery() {
        waitAndroidViewByIdAndInstance(galleryID, 0);
    }

    public void clickByFirstPhoto() {
        clickAndroidElementByIDAndInstance(galleryID, 0);
    }

    public void confirmChoosingPhoto() {
        waitAndClickAndroidElementByID(confirmPhotoID);
    }

}
