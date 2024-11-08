package postman;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BookAddTest extends BaseTestPostman {

    @Test
    public void addBook() {
        String jsonBody = "{\r\n" +
                "  \"title\": \"The Four Agreements\",\r\n" +
                "  \"author\": \"don Miguel Ruiz\",\r\n" +
                "  \"genre\": \"self-help\",\r\n" +
                "  \"yearPublished\": 1997\r\n" +
                "}";
        Response response = given()
                .contentType(ContentType.JSON)
                .header("api-key", "postmanrulz")
                .body(jsonBody)
                .post("/books");

        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);

        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        Assert.assertEquals(statusCode, 201);
    }
}
