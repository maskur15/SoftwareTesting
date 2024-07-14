package tests;

import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementPage;
import pages.Mainpage;

@Feature("checkbox testing")
public class CheckBoxTest extends BaseTest {
    private final Mainpage mainpage = new Mainpage();
    private final ElementPage elementPage = new ElementPage();

    @Test
    public void checkHomeBoxTest() {
        mainpage.clickElement();
        elementPage.clickCheckbox();
        elementPage.checkHome();
        Assert.assertTrue(elementPage.getCheckedMsg().contains("home"),"Message is incorrectt");
    }
}
