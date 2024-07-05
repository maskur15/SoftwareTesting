package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DataTableTest extends BaseTest {
    private final By sortableDataTables = By.xpath("//a[contains(text(), 'Sortable Data Tables')]");
    private final By dueElementsLocator = By.xpath("//*[@id='table1']//td[4]");
    private final double expectedSum = 251.0;
    private final String currencyRegex = "[^\\d.]";

    @Test
    public void dataTableTest() {
        driver.findElement(sortableDataTables).click();
        List<WebElement> dueList = driver.findElements(dueElementsLocator);
        Double actualSum = 0.0;
        for (WebElement element : dueList) {
            String elementText = element.getText();
            actualSum += Double.parseDouble(elementText.replaceAll(currencyRegex, ""));
        }
        System.out.println(actualSum);

    }
}
