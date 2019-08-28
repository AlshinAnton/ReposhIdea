/*
package Test.TestProjectIO;

import io.testproject.java.sdk.v2.Runner;
import io.testproject.java.sdk.v2.drivers.AndroidDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Tests {

    AndroidDriver driver;

    private static final String DEV_TOKEN = "f3DI93h0DbntnLPJfaBXPHEu_zk5hVqa-eEffxQf2tY1";
    private static final String DEVICE_UDID = "95a4dfae";
    private static final String PACKAGE_NAME = "com.reposh.dev";
    private static final String ACTIVITY_NAME = "com.reposh.presentation.ui.activity.MainActivity";

    private static Runner runner;

    @BeforeAll
    public static void setup() throws InstantiationException {
        runner = Runner.createAndroid(DEV_TOKEN, DEVICE_UDID, PACKAGE_NAME, ACTIVITY_NAME);
    }

    @AfterAll
    public static void tearDown() throws IOException {
        runner.close();
    }

    @Test
    public void runTest() throws Exception {

        // Create test
        SampleTest test = new SampleTest();

        // Run test
        runner.run(test);

    }
}*/
