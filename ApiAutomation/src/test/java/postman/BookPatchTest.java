package postman;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BookPatchTest extends BaseTestPostman {
    String updateMsg = "{\"checkedOut\" : \"true\"}";
    String bookid = "ddd77f6c-93aa-48e5-a567-5a94e707e08b";
    @Test
    public void pathBook() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("api-key", "postmanrulz")
                .body(updateMsg)
                .pathParam("id",bookid)
                .patch("books/{id}");

        System.out.println(response.statusCode());
        System.out.println(response.body().asString());
    }
}
