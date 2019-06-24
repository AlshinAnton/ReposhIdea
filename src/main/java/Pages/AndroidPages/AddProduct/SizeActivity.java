package Pages.AndroidPages.AddProduct;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.SizeInterface;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SizeActivity extends AndroidBaseClass implements SizeInterface {

    private String switchMultiSize = "com.reposh.dev:id/switch_multiple_sizes";
    private String size1 = "0+ (до 13 кг)";
    private String size2 = "0/1(до 18 кг)";
    private String size3 = "111-116 (6 лет)";
    private String size4 = "117-122 (7 лет)";
    private String size5 = "123-128 (8 лет)";

    private String oneSize = "One Size";



    public SizeActivity(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitConfirmButton() {
        waitANDROIDElementByTEXT("Применить");
    }

    @Override
    public void clickConfirmButton() {
        clickAndroidElementByText("Применить");
    }

    @Override
    public void switchToMultiSize() {
        waitAndClickAndroidElementByID(switchMultiSize);
    }

    @Override
    public void clickFirstSize() {
        clickAndroidElementByText(oneSize);
    }

    @Override
    public void clickSecondSize() {
        clickAndroidElementByText(size2);
    }

    @Override
    public void clickThirdSize() {
        clickAndroidElementByText(size3);
    }

    @Override
    public void clickForthSize() {
        clickAndroidElementByText(size4);
    }

    @Override
    public void clickFifthSize() {
        clickAndroidElementByText(size5);
    }

    @Override
    public void waitSizeCount() {
        waitANDROIDElementByTEXT("Количество");
    }

    @Override
    public void chooseSizeCount() {
        clickAndroidElementByText("5");
    }

    @Override
    public void chooseOneSize() {
        waitConfirmButton();
        clickFirstSize();
        clickConfirmButton();
    }

    @Override
    public void chooseMultiSize() {
        waitConfirmButton();
        switchToMultiSize();
        clickFirstSize();
        waitSizeCount();
        chooseSizeCount();
        clickSecondSize();
        waitSizeCount();
        chooseSizeCount();
        clickThirdSize();
        waitSizeCount();
        chooseSizeCount();
        clickForthSize();
        waitSizeCount();
        chooseSizeCount();
        clickFifthSize();
        waitSizeCount();
        chooseSizeCount();
        clickConfirmButton();
    }
}
