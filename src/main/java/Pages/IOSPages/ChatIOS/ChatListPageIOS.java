package Pages.IOSPages.ChatIOS;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.ChatListInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ChatListPageIOS extends IOSBaseClass implements ChatListInterface {
    public ChatListPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitTestChat() {

    }

    @Override
    public void clickByTestChat() {

    }

    @Override
    public void swipeToBargain() {

    }

    @Override
    public void swipeToDisputes() {

    }
}
