package stepdefinitions;

import constants.Language;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainpageSteps {
    private final MainPage mainPage = new MainPage();

    @Given("I'm on the main page")
    public void goToMainPage() {
        mainPage.state().waitForDisplayed();
    }

    @Then("Main page is displayed")
    public void verifyMainPageIsDisplayed() {
        Assert.assertTrue(mainPage.state().isDisplayed(), "Main page is not displayed");
    }

    @When("Input {string} text in the search field and click submit button")
    public void inputSearchTextAndClickSubmit(String searchText) {
        mainPage.searchByText(searchText);
        mainPage.clickSubmit();
    }

    //@When("Input {string} text in the search field, change search language to {language} and click submit button")
    public void inputSearchTextChangeLanguageAndClickSubmit(String keyword, Language lang) {
        mainPage.searchByText(keyword);
        mainPage.selectLanguageByValue(lang.getValue());
        mainPage.clickSubmit();
    }
    @When("Input {string} text in the search field, change search language to {string} and click submit button")
    public void inputSearchChangeLanguageClickSubmit(String text, String lan) {
        mainPage.searchByText(text);
        mainPage.selectLanguageByVisibleText(lan);
        mainPage.clickSubmit();
    }
}
