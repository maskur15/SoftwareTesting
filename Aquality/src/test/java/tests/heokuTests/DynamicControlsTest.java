package tests.heokuTests;

import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.heroku.DynamicControlsPage;

import java.util.UUID;

public class DynamicControlsTest extends BaseTest {
    private final DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    private final String randomText = UUID.randomUUID().toString();

    @Test
    public void dynamicControlsTest() {
        mainPage.clickNavigationLink(MainPageNavigation.DYNAMIC_CONTROLS);
        dynamicControlsPage.clickEnableButton();
        Assert.assertTrue(dynamicControlsPage.isInputEnabled(), "Input field is not enabled");
        dynamicControlsPage.enterText(randomText);
        Assert.assertEquals(dynamicControlsPage.fetchInputText(), randomText, "Input text value is not the same");
    }
}
