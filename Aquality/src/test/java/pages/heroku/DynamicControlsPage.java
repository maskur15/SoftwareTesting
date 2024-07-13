package pages.heroku;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class DynamicControlsPage extends Form {
    private static final String NAME = "Dynamic Controls";
    private final By ENABLE_BUTTON_LOCATOR = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Enable"));
    private final By INPUT_FIELD_LOCATOR = By.xpath("//*[@id='input-example']//input");

    private IButton enableButton = getElementFactory().getButton(ENABLE_BUTTON_LOCATOR, "Enable Button");
    private ITextBox textField = getElementFactory().getTextBox(INPUT_FIELD_LOCATOR, "Input Field");

    public DynamicControlsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void clickEnableButton() {
        enableButton.click();
    }

    public boolean isInputEnabled() {
        return textField.state().waitForEnabled();
    }

    public void enterText(String text) {
        textField.clearAndType(text);
    }

    public String fetchInputText() {
        return textField.getValue();
    }
}
