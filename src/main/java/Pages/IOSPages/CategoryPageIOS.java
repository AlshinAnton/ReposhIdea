package Pages.IOSPages;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.CategoryInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CategoryPageIOS extends IOSBaseClass implements CategoryInterface {
    public CategoryPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @Override
    public void waitCategoryScreen() {

    }

    @Override
    public void womensWardrobe() {

    }

    @Override
    public void clickAccessories() {

    }

    @Override
    public void chooseAccessoriesCategory() {
        waitCategoryScreen();
        womensWardrobe();
        clickAccessories();
    }
}
