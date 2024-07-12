package stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import models.Fruit;

import java.util.List;

public class ListSteps {

    @DataTableType
    public Fruit itemEntryTransformer(List<String> entry) {
        return new Fruit(entry.get(0), entry.get(1), Double.parseDouble(entry.get(2)));
    }

    @Given("a list of fruits in a table")
    public void aListOfFruitsInATable(List<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName() + " " + fruit.getType() + " " + fruit.getPrice());
        }
    }
}
