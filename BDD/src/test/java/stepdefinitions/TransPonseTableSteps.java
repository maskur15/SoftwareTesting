package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import models.LuckyUser;

import java.util.List;
import java.util.Map;

public class TransPonseTableSteps {

    @Given("the user is")
    public void getTheUser(DataTable dataTable) {
        List<Map<String, String>> users = dataTable.transpose().asMaps(String.class, String.class);
        for (Map<String, String> user : users) {
            System.out.println(user.get("firstName") + " " + user.get("country") + " " + user.get("age"));
        }
    }

    @DataTableType
    public LuckyUser convertLuckyTable(Map<String, String> user) {
        return new LuckyUser(user.get("firstName"), user.get("country"), Integer.parseInt(user.get("age")));
    }

    @Given("the lucky user is")
    public void theLuckyUser(@Transpose List<LuckyUser> users) {
        System.out.println("The lucky users are the following: ");
        for (LuckyUser user : users) {
            System.out.println(user.getFirstName() + " " + user.getCountry() + " " + user.getAge());
        }
    }
}
