package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    private final By checkBox = By.xpath("//*[contains(text(), 'Checkboxes')]");

    @Test
    public void checkoxTest() {
        driver.findElement(checkBox).click();
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        Assert.assertFalse(checkbox1.isSelected(), "Checkbox 1 should be unchecked initially");
        Assert.assertTrue(checkbox2.isSelected(), "Checkbox 2 should be checked initially");

        checkbox1.click();
        checkbox2.click();

        Assert.assertTrue(checkbox1.isSelected(), "Checkbox 1 should be checked after clicking");
        Assert.assertFalse(checkbox2.isSelected(), "Checkbox 2 should be unchecked after clicking");
    }
}
