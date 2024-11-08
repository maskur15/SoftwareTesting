package postman;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QueryParameterTest extends BaseTestPostman {

    @Test
    public void getFictionBookTest() {
        Response response = RestAssured.given()
                .queryParam("genre","fiction")
                .queryParam("checkedOut","false")
                .get("/books");
        int responseCode = response.getStatusCode();
        System.out.println(responseCode);
        System.out.println(response.body().asString().length());
        Assert.assertEquals(responseCode,200);
    }
}
