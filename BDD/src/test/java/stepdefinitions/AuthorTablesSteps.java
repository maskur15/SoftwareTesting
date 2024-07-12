package stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import models.Author;

import java.util.List;
import java.util.Map;

public class AuthorTablesSteps {

    @DataTableType(replaceWithEmptyString = "[blank]")
    public Author transformAuthorEntry(Map<String, String> entry) {
        return new Author(
                entry.getOrDefault("firstName", "Unknown name"),
                entry.get("lastName"),
                entry.get("birthDate")
        );
    }

    @Given("a list of authors in a table")
    public void givenListOfAuthorsInTable(List<Author> authors) {
        for (Author author : authors) {
            System.out.println(author.getFirstName() + " " + author.getLastName() + " " + author.getBirthDate());
        }
    }
}
