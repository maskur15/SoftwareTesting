package postman;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoApiTest {

    @BeforeClass
    public void setup() {
        // Set the base URI for the Postman Echo API
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void testPostRequest() {
        // Define the JSON payload we want to send
        String payload = "{ \"name\": \"OpenAI\", \"type\": \"assistant\" }";

        // Send the POST request and validate the response
        given()
                .contentType(ContentType.JSON) // Specify the content type as JSON
                .body(payload) // Attach the JSON payload
                .when()
                .post("/post") // Send POST request to the /post endpoint
                .then()
                .statusCode(200) // Verify that the response status is 200 (OK)
                .body("json.name", equalTo("OpenAI")) // Check that the "name" field is echoed back correctly
                .body("json.type", equalTo("assistant")) // Check that the "type" field is echoed back correctly
                .body("headers.host", equalTo("postman-echo.com")); // Optionally, check headers if needed
    }
}
