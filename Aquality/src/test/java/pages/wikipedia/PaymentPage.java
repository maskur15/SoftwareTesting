package pages.wikipedia;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class PaymentPage extends Form {
    private final ILabel amountLabel = getElementFactory().getLabel(By.id("selected-amount"),"selected amount");

    public PaymentPage(){
        super(By.id("selected-amount"),"payment page");
    }

    public String getSelectedAmount() {
        return amountLabel.getText();
    }
}
