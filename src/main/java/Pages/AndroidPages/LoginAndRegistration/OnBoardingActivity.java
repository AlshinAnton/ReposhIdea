package Pages.AndroidPages.LoginAndRegistration;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.OnboardingInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OnBoardingActivity extends AndroidBaseClass implements OnboardingInterface {

    String enterWithPhone = "com.reposh.dev:id/btnEnter";
    String enterWithMamsy = "com.reposh.dev:id/btnEnterMamsy";

    public OnBoardingActivity(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void allowNotifications() {
    }

    @Override
    public void waitThenCloseOnBoardingPage() {
        waitAndClickAndroidElementByID(enterWithPhone);
    }
}