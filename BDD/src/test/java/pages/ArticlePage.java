package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ArticlePage extends Form {
    private final ILabel TOOL = getElementFactory().getLabel(By.id("vector-page-tools-dropdown"), "tool");
    private final ILabel DOWNLOAD_AS_PDF = getElementFactory().getLabel(By.xpath("//span[contains(text(),'Download as PDF')]"), "download as pdf");
    private final ILabel PAGE_INFORMATION = getElementFactory().getLabel(By.xpath("//a/span[text()='Page information']"), "page information");
    private final ILabel ARTICLE_HEADING = getElementFactory().getLabel(By.className("mw-page-title-main"),"article heading");

    public ArticlePage() {
        super(By.id("bodyContent"), "Article page");
    }

    public void clickTool() {
        TOOL.click();
    }

    public void clickDownloadAsPdf() {
        DOWNLOAD_AS_PDF.click();
    }

    public void clickPageInformation() {
        PAGE_INFORMATION.click();
    }

    public boolean isArticlePageOpen(String articleName) {
        return ARTICLE_HEADING.getText().contains(articleName);
    }
}
