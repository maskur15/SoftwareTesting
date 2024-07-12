package tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.IComboBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static aquality.selenium.browser.AqualityServices.getElementFactory;

public class ChangeLanguage {

    private static final By LANGUAGE_DROPDOWN = By.id("searchLanguage");

    @Test
    public void changeLanguageByFramework() {
        getBrowser().goTo("https://www.wikipedia.org/");
        IComboBox languageDropdown = getElementFactory().getComboBox(LANGUAGE_DROPDOWN, "Language Dropdown");

        languageDropdown.state().waitForDisplayed();
        languageDropdown.click();
        WebElement dropdownElement = languageDropdown.getElement();
        Select select = new Select(dropdownElement);
        select.selectByVisibleText("English");
    }
}
