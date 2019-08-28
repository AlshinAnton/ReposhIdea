/*
package Test.TestProjectIO;

import Pages.AndroidPages.LoginAndRegistration.LoginScreen;
import Pages.AndroidPages.LoginAndRegistration.OnBoardingScreen;
import Pages.AndroidPages.Tape.TapeScreen;
import io.testproject.java.sdk.v2.drivers.AndroidDriver;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import io.testproject.java.sdk.v2.tests.AndroidTest;
import io.testproject.java.sdk.v2.tests.helpers.AndroidTestHelper;

public class SampleTest implements AndroidTest {
    @Override
    public ExecutionResult execute(AndroidTestHelper helper) throws FailureException {

        AndroidDriver driver = helper.getDriver();

        driver.resetApp();
        // Create test
        OnBoardingScreen onBoardingScreen = new OnBoardingScreen(driver);
        onBoardingScreen.waitThenCloseOnBoardingPage();
        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.enterPhoneNumber("9999999999");
        loginScreen.clickReceiveCodeBtn();
        loginScreen.waitCodeScreen();
        loginScreen.enterCode();
        loginScreen.clickConfirmCodeBtn();
        TapeScreen tapeScreen = new TapeScreen(driver);
        tapeScreen.waitSortIcon();

        return tapeScreen.waitSortIcon() ?ExecutionResult.PASSED : ExecutionResult.FAILED;

*/
/*
        // Run test
        runner.run(test);
        return null;*//*



    }
}
*/
