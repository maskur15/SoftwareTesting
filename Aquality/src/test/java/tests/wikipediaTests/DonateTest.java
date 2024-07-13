package tests.wikipediaTests;

import org.testng.annotations.Test;
import pages.wikipedia.DonationPage;
import pages.wikipedia.MainPage;
import pages.wikipedia.WelcomePage;

public class DonateTest extends BaseTest{
    private final MainPage mainPage = new MainPage();
    private final WelcomePage welcomePage = new WelcomePage();
    private final DonationPage donationPage = new DonationPage();


    @Test
    public void donationTest() {
        mainPage.clickEnglish();
        welcomePage.selectDonate();
        donationPage.selectAmount();
        donationPage.clickDonate();

    }
}
