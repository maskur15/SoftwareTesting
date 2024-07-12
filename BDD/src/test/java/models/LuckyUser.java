package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class LuckyUser {
    private String firstName;
    private String country;
    private int age;
}
