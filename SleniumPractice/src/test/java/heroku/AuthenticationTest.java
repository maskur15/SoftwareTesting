package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AuthenticationTest extends BaseTest{
    private final By basicAuth = By.xpath("//*[contains(text(),'Basic Auth')]");
    private final By successAuth = By.xpath("//*[contains(text(),'Congratulations! You must have the proper credentials')]");

    @BeforeMethod
    public void basicAuth(){
        HasAuthentication authentication = (HasAuthentication)driver;
        authentication.register(()-> new UsernameAndPassword("admin", "admin"));
    }

    @Test
    public void basicAuthTest() {
        driver.findElement(basicAuth).click();
        Assert.assertTrue(driver.findElement(successAuth).isDisplayed(), "Message is not displayed");
    }
}
