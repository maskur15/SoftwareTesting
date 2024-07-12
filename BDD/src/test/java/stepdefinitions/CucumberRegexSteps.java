package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberRegexSteps {
    @Given("^I have (\\d+) cucumbers in my basket$")
    public void iHaveCucumbersInMyBasket(int numberOfCucumbers) {
        System.out.println("I have " + numberOfCucumbers + " cucumbers in my basket.");
    }

    @When("^I add (\\d+) cucumbers$")
    public void iAddCucumbers(int additionalCucumbers) {
        System.out.println("I am adding " + additionalCucumbers + " cucumbers.");
    }

    @Then("^I should have (\\d+) cucumbers in total$")
    public void iShouldHaveCucumbersInTotal(int totalCucumbers) {
        System.out.println("I should have " + totalCucumbers + " cucumbers in total.");
    }

    @When("^I remove (\\d+) cucumbers from total$")
    public void iRemoveCucumbersFromTotal(int cucumbersToRemove) {
        System.out.println("I am removing " + cucumbersToRemove + " cucumbers from the total.");
    }

    @When("^I pick \"([^\"]+)\" cucumber$")
    public void iPickCucumberByColor(String color) {
        System.out.println("I pick a " + color + " cucumber.");
    }
}
