package Pages.IOSPages;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.CommentsInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CommentsPageIOS extends IOSBaseClass implements CommentsInterface {
    public CommentsPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @Override
    public void waitinputField() {

    }

    @Override
    public void clickByInputField() {

    }

    @Override
    public void sendKeysToInputField() {

    }

    @Override
    public void sendComment() {

    }

    @Override
    public void clickBack() {

    }
}
