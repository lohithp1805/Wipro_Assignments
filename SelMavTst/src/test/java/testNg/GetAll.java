package testNg;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetAll {

    @Test
    public void getAllProducts() {

        given()
        .when()
            .get("https://dummyjson.com/products")
        .then()
            .statusCode(200)
            .body("products.size()", greaterThan(0));
    }
}
