package stepdefinitions;

import io.cucumber.java.en.Given;

public class OpionalText {

    @Given("I have {int} cucumber(s) in my bag/pocket")
    public void iHaveCucumbersInMyBag(int numberOfCucumbers) {
        System.out.println("Number of cucumbers: " + numberOfCucumbers);
    }
}
