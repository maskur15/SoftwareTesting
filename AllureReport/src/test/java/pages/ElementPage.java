package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ElementPage extends Form {
    private final ILabel textBox = getElementFactory().getLabel(By.xpath("//*[text()='Text Box']"), "text box");
    private final ILabel inputUsername = getElementFactory().getLabel(By.id("userName"), "username");
    private final ILabel inputEmail = getElementFactory().getLabel(By.id("userEmail"), "user email");
    private final IButton submit = getElementFactory().getButton(By.cssSelector(".btn.btn-primary"), "submit button");
    private final ILabel name = getElementFactory().getLabel(By.id("name"), "name");
    private final ILabel email = getElementFactory().getLabel(By.id("email"), "email");
    private final ILabel checkBox = getElementFactory().getLabel(By.xpath("//span[text()='Check Box']"), "checkbox button");
    private final ILabel home = getElementFactory().getLabel(By.xpath("//*[text()='Home']"),"home");

    private final ILabel textSuccess = getElementFactory().getLabel(By.id("result"), "text success");

    public ElementPage() {
        super(By.className("element-group"), "element page");
    }

    @Step("text box is clicked")
    public void clickTextBox() {
        textBox.click();
    }

    @Step("Passed name {0} in the input field")
    public void sendUsername(String name) {
        inputUsername.sendKeys(name);
    }

    @Step("pass email {0} in the email field")
    public void sendEmail(String email) {
        inputEmail.sendKeys(email);
    }

    @Step("Submit button clicked")
    public void clickSubmit() {
        submit.click();
    }

    @Step("Retrive the input user name")
    public String getName() {
        return name.getText();
    }

    @Step("Retrive the input email")
    public String getEmail() {
        return email.getText();
    }

    @Step("Click the radio btn")
    public void clickCheckbox() {
        checkBox.click();
    }

    @Step("click home check box button")
    public void checkHome() {
        home.click();
    }

    @Step("Retrive the choose option")
    public String getCheckedMsg() {
        return textSuccess.getText();
    }
}
