package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.InformationPage;

public class InformationPageSteps {
    private final InformationPage informationPage = new InformationPage();

    @Then("The Information page for the {string} article is displayed")
    public void verifyInformationPageIsDisplayed(String articleName) {
        System.out.println("Verifying Information page for article: " + articleName);
        String headingText = informationPage.getHeadingText();
        System.out.println("Current page heading is: " + headingText);
        Assert.assertTrue(headingText.contains(articleName),
                "Expected article name \"" + articleName + "\" was not found in the heading. Current heading: " + headingText);
    }
}
