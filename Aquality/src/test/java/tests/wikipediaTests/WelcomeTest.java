package tests.wikipediaTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.wikipedia.MainPage;
import pages.wikipedia.WelcomePage;

public class WelcomeTest extends BaseTest{
    private final MainPage mainPage = new MainPage();
    private final WelcomePage welcomePage = new WelcomePage();

    @Test
    public void welcomeTest() {
        mainPage.clickEnglish();
        Assert.assertTrue(welcomePage.isWelcomeDisplayed(),"Welcome msg is not displayed");
    }

}
