package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DownloadAspdfPage;
import utils.FileUtils;

import java.io.File;

public class DownloadAsPdfPageSteps {
    private final DownloadAspdfPage downloadAspdfPage = new DownloadAspdfPage();

    @When("I click the Download button on the Download as PDF page")
    public void clickDownloadButton() {
        downloadAspdfPage.clickDownload();
    }

    @Then("The file with the name displayed on the Download as PDF page is downloaded")
    public void verifyFileIsDownloaded() {
        String downloadFileName = downloadAspdfPage.getDownloadFileName();
        File file = new File("src/test/resources/downloads", downloadFileName);
        Assert.assertTrue(FileUtils.isFileExist(file), "File " + downloadFileName + " is not downloaded.");
    }
}
