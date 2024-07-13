package pages.wikipedia;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DownloadPage extends Form{
    private final IButton downloadButton = getElementFactory().getButton(By.xpath("//button[contains(@type,'submit')]"), "Download Button");
    private final ILabel downloadFileName = getElementFactory().getLabel(By.className("mw-electronpdfservice-selection-label-desc"), "Download File");

    public DownloadPage() {
        super(By.xpath("//button[contains(@type,'submit')]"), "Download page");
    }

    public void clickDownload() {
        downloadButton.click();
    }

    public String getDownloadFileName() {
        return downloadFileName.getText();
    }
}
