package pages.wikipedia;

import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class WelcomePage extends Form {
    private final ILabel welcomeLabel = getElementFactory().getLabel(By.id("Welcome_to_Wikipedia"),"welcome");
    private final ILink donate = getElementFactory().getLink(By.id("n-sitesupport"),"donate");

    public WelcomePage(){
        super(By.id("Welcome_to_Wikipedia"),"Welcome page");
    }

    public boolean isWelcomeDisplayed() {
        return welcomeLabel.state().isDisplayed();
    }

    public void selectDonate() {
        donate.click();
    }
}
