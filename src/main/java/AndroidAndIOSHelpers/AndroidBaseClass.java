package AndroidAndIOSHelpers;


import com.google.common.base.CharMatcher;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.sql.DriverManager.println;
import static java.time.Duration.ofMillis;

public abstract class AndroidBaseClass {
    private AppiumDriver driver;

    public AndroidBaseClass(AppiumDriver driver) {
        this.driver = driver;
    }


    protected MobileElement findChildElementByID(String parentId, String childId) {
        MobileElement element = (MobileElement) driver.findElement(MobileBy.id(parentId));
        return element.findElement(MobileBy.id(childId));
    }

    protected void swipeToRight(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }

    protected void  hideKeyboard() {
        clickEnter(AndroidKeyCode.KEYCODE_BACK);
    }

    protected void swipeToRightWithData() {
        swipeToRight(0.9, 0.1, 0.6);
    }

    protected MobileElement findChildElementByIDAndText(String parentId, String childText) {
        MobileElement element = (MobileElement) driver.findElement(MobileBy.id(parentId));
        return element.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + childText + "\")"));
    }

    protected void assertTextFromChildElementByID(String parentID, String childID, String expectedMessage) {
        String textFromChildElement = findChildElementByID(parentID, childID).getText();
        assertTextFromElementWithID(textFromChildElement, expectedMessage);
    }

    private MobileElement find2StageChildElementByID(String parentId, String childId, String secondChildId) {
        MobileElement element = (MobileElement) driver.findElement(MobileBy.id(parentId));
        MobileElement element2 = element.findElement(MobileBy.id(childId));
        return element2.findElement(MobileBy.id(secondChildId));
    }

    protected void sendKeysTo2StageChildElementWithIds(String parentId, String childId, String secondChildId, String text) {
        find2StageChildElementByID(parentId, childId, secondChildId).sendKeys(text);
    }

    //ID
    protected void waitAndroidViewById(String id) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator(
                "new UiSelector().resourceId(\"" + id + "\")")));
    }

    public void waitAndClickAndroidElementByID(String id) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).click();
    }

    protected void sendKeysToAndroidElementWithID(String id, String text) {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().resourceId(\"" + id + "\")"))
                .sendKeys(text);
    }

    protected void sendKeysToActiveElement(String text) {
        WebElement element = driver.switchTo().activeElement();
        element.sendKeys(text);
    }

    protected void clearFieldNameQuery(WebElement element) {
        WebElement mob = driver.findElement(By.name("Mobile Number"));
        mob.click();
        mob.clear();
        /*WebElement text = driver.findElement(By.xpath("//UIATextField[1]"));
        text.sendKeys("12");
        text.clear();*/
        /*while (!textField().getText().isEmpty()) {
            TouchAction touchAction = new TouchAction(driver);
            touchAction.longPress(textField());
            driver.getKeyboard().sendKeys(Keys.DELETE);
        }*/
        /*WebElement element2 = appiumDriver.findElement(By.xpath(element));
        element2.sendKeys(Keys.CONTROL + "a");
        element2.sendKeys(Keys.DELETE);*/
    }

    protected void clearFieldIdQuery() { }

    //ТЕКСТ
    protected void waitAndClickAndroidElementByText(String text) {
        MobileElement topCharts = ((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"" + text + "\")");
        topCharts.click();
    }

    protected void waitANDROIDElementByTEXT(String text) {
        ((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"" + text + "\")");
    }

    protected void clickAndroidElementByText(String text) {
        MobileElement topCharts = ((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"" + text + "\")");
        topCharts.click();
    }

    protected void clickAndroidViewByTextAndID(String id, String text, String failSearchText) {
        String txt = driver.findElement(MobileBy.AndroidUIAutomator(
                String.format("new UiSelector().resourceId(\"" + id + "\")"))).getText();
        if (txt.equals(text)) {
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(" + id + ")")).click();
        } else {
            System.out.println(failSearchText);
        }
    }

    protected String getTextFromElementWithId(String id) {
        MobileElement element = ((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"" + id + "\")");
        return element.getText();
    }

    protected String getTextFromElementWithIdAndInstance(String id, int instance) {
        MobileElement element = ((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"" + id + "\").instance(" + instance + ")");
        return element.getText();
    }

    protected void swipeVerticalToElementWithTextAndClick(String someText) {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + someText + "\"));")).click();
    }

    protected void swipeVerticalToElementWithText(String someText) {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + someText + "\"));"));
    }

    //ID + INSTANCE
    protected void waitAndroidViewByIdAndInstance(String id, int instance) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator(
                "new UiSelector().resourceId(\"" + id + "\").instance(" + instance + ")")));
    }

    protected void clickAndroidElementByIDAndInstance(String id, int instance) {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().resourceId(\"" + id + "\").instance(" + instance + ")"))
                .click();
    }

    protected void sendKeysToAndroidElementByIDAndInstance(String id, int instance, String text) {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().resourceId(\"" + id + "\").instance(" + instance + ")"))
                .sendKeys(text);
    }

    protected void clearField(String id, String instance) {
        try {
            clearFieldWithIdAndInstance(id, instance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Находит вьюху по resID and instance и сравнивает с требуемым значением
    private void assertTextIDAndInstance(String resID, int instance, String waitingText) {
        String str = driver.findElement(MobileBy.AndroidUIAutomator(
                String.format("new UiSelector().resourceId(\"" + resID + "\").instance(" + instance + ")", resID))).getText();
        assert str.equals(waitingText);
    }

    private void assertTextFromElementWithID(String resID, String erMessage) {
        String str = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().resourceId(\"" + resID + "\")")).getText();
        assert str.equals(erMessage);
    }

    private void clearFieldWithIdAndInstance(String resID, String instance) throws InterruptedException {
        WebElement element;
        element = driver.findElement(MobileBy.AndroidUIAutomator(
                ("new UiSelector().resourceId(\"" + resID + "\").instance(" + instance + ")")));
        element.click();
        Thread.sleep(500);
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }

    protected void assertTemplateStringsByIdAndInstance(String getTextFromElementWithID, int instance, String whatWeAreWaiting, String errorMes) {
        try {
            assertTextIDAndInstance(getTextFromElementWithID, instance, whatWeAreWaiting);
        } catch (AssertionError assertionError) {
            System.out.println(whatWeAreWaiting + errorMes);
        }
    }

    protected void assertTemplateStringsById(String getTextFromElementWithID, String waitingText, String catchMessage) {
        try {
            assertTextFromElementWithID(getTextFromElementWithID, waitingText);
        } catch (AssertionError assertionError) {
            System.out.println(catchMessage + waitingText);
        }
    }

    protected void assertTextWithSwipe(String filter) {
        try {
            swipeVerticalToElementWithText(filter);
        } catch (NoSuchElementException e) {
            println(filter + " не найден\n" + e);
        }
    }

    protected void waitElementWithIDAndInstanceTemplate(String id, int instance, String errorMessage) {
        try {
            waitAndroidViewByIdAndInstance(id, instance);
        } catch (NoSuchElementException noSuchElement) {
            System.out.println("Сообщение: " + errorMessage + " отсутствует на экране");
        }
    }

    protected void assertWaitElementWithIDTemplate(String id, String errorMessage) {
        try {
            waitAndroidViewById(id);
        } catch (NoSuchElementException noSuchElement) {
            System.out.println("Сообщение: " + errorMessage + " отсутствует на экране");
        }
    }

    protected void assertWaitChildElementWithIDTemplate(String id, String errorMessage) {
        try {
            waitAndroidViewById(id);
        } catch (NoSuchElementException noSuchElement) {
            System.out.println("Сообщение: " + errorMessage + " отсутствует на экране");
        }
    }

    protected void swipeHorizontalToTab(int tabsCount, String tabName) {
        for (int i = 0; i < tabsCount; i++) {
            // Set implicit wait to 2 seconds for fast horizontal scrolling.
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            if (driver.findElements(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector()).scrollIntoView(text(" + tabName + "))")).size() != 0) {
                // If Browse Is displayed then click on It.
                driver.findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView(text(" + tabName + "))")).click();
                break;
            }
        }
    }

    protected void clickEnter(int key) {
        ((AndroidDriver) driver).pressKeyCode(key);
    }

    protected void compareStringNumbers(String getNumbersFromThisID, String comparedNumbers, String errorMessage) {
        String price2step = getTextFromElementWithId(getNumbersFromThisID);
        CharMatcher digits = CharMatcher.inRange('0', '9').precomputed();
        digits.retainFrom(price2step);
        if (!digits.equals(comparedNumbers)) {
            println(errorMessage);
        }
    }

    protected void openNotificationBase() throws InterruptedException {
        ((AndroidDriver) driver).openNotifications();
        sleep(1);
    }

    protected void sleep(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);
    }

    protected void turnWiFiOffBase() {
        //NetworkConnection.ConnectionType.NONE;
    }

    protected void turnWiFiOnBase() {

    }
}
