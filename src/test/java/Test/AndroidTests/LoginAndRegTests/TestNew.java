package Test.AndroidTests.LoginAndRegTests;

import Pages.AndroidPages.LoginAndRegistration.LoginScreen;
import Pages.AndroidPages.LoginAndRegistration.OnBoardingScreen;
import Pages.AndroidPages.LoginAndRegistration.User;
import Pages.AndroidPages.Tape.TapeScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class TestNew {

    protected AppiumDriver driver;

    /*@Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }*/


    @Test
    public void LogIn() {
        OnBoardingScreen onBoardingScreen = new OnBoardingScreen(driver);
        onBoardingScreen.waitThenCloseOnBoardingPage();
        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.login(new User.User1());
        TapeScreen tapeScreen = new TapeScreen(driver);
        tapeScreen.closeTooltips();
    }
}
