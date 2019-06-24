package AndroidAndIOSHelpers;

import com.google.common.base.CharMatcher;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.println;

public abstract class IOSBaseClass {
    private AppiumDriver driver;
    public WebDriverWait wait;

    public IOSBaseClass(AppiumDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    void click(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }

    String getText(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return driver.findElement(element).getText();
    }

    boolean isEnableElement(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        Assert.assertTrue(driver.findElement(element).isEnabled());
        return true;
    }

    void assertText(By element, String text) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        Assert.assertEquals(driver.findElement(element).getText(), text);
    }

    protected void clickViewById(String id) {
        //driver.findElement(By.id(id)).click();
        //driver.findElementsByAccessibilityId(id);
        click(By.id(id));
    }

    protected void clickHiddenViewByID(String id) {
        /*wait.until(ExpectedConditions.);*/
    }

    protected void clickIOSViewByName(String name1) {
        driver.findElement(By.name(name1)).click();
    }

    protected void clickIOSViewByXPath(String xPath) {
        driver.findElement(By.xpath(xPath)).click();
    }


    protected void sendKeysToIOSElementWithID(@Nonnull String id, String text) {
        driver.getKeyboard();
        driver.findElement(By.id(id)).sendKeys(text);
    }


    protected void waitIOSViewById(@Nonnull String id) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        //wait.until(ExpectedConditions.visibilityOf(By.id(id)));
    }

    protected void waitIOSViewByName(@Nonnull String name) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.name(name)));
    }

    protected void closeKeyboard(String tapOutside) {
        driver.hideKeyboard();
    }

    private void assertText(String resID, String erMessage) {
        String str = driver.findElement(By.id(resID)).getText();
        assert str.equals(erMessage);
    }

    private void assertTextFromElementWithID(String resID, String erMessage) {
        String str = driver.findElement(By.id(resID)).getText();
        assert str.equals(erMessage);
    }

    protected void assertTemplate(String id, String errorMessage, String catchMessage) {
        try {
            assertText(id, errorMessage);
        } catch (AssertionError assertionError) {
            System.out.println(catchMessage + errorMessage);
        }
    }

    protected void waitTemplate(String id, String errorMessage) {
        try {
            waitIOSViewById(id);
        } catch (NoSuchElementException noSuchElement) {
            System.out.println("Сообщение: " + errorMessage + " отсутствует на экране");
        }
    }


    protected void swipeHorizontal(String id) {
        WebElement slider = driver.findElement(By.id(id));
        slider.sendKeys("0.1");
    }
    //http://appium.io/docs/en/writing-running-appium/touch-actions/
    protected void swipeVertical(String id) {
        driver.findElement(By.id(id));

        HashMap<String, String> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        driver.executeScript("mobile:scroll", scrollObject);
    }

    protected void scrollToTab() {
        //We want to scroll from All Updates to Browse in Menu
        // Click on Scrollable text element.
        System.out.println("Horizontal scrolling has been started to find tab -&gt; Browse");

        // Used for loop to scroll tabs until Browse displayed.
        for (int i = 0; i < 2; i++) {
            // Set implicit wait to 2 seconds for fast horizontal scrolling.
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            if (driver.findElements(By.name("Browse")).size() != 0) {
                // If Browse Is displayed then click on It.
                driver.findElement(By.name("Browse")).click();
                break;
            }
        }
    }

    protected void compareStringNumbers(String getNumbersFromThisID, String comparedNumbers, String errorMessage) {
        String price2step = getTextFromElementWithId(getNumbersFromThisID);
        CharMatcher digits = CharMatcher.inRange('0', '9').precomputed();
        digits.retainFrom(price2step);
        if (!digits.equals(comparedNumbers)) {
            println(errorMessage);
        }
    }
    protected String getTextFromElementWithId(String id) {
        WebElement elementStartingWithT = driver.findElement(By.id(id));
        String text = elementStartingWithT.getText();

        return text;
    }

    protected MobileElement findChildElementByIDIOS(String parentId, String childId) {
        MobileElement element = (MobileElement) driver.findElement(MobileBy.id(parentId));
        MobileElement childElement = element.findElement(MobileBy.id(childId));
        return childElement;
    }

    protected void assertTextFromChildElementByIDIOS(String parentID, String childID, String expectedMessage) {
        String textFromChildElement = findChildElementByIDIOS(parentID, childID).getText();
        assertTextFromElementWithID(textFromChildElement, expectedMessage);
    }

    protected MobileElement find2StageChildElementByIDIOS(String parentId, String childId, String secondChildId) {
        MobileElement element = (MobileElement) driver.findElement(By.id(parentId));
        MobileElement element2 = element.findElement(By.id(childId));
        MobileElement childElement2 = element2.findElement(By.id(secondChildId));
        return childElement2;
    }

    protected void sendKeysTo2StageChildElementWithIdsIOS(String parentId, String childId, String secondChildId, String text) {
        find2StageChildElementByIDIOS(parentId, childId, secondChildId).sendKeys(text);
    }

    protected String getTextFromElementWithIdIOS(String id) {
        WebElement element = driver.findElement(By.id(id));

        return element.getText();
    }

    protected void clickEnterIOS() {
        driver.getKeyboard().pressKey(Keys.ENTER);
    }

    protected void compareStringNumbersIOS(String getNumbersFromThisID, String comparedNumbers, String errorMessage) {
        String price2step = getTextFromElementWithId(getNumbersFromThisID);
        CharMatcher digits = CharMatcher.inRange('0', '9').precomputed();
        digits.retainFrom(price2step);
        if (!digits.equals(comparedNumbers)) {
            println(errorMessage);
        }
    }

  /*  protected void clickIOSViewByCoordinate(Point x, Point y) {
        TouchAction action= new TouchAction(driver);
        action.press(x, y).perform();
    }*/

    public void allowNotifications() {
        driver.switchTo().alert().accept();
    }
}
