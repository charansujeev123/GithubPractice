package api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class ApiTestBase {

    protected RequestSpecification request;

    @BeforeClass
    public void setUp() {
        // Base URI for API (example)
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        request = RestAssured.given().log().all();
    }
}
