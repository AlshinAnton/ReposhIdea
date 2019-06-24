package Pages.IOSPages.LoginAndRegistration;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.SignUpBrandsInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SignUpBrandsPageIOS extends IOSBaseClass implements SignUpBrandsInterface {

    private String firstBrendXPath = "XCUIElementTypeOther";
    private String nextID = "НАДО ЧТОБЫ САНЯ ДОБАВИЛ";
    private String skipID = "Пропустить";

    public SignUpBrandsPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitBrandsPage() {
        waitIOSViewById(skipID);
    }

    @Override
    public void chooseFirstBrand() {
        clickIOSViewByXPath(firstBrendXPath);
    }

    @Override
    public void clickNext() {
        clickIOSViewByName(nextID);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void clickSkip() {
        clickIOSViewByName(skipID);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
