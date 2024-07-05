package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest{
    private final By dropDownLink = By.xpath("//*[contains(text(), 'Dropdown')]");

    @Test
    public void testDropdown() {
        driver.findElement(dropDownLink).click();
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));

        Select dropdown = new Select(dropdownElement);

        WebElement selectedOption = dropdown.getFirstSelectedOption();
        Assert.assertEquals(selectedOption.getText(), "Please select an option", "Initially selected option should be 'Option 1'");

        dropdown.selectByVisibleText("Option 1");
        selectedOption = dropdown.getFirstSelectedOption();
        Assert.assertEquals(selectedOption.getText(), "Option 1", "After selecting, the option should be 'Option 1'");
    }
}
