package heroku;

import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileDownloadTest extends BaseTest {
    private final String fileName = "sample.txt";
    private final By fileDownload = By.xpath("//*[contains(text(), 'File Download')]");
    private final By fileNameXpath = By.xpath("//*[contains(text(), '" + fileName + "')]");
    private final String filePath = System.getProperty("user.dir") + "/" + "src/test/resources/" + fileName;
    private final File downloadFile = new File(filePath);

    @Test
    public void fileDownloadTest() {
        driver.findElement(fileDownload).click();
        Assert.assertTrue(driver.findElement(fileNameXpath).isDisplayed(), "File is not displayed");
        driver.findElement(fileNameXpath).click();
        Assert.assertTrue(isFileExist(downloadFile), "File is not downloaded");
    }

    private boolean isFileExist(File file) {
        try {
            Awaitility.await().atMost(30, TimeUnit.SECONDS).until(file::exists);
        } catch (ConditionTimeoutException e) {
            return false;
        }
        file.delete();
        return true;
    }
}
