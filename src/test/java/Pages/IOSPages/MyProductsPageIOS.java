package Pages.IOSPages;


import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.MyProductsInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MyProductsPageIOS extends IOSBaseClass implements MyProductsInterface {
    public MyProductsPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    String productName;

    @Override
    public void waitMyProductsPage() {

    }

    @Override
    public void clickOnModeration() {

    }

    @Override
    public void clickSell() {

    }

    @Override
    public void clickSold() {

    }

    @Override
    public void clickFilters() {

    }

    @Override
    public void clickSearchProduct() {

    }

    @Override
    public void clickSort() {

    }

    @Override
    public void setProductNameToSearch() {

    }

    @Override
    public void clickEnterIOS() {

    }

    @Override
    public void swipeToProduct() {

    }

    @Override
    public void assertNameAddedProduct() {

    }

    @Override
    public void clickByFirstProduct() {

    }

    @Override
    public void setInitialProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public void searchAddedProductInMyProducts() {
        setInitialProductName(productName);
        clickSearchProduct();
        setProductNameToSearch();
        clickEnterIOS();
        clickByFirstProduct();
    }

    @Override
    public void swipeToNextTab() {

    }

    @Override
    public void clickEnter() {

    }
}
