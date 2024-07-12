package transformations;

import constants.Language;
import io.cucumber.java.ParameterType;

import java.time.LocalDate;

public class Transformations {

    @ParameterType("SPANISH|ENGLISH|FRENCH|GERMAN|ITALIAN|PORTUGUESE|RUSSIAN|CHINESE|JAPANESE|ARABIC|HINDI")
    public Language language(String lang) {
        //retrun the enum
        return Language.valueOf(lang); // Convert the input to uppercase to match the enum constants
    }

//    @ParameterType("\\d{4}-\\d{2}-\\d{2}")
//    public LocalDate date(String date) {
//        return LocalDate.parse(date);
//    }
}
