package heroku;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
    private final By jsAlert = By.xpath("//a[contains(text(), 'JavaScript Alerts')]");
    private final By clickForJsAlertButton = By.xpath("//button[contains(@onclick, 'jsAlert()')]");
    private final By successMessage = By.xpath("//p[contains(text(), 'You successfully clicked an alert')]");

    @Test
    public void alertTest() {
        driver.findElement(jsAlert).click();
        driver.findElement(clickForJsAlertButton).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertTrue(driver.findElement(successMessage).isDisplayed(), "Success message is not displayed");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
