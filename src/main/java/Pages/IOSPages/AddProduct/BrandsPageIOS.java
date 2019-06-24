package Pages.IOSPages.AddProduct;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.BrandsInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BrandsPageIOS extends IOSBaseClass implements BrandsInterface {

    private String brandID = "Нужно чтобы Саня добавил";

    public BrandsPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private String searchFieldID = "com.reposh.dev:id/et_search";


    @Override
    public void waitBrandsPage() {
        waitIOSViewById(searchFieldID);
    }

    @Override
    public void clickByAdamexBrand() {
        swipeVertical(brandID);
    }

    @Override
    public void chooseBrand() {
        waitBrandsPage();
        clickByAdamexBrand();
    }

    @Override
    public void clickConfirm() {

    }

    @Override
    public void clickBy08SircusBrand() {

    }
}
