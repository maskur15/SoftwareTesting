package pages.heroku;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class FileDownloadPage extends Form {
    private static final String NAME = "File Download";

    public FileDownloadPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void clickDownloadLink(String fileName) {
        getFileDownloadLink(fileName).click();
    }

    public boolean isDownloadLinkVisible(String fileName) {
        return getFileDownloadLink(fileName).state().waitForDisplayed();
    }

    private ILink getFileDownloadLink(String fileName) {
        return getElementFactory().getLink(
                By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, fileName)), fileName);
    }
}
