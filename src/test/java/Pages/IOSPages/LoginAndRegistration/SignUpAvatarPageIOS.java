package Pages.IOSPages.LoginAndRegistration;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.SignUpAvatarInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SignUpAvatarPageIOS extends IOSBaseClass implements SignUpAvatarInterface {

    String avatarImageID = "AvatarImage";
    String addPhotoID = "AddPhoto";
    String skipID = "Skip";
    String nextID = "Next";

    String chooseGaleryID = "gallery";  //не задан
    String makePhoto = "camera"; // не задан
    String closeGalleryFragment = "Cancel";
    String galleryID = "НАДО ПОДГОНЯТЬ ПОД КОНКРЕТНОЕ УСТРОЙТСВО";
    String confirmPhotoID = "Done";

    public SignUpAvatarPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitAddPhotoPage() {
        waitIOSViewById(addPhotoID);
    }

    @Override
    public void waitMakePhotoFragment() {
        waitIOSViewByName(chooseGaleryID);
    }

    @Override
    public void clickAddPhoto() {
        clickViewById(addPhotoID);
    }

    @Override
    public void clickSkipPage() {
        clickViewById(skipID);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void clickNext() {
        clickViewById(nextID);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void choosePhotoFromGalery() {
        clickIOSViewByName(galleryID);
    }

    @Override
    public void makePhoto() {
        clickIOSViewByName(makePhoto);
    }

    @Override
    public void waitGallery() {
        waitIOSViewByName(galleryID);
    }

    @Override
    public void clickByFirstPhoto() {
        clickIOSViewByName(galleryID);
    }

    @Override
    public void confirmChoosingPhoto() {
        waitIOSViewByName(confirmPhotoID);
        clickIOSViewByName(confirmPhotoID);
    }
}
