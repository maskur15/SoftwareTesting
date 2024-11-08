package postman;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BookListTest extends BaseTestPostman {

    @Test
    public void testGetBooks() {
        // Send the GET request to /books and validate the response
        given()
                .when()
                .get("/books") // Endpoint to get the list of books
                .then()
                .statusCode(200) // Verify that the response status code is 200
                .log().all()
                .body("books", not(empty())) // Ensure that the books array is not empty
                .body("books.size()", greaterThan(0));// Ensure at least one book is returned
    }
}
