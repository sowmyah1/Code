import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class PutApiTest {
    @Test
        //we use post to send the data into the server inorder to send data we need body so we use JSON object to send data
    void putApiRequestTest(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name","Bag");
        map.put("job","Books");
//        map.put("id",26);

        System.out.println(map);

        JSONObject jsonObject = new JSONObject(map);
//        jsonObject.put("name","Sowmya");
        System.out.println(jsonObject);

        given().header("Content-type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(jsonObject.toJSONString())
                .when()
                .put("http://localhost:3000/users/2")
                .then()
                .statusCode(200)
                .log().all(); // to get the response
    }
}
