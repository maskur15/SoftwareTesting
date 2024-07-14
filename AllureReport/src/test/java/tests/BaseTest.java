package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        getBrowser().goTo("https://demoqa.com/");
        getBrowser().waitForPageToLoad();
        getBrowser().maximize();
    }

    @AfterMethod
    public void tearDown() {
        getBrowser().quit();
    }
}