package tests.heokuTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import pages.heroku.BasicAuthPage;
import utils.SettingsTestData;
import constants.MainPageNavigation;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class BasicAuthTest extends BaseTest {
    private final BasicAuthPage basicAuthPage = new BasicAuthPage();

    @BeforeMethod
    public void auth() {
        getBrowser().network().addBasicAuthentication(SettingsTestData.getEnvData().getDomain(),
                SettingsTestData.getUserData().getUsername(),SettingsTestData.getUserData().getPassword());
    }

    @Test
    public void basicAuthTest() {
        mainPage.clickNavigationLink(MainPageNavigation.BASIC_AUTH);
        Assert.assertTrue(basicAuthPage.isSuccessMsgDisplayed(),"Success messge is not displayed");
    }
}
