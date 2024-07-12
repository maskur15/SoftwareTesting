package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DownloadAspdfPage extends Form {
    private final ILabel DOWNLOAD_FILE = getElementFactory().getLabel(By.xpath("//div[@class='mw-electronpdfservice-selection-label-desc']"), "download file name");
    private final IButton DOWNLOAD_BTN = getElementFactory().getButton(By.xpath("//button//span[text()='Download']"), "download button");

    public DownloadAspdfPage() {
        super(By.xpath("//button//span[text()='Download']"), "Download page");
    }

    public String getDownloadFileName() {
        return DOWNLOAD_FILE.getText();
    }

    public void clickDownload() {
        DOWNLOAD_BTN.click();
    }
}
