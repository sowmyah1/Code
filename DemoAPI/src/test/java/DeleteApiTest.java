import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

@Test
public class DeleteApiTest {
    @Test
    void deleteApiRequestTest(){

                when()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(204)
                .log().all(); // to get the response
    }
}

