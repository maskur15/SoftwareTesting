package tests.heokuTests;

import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.heroku.DynamicLoadingPage;

public class DynamicLoadingTest extends BaseTest {
    private final DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();

    @Test
    public void dynamicLoadingTest() {
        mainPage.clickNavigationLink(MainPageNavigation.DYNAMIC_LOADING);
        Assert.assertTrue(dynamicLoadingPage.state().isDisplayed(),"Dynamic Loading page is not displayed");

        dynamicLoadingPage.selectExampleTwo();
        dynamicLoadingPage.startDynamicLoading();
    }
}
