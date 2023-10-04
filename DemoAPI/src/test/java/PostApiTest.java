import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class PostApiTest {
    @Test
    @Parameters({"name"})
    //we use post to send the data into the server inorder to send data we need body so we use JSON object to send data
    void postApiRequestTest(String name){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name","Sowmya");
        System.out.println(map);

        JSONObject jsonObject = new JSONObject(map);
//        jsonObject.put("name","Sowmya");
        System.out.println(jsonObject);

        given().header("Content-type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(jsonObject.toJSONString())
                .when()
                .post("http://localhost:3000/users/")
                .then()
                .statusCode(201)
                .log().all(); // to get the response

    }
}
