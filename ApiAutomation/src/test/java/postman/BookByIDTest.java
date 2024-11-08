package postman;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BookByIDTest extends BaseTestPostman {
    private String bookId = "7ef55e96-c639-4a32-aef5-572e610f7e38";

    @Test
    public void getBookyById() {
        Response response = given()
                .pathParam("id",bookId)
                .get("/books/{id}");
        int responsecode = response.getStatusCode();
        System.out.println(responsecode);
        System.out.println(response.body().asString());
    }
}
