package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSteps {

    @When("I transfer \\$(\\d+) from account \"([^\"]+)\" to account \"([^\"]+)\"$")
    public void transferMoneyBetweenAccounts(int amount, String senderAccount, String receiverAccount) {
        System.out.println("Sender: " + senderAccount + ", Receiver: " + receiverAccount + ", Amount: $" + amount);
    }

    @Then("Account has \\$(\\d+) on account$")
    public void verifyAccountBalance(int balance) {
        System.out.println("Account balance: $" + balance);
    }

    @When("^I schedule an appointment on (\\d{4}-\\d{1,2}-\\d{1,2})$")
    public void scheduleAppointment(String date) {
        System.out.println("Appointment date: " + date);
    }
}
