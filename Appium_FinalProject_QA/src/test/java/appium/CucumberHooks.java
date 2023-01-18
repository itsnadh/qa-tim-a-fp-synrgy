package appium;

import java.net.MalformedURLException;

import io.cucumber.java.*;

public class CucumberHooks {
    @Before
    public static void beforeAll() throws MalformedURLException {
        System.out.println("before all");
        BaseTest.setup();
    }

    @After
    public static void afterAll() {
        System.out.println("after");
        BaseTest.teardown();
    }
}