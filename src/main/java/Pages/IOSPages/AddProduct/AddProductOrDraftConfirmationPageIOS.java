package Pages.IOSPages.AddProduct;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.AddProductOrDraftConfirmationInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddProductOrDraftConfirmationPageIOS extends IOSBaseClass implements AddProductOrDraftConfirmationInterface {
    public AddProductOrDraftConfirmationPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private String checkProductBtnID = "Нужно чтобы Саня добавил";
    private String moveToMyProductBtnID = "Нужно чтобы Саня добавил";

    @Override
    public void waitAddProductOrDraftConfirmationPage() {
        waitIOSViewById(checkProductBtnID);
    }

    @Override
    public void clickCheckProductOrDraft() {
        waitIOSViewById(checkProductBtnID);
        clickViewById(checkProductBtnID);
    }

    @Override
    public void clickMoveToMyProductsOrDrafts() {
        waitIOSViewById(moveToMyProductBtnID);
        clickViewById(moveToMyProductBtnID);
    }
}
