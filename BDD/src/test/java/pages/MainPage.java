package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import io.cucumber.java.jv.Lan;
import org.openqa.selenium.By;

import java.util.List;

public class MainPage extends Form {
    private final ITextBox SEARCH_BOX = getElementFactory().getTextBox(By.id("searchInput"), "search box");
    private final IButton SEARCH_BUTTON = getElementFactory().getButton(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"), "search button");
    private final IComboBox LANGUAGE_DROPDOWN = getElementFactory().getComboBox(By.id("searchLanguage"), "Language Dropdown", ElementState.EXISTS_IN_ANY_STATE);
    private final ILabel FIRST_SUGGESTION = getElementFactory().getLabel(By.xpath("//*[@class='suggestion-title']"), "first suggestion");

    public MainPage() {
        super(By.xpath("//nav[@class='central-featured']"), "Wikipedia home");
    }

    public void searchByText(String keyword) {
        SEARCH_BOX.clearAndType(keyword);
    }

    public void clickSubmit() {
        SEARCH_BOX.click();
        FIRST_SUGGESTION.click();
    }

    public void selectLanguageByVisibleText(String language) {
        LANGUAGE_DROPDOWN.clickAndSelectByText(language);
    }

    public void selectLanguageByValue(String languageValue) {
        LANGUAGE_DROPDOWN.clickAndSelectByValue(languageValue);
    }

    public List<ILink> getSearchList() {
        state().waitForNotDisplayed();
        AqualityServices.getConditionalWait().waitFor(() -> !getElementFactory().findElements(By.id("s"), ElementType.LINK).isEmpty());
        return getElementFactory().findElements(By.id("s"), ElementType.LINK);
    }
}
