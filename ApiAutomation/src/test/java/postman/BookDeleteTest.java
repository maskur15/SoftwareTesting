package postman;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BookDeleteTest extends BaseTestPostman {
    String bookid = "7ef55e96-c639-4a32-aef5-572e610f7e38";

    @Test
    public void deleteBook() {
        Response response = given()
                .header("api-key","postmanrulz")
                .pathParam("id",bookid)
                .delete("/books/{id}");
        Assert.assertEquals(response.statusCode(), 204, "Expected status code to be 204");
    }
}
