package pages.wikipedia;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    private final ITextBox searchInput = getElementFactory().getTextBox(By.id("searchInput"), "Search Input");
    private final IButton searchButton = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Search Button");
    private final ILink englishLanguage = getElementFactory().getLink(By.id("js-link-box-en"),"English language");

    public MainPage() {
        super(By.className("central-featured"), "Wikipedia home page");
    }

    public void enterSearchText(String searchText) {
        searchInput.clearAndType(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickEnglish() {
        englishLanguage.click();
    }
}
