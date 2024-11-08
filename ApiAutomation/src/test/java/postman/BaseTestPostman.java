package postman;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTestPostman {
    @BeforeClass
    public void setup() {
        // Set the base URI for the Postman Echo API
        RestAssured.baseURI = "https://library-api.postmanlabs.com";
    }
}
