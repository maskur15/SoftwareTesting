package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ArticlePage;

public class ArticlePageSteps {
    private final ArticlePage articlePage = new ArticlePage();

    @When("Click Tool menu button and Download as PDF button on the Article page")
    public void clickToolMenuAndDownloadAsPdf() {
        articlePage.clickTool();
        articlePage.clickDownloadAsPdf();
    }

    @When("Click Tool menu button and Page information button on the Article page")
    public void clickToolMenuAndPageInformation() {
        articlePage.clickTool();
        articlePage.clickPageInformation();
    }

    @Then("Article page for {string} is open")
    public void verifyArticlePageIsOpen(String articleName) {
        Assert.assertTrue(articlePage.isArticlePageOpen(articleName));
    }
}
