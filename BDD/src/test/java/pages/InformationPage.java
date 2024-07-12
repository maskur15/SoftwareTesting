package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class InformationPage extends Form {
    private final ILabel HEADING = getElementFactory().getLabel(By.id("firstHeading"), "information heading");

    public InformationPage() {
        super(By.id("Basic_information"), "information page");
    }

    public String getHeadingText() {
        return HEADING.getText();
    }
    public boolean verifyHeading(String keyword) {
        return HEADING.getText().contains(keyword);
    }
}
