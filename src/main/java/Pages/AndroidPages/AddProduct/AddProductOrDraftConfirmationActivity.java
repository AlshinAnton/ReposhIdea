package Pages.AndroidPages.AddProduct;


import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.AddProductOrDraftConfirmationInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddProductOrDraftConfirmationActivity extends AndroidBaseClass implements AddProductOrDraftConfirmationInterface {

    private String checkProductBtnID = "com.reposh.dev:id/showPostBtn";
    private String moveToMyProductBtnID = "com.reposh.dev:id/showProducts";

    public AddProductOrDraftConfirmationActivity(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitAddProductOrDraftConfirmationPage() {
        waitAndroidViewById(checkProductBtnID);
    }

    @Override
    public void clickCheckProductOrDraft() {
        waitAndClickAndroidElementByID(checkProductBtnID);
    }

    @Override
    public void clickMoveToMyProductsOrDrafts() {
        waitAndClickAndroidElementByID(moveToMyProductBtnID);
    }

}
