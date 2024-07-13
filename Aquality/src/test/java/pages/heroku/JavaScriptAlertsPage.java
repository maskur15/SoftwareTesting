package pages.heroku;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends Form {
    private static final String PAGE_NAME = "JavaScript Alerts";
    private final By CLICK_FOR_JS_ALERT_BUTTON_LOCATOR = By.xpath("//button[@onclick='jsAlert()']");
    private final By SUCCESS_MESSAGE_LOCATOR = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "You successfully clicked an alert"));

    private final IButton clickForJsAlertButton = getElementFactory().getButton(CLICK_FOR_JS_ALERT_BUTTON_LOCATOR, "Click for JS alert");
    private final ILabel successLabel = getElementFactory().getLabel(SUCCESS_MESSAGE_LOCATOR, "Success");

    public JavaScriptAlertsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void clickForJsAlertButton() {
        clickForJsAlertButton.click();
    }

    public boolean isSuccessLabelDisplayed() {
        return successLabel.state().isDisplayed();
    }
}
