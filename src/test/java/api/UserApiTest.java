package api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserApiTest extends ApiTestBase {

    @Test
    public void getUsersTest() {
        Response response = request.get("/users");

        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify status code 200
        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch");
    }
}