package tests.wikipediaTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.wikipedia.DownloadPage;
import pages.wikipedia.SearchResultPage;
import utils.FileUtils;
import utils.SettingsTestData;

import java.io.File;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class FileDownloadTest extends BaseTest{
    @Test
    public void downloadTest() {
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not displayed");

        mainPage.enterSearchText(SettingsTestData.getTestData().getSearchKey());
        mainPage.clickSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickTools();
        searchResultPage.clickDownloadAsPdf();

        DownloadPage downloadPage = new DownloadPage();
        downloadPage.clickDownload();

        String filePath = getBrowser().getDownloadDirectory() + File.separator + downloadPage.getDownloadFileName();
        File file = new File(filePath);

        Assert.assertTrue(FileUtils.isFileExist(file), "File is not downloaded");
    }
}
