package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class Mainpage extends Form {
    private final ILabel elementLocator = getElementFactory().getLabel(By.xpath("//*[@class='card-up']"),"element locator");

    public Mainpage() {
        super(By.className("category-cards"),"home page");
    }

    @Step("Click the element tab")
    public void clickElement() {
        elementLocator.click();
    }
}

