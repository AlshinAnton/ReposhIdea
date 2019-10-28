package Pages.AndroidPages.Chat;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.ChatListInterface;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChatListPage extends AndroidBaseClass implements ChatListInterface {

    public ChatListPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitTestChat() {
        swipeVerticalToElementWithText("tester8");
    }

    @Override
    public void clickByTestChat() {
        clickAndroidElementByText("tester8");
    }

    @Override
    public void swipeToBargain() {
        clickAndroidElementByText("Торги");
    }

    @Override
    public void swipeToDisputes() {
        clickAndroidElementByText("Споры");
    }
}
