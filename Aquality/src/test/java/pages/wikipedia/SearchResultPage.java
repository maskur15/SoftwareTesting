package pages.wikipedia;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SearchResultPage extends Form {
    private final IButton toolsBox = getElementFactory().getButton(By.xpath("//nav[contains(@class, 'tools-landmark')]"), "Tools");
    private final ILink downloadAsPdfLink = getElementFactory().getLink(By.id("coll-download-as-rl"), "Download as PDF Link");

    public SearchResultPage() {
        super(By.xpath("//nav[contains(@class, 'tools-landmark')]"), "Search result page");
    }

    public void clickTools() {
        toolsBox.click();
    }

    public void clickDownloadAsPdf() {
        downloadAsPdfLink.click();
    }
}