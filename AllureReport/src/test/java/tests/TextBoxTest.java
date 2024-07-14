package tests;


import io.qameta.allure.*;
import listners.ListenFirst;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ElementPage;
import pages.Mainpage;

public class TextBoxTest extends BaseTest {
    private final Mainpage mainpage = new Mainpage();
    private final ElementPage elementPage = new ElementPage();

    @Test(priority = 1)
    @Description("This test perform the texbox validation on demoqa site by sending name and email")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("ABDUL")
    @Link(name = "DemoQa Textbox", url = "https://demoqa.com/text-box")
    public void textBoxTest() {
        mainpage.clickElement();
        elementPage.clickTextBox();
        elementPage.sendUsername("Gabri");
        elementPage.sendEmail("gabri@gmail.com");
        elementPage.clickSubmit();
        Assert.assertTrue(elementPage.getName().contains("Gabri"),"Name is not displayed");
    }
}
