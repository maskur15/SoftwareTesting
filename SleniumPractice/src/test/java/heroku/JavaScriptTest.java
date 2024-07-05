package heroku;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTest {

    private final String expctedTitle = "The Internet";

    @Test
    public void checkTitle() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title = (String) js.executeScript("return document.title");
        Assert.assertEquals(expctedTitle,title);
    }

    @Test
    public void clickElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click();", element);
    }
}
