package Pages.IOSPages.LoginAndRegistration;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.OnboardingInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class OnBoardingPageIOS extends IOSBaseClass implements OnboardingInterface {
    public OnBoardingPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    String closeOnBoardingName = "Войти";

    @Override
    public void allowNotifications() {
        waitIOSViewByName("Разрешить");
        clickIOSViewByName("Разрешить");
    }

    @Override
    public void waitThenCloseOnBoardingPage() {
        waitIOSViewByName(closeOnBoardingName);
        clickIOSViewByName(closeOnBoardingName);
    }
}
