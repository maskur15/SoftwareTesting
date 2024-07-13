package tests.heokuTests;

import constants.MainPageNavigation;
import org.testng.Assert;
import pages.heroku.UploadedPage;
import pages.heroku.FileUploadPage;
import utils.SettingsTestData;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseTest {
    private final String FILE_NAME = SettingsTestData.getFileData().getUploadFile();
    private final String FILE_PATH = SettingsTestData.getTestDataPath() + FILE_NAME;
    private File file= new File(FILE_PATH);

    FileUploadPage fileUploadPage = new FileUploadPage();
    UploadedPage uploadedPage = new UploadedPage();

    @Test
    public void fileUploadTest() {
        mainPage.clickNavigationLink(MainPageNavigation.FILE_UPLOAD);
        fileUploadPage.uploadFile(file.getAbsolutePath());
        fileUploadPage.clickSubmit();
        Assert.assertEquals(uploadedPage.retrieveUploadedFileName(),FILE_NAME,"FIle name is not correct");
    }
}
