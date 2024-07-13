package pages.heroku;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class FileUploadPage extends Form {
    private static final String NAME = "File Upload";
    private final By CHOOSE_FILE_LOCATOR = By.id("file-upload");
    private final By FILE_SUBMIT_LOCATOR = By.id("file-submit");

    private ITextBox fileNameInput = getElementFactory().getTextBox(CHOOSE_FILE_LOCATOR, "Upload");
    private IButton fileSubmitButton = getElementFactory().getButton(FILE_SUBMIT_LOCATOR, "Submit");

    public FileUploadPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void uploadFile(String filePath) {
        fileNameInput.clearAndType(filePath);
    }

    public void clickSubmit() {
        fileSubmitButton.click();
    }
}
