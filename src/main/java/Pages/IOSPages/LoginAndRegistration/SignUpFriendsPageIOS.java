package Pages.IOSPages.LoginAndRegistration;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.SignUpFriendsInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SignUpFriendsPageIOS extends IOSBaseClass implements SignUpFriendsInterface {

    private String skipID = "Пропустить";
    private String nextID = "НАДО ЧТОБЫ САНЯ ДОБАВИЛ";

    private String findFriendsFromFaceBook = "Найти друзей с Facebook";
    private String findFriendsFromVK = "Найти друзей из ВКонтакте";
    private String findFriendsFromContacts = "Искать из телефонной книги";


    public SignUpFriendsPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void clickSkip() {
        waitIOSViewByName(skipID);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickIOSViewByName(skipID);
    }

    @Override
    public void clickNext() {
        waitIOSViewByName(nextID);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickIOSViewByName(nextID);
    }
}
