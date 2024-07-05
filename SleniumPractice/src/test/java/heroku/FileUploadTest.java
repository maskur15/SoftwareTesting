package heroku;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.io.File;

public class FileUploadTest extends BaseTest {
    private final String fileName = "hello.txt";
    private final By fileUpload = By.xpath("//*[contains(text(), 'File Upload')]");
    private final By chooseFile = By.id("file-upload");
    private final By fileSubmit = By.id("file-submit");
    private final By uploadedFile = By.id("uploaded-files");

    @Test
    public void fileUploadTest() {
        driver.findElement(fileUpload).click();
        File fileToUpload = new File("src/test/resources/" ,fileName);
        driver.findElement(chooseFile).sendKeys(fileToUpload.getAbsolutePath());
        driver.findElement(fileSubmit).click();
        Assert.assertEquals(driver.findElement(uploadedFile).getText(), fileName, "File name is not found");
    }
}
