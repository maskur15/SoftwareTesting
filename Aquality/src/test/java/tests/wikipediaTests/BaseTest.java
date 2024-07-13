package tests.wikipediaTests;

import aquality.selenium.browser.AqualityServices;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.wikipedia.MainPage;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public abstract class BaseTest {
    protected final MainPage mainPage = new MainPage();

    @BeforeMethod
    public void setup() {
        getBrowser().maximize();
        getBrowser().goTo("https://www.wikipedia.org/");
    }

    @AfterMethod
    public void teardown() {
        if (AqualityServices.isBrowserStarted()) {
            getBrowser().quit();
        }
    }
}