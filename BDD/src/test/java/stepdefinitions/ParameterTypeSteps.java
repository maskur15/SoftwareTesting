package stepdefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import models.Book;

import java.time.LocalDate;

public class ParameterTypeSteps {

    @ParameterType(".*titled \"([^\"]+)\" with a publication date of (\\d{4}-\\d{2}-\\d{2})")
    public Book book(String title, String date) {
        LocalDate publicationDate = LocalDate.parse(date);
        return new Book(title, publicationDate);
    }

    @Given("I want to add a book titled {book}")
    public void iWantToAddABook(Book book) {
        System.out.println("Book to add: " + book.getTitle() + " published on " + book.getDate());
    }

    @ParameterType("\\d{4}-\\d{2}-\\d{2}")
    public LocalDate date(String date) {
        return LocalDate.parse(date);
    }

    @Given("{string} birth day is {date}")
    public void albertBirthDay(String name, LocalDate date) {
        System.out.println("Name: " + name + " Date of Birth: " + date);
    }
}
