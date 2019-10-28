package Pages.IOSPages.ChatIOS;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.ChatInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ChatPageIOS extends IOSBaseClass implements ChatInterface {
    public ChatPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitSendMessageBtn() {

    }

    @Override
    public void waitMessageField() {

    }

    @Override
    public void writeMessage() {

    }

    @Override
    public void write5messages() {

    }

    @Override
    public void writeLongMessage() {

    }

    @Override
    public void writeMessageWithHieroglyphs() {

    }

    @Override
    public void clickSendButton() {

    }

    @Override
    public void clickAddPhoto() {

    }
}
