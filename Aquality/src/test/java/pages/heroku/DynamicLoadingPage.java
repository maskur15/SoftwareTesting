package pages.heroku;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class DynamicLoadingPage extends Form {
    private static final String NAME = "Dynamically Loaded Page Elements";
    private static final String EXAMPLE_TWO_TEXT = "Example 2: Element rendered after the fact";

    private final By EXAMPLE_TWO_LOCATOR = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, EXAMPLE_TWO_TEXT));
    private final By DYNAMIC_LOADING_LOCATOR = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME));

    private final ILabel dynamicLoadingLabel = getElementFactory().getLabel(DYNAMIC_LOADING_LOCATOR, "Dynamic Loading");
    private final ILabel exampleTwoLabel = getElementFactory().getLabel(EXAMPLE_TWO_LOCATOR, "Example 2");
    private final IButton startButton = getElementFactory().getButton(By.id("start"), "Start Button");

    public DynamicLoadingPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void selectExampleTwo() {
        exampleTwoLabel.click();
    }

    public void startDynamicLoading() {
        startButton.state().waitForEnabled();
        startButton.click();
    }
}
