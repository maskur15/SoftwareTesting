package models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Author {
    private String firstName;
    private String lastName;
    private String birthDate;
}
