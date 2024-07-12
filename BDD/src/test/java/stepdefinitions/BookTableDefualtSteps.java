package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class BookTableDefualtSteps {

    @Given("a list of books in a table")
    public void listBooksInTable(DataTable dataTable) {
        List<Map<String, String>> books = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> book : books) {
            String title = book.get("title");
            String author = book.get("author");
            String year = book.get("year");

            System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
        }
    }
}
