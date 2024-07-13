package tests.heokuTests;

import aquality.selenium.browser.AlertActions;
import pages.heroku.JavaScriptAlertsPage;
import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class AlertTest extends BaseTest {
    private final JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @Test
    public void alertTest() {
        mainPage.clickNavigationLink(MainPageNavigation.JAVASCRIPT_ALERT);
        javaScriptAlertsPage.clickForJsAlertButton();
        getBrowser().handleAlert(AlertActions.ACCEPT);
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(), "Success message is not displayed");
    }
}
