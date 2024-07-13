package pages.heroku;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class UploadedPage extends Form {
    private static final String FILE_UPLOADED = "File Uploaded";
    private final By UPLOADED_FILE_LOCATOR = By.id("uploaded-files");
    private ILabel uploadedFileLabel = AqualityServices.getElementFactory().getLabel(UPLOADED_FILE_LOCATOR, "File name");

    public UploadedPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, FILE_UPLOADED)), FILE_UPLOADED);
    }

    public String retrieveUploadedFileName() {
        return uploadedFileLabel.getText();
    }
}
