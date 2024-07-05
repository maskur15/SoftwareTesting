package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class WelcomeHerokouTest {
    private final WebDriver driver = new ChromeDriver();
    private final String header = "Welcome to the-internet";

    @BeforeMethod
    public void setup() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void verfiyHeader() {
        WebElement element = driver.findElement(By.className("heading"));
        Assert.assertEquals(element.getText(),header,"Header doesnt match");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
