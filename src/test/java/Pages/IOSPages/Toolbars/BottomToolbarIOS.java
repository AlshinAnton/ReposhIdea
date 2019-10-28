package Pages.IOSPages.Toolbars;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.BottomToolbarInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BottomToolbarIOS extends IOSBaseClass implements BottomToolbarInterface {

    private String tapeID = "tapeToolbarId";
    private String searchID = "searchToolbarId";
    private String addProductID = "addProductToolbarId";
    private String newsID = "chatToolbarId";
    private String profileID = "profileToolbarId";

    public BottomToolbarIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void clickTape() {
        clickViewById(tapeID);
    }

    @Override
    public void clickSearch() {
        clickViewById(searchID);
    }

    @Override
    public void clickAddProduct() {
        clickViewById(addProductID);
    }

    @Override
    public void clickNews() {
        clickViewById(newsID);
    }

    @Override
    public void clickProfile() {
        clickViewById(profileID);
    }

    @Override
    public void waitTape() {
        waitIOSViewById(tapeID);
    }
}
