package Pages.IOSPages;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.TapeInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TapePageIOS extends IOSBaseClass implements TapeInterface {

    private String searchFieldID = "";
    private String tooltip1ID = "hintControllerTultipNo0TestId";
    private String tooltip2ID = "hintControllerTultipNo1TestId";
    private String tooltip3ID = "hintControllerTultipNo2TestId";

    public TapePageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void waitSearchField() {}

    @Override
    public void clickBySearchField() {}

    @Override
    public void sendTESTEToSearch() {}

    @Override
    public void clickSearch() {}

    @Override
    public void switchToSellers() {}

    @Override
    public void clickTESTE() {}

    @Override
    public void waitSortIcon() {}

    @Override
    public void closeTooltips() {
        waitIOSViewById(tooltip1ID);
        clickViewById(tooltip1ID);
        waitIOSViewById(tooltip2ID);
        clickViewById(tooltip2ID);
        waitIOSViewById(tooltip3ID);
        clickViewById(tooltip3ID);
    }

    @Override
    public void clickSearchIcon() {

    }
}
