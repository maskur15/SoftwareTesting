package pages.wikipedia;

import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DonationPage extends Form {
    private final IRadioButton inputAmount = getElementFactory().getRadioButton(By.id("input_amount_1"),"input 800");
    private final IButton donateButton = getElementFactory().getButton(By.id("payment-method-button"),"donate button");
    private final ILabel dropdown = getElementFactory().getLabel(By.id("vector-main-menu-dropdown"),"dropdown");

    public DonationPage() {
        super(By.id("donate-form-wrapper"),"Donation page");
    }

    public void selectAmount() {
        inputAmount.click();
    }

    public void clickDonate() {
        dropdown.click();
        donateButton.state().waitForDisplayed(); 
        donateButton.click();
    }
}
