package testNg;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
 
public class APITest
{
 
	@Test
	public void getUserTest()
	{
	    given()
	.log().all()
	    .when().get("https://dummyjson.com/products")
	    .then()
	    .statusCode(200)
	    .body("products[0].id", equalTo(1));
	}
//	  @Test
//	    public void updateProductTest() {
//	 
//	        String requestBody = "{ \"title\": \"Updated Phone\" }";
//	 
//	        given()
//	            .log().all()
//	            .contentType(ContentType.JSON)
//	            .body(requestBody)
//	        .when()
//	            .put("https://dummyjson.com/products/1")
//	        .then()
//	            .log().all()
//	            .statusCode(200);
//	    }
	
//	delete("https://dummyjson.com/products/194")
//    .then()
//      .log().body()
//        .statusCode(200);  
//    System.out.println("DELETE PRODUCT");
//	}
	
}
 
