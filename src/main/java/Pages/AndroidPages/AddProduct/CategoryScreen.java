package Pages.AndroidPages.AddProduct;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.CategoryInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CategoryScreen extends AndroidBaseClass implements CategoryInterface {

    public CategoryScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private String categoryFieldID = "com.reposh.dev:id/text_category";


    @Override
    public void waitCategoryScreen() {
        waitAndroidViewByIdAndInstance(categoryFieldID, 1);
    }

    @Override
    public void womensWardrobe() {
        //clickAndroidElementByIDAndInstance(categoryFieldID, 1);
        waitAndClickAndroidElementByText("Женский гардероб");
    }

    @Override
    public void clickAccessories() {
        waitAndClickAndroidElementByText("Аксессуары");
    }

    @Override
    public void chooseAccessoriesCategory() {
        waitCategoryScreen();
        clickAccessories();
    }


}
