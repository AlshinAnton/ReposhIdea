/*
package Test;

import Test.AndroidTests.LoginAndRegTests.Login_test;
import Test.AndroidTests.LoginAndRegTests.TestNew;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                TestNew.class
        })
public class TestDifferentPorts extends TestNew {



        @Before
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
        }
}
*/
