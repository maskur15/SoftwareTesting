package models;

import java.time.LocalDate;

public class Book {
    private String title;
    private LocalDate date;

    public Book(String title, LocalDate date) {
        this.date = date;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }
}
