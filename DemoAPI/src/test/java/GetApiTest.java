import static  io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.protocol.ResponseServer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class GetApiTest {
    @Test
    void getApiRequestTest(){

        Response repose = RestAssured.get("http://localhost:3000/users");
        System.out.println(repose.getBody().asString());
        System.out.println(repose.getHeader(repose.contentType()));
        System.out.println(repose.getTime());
//        Assert.assertEquals(repose.body(),"Bag");
        Assert.assertEquals(repose.statusCode(),200,"expected status code is not equal");

//        Document

//        Assert.assertEquals(repose.time(),488);

    }
    @Test
    void getApiRequestwithoutCreatingObject(){
        Response response = given(). get("http://localhost:3000/users");
//
        System.out.println("Response Body: " + response.getBody().asString());

//        int id = response.jsonPath().getInt("[0].contents[1].contId");
//        System.out.println(id);

        int size = response.jsonPath().get("users.size()");//size will return number of elements in array(only)
        System.out.println(size);

//        for(int i=1;i<=size;i++)
//        {
//            String c = response.jsonPath().get("users[" + i +"].firstname");
//
//            System.out.println(c);
//        }
        List<String> firstNames = response.jsonPath().getList("users.firstname");
        int size1 = firstNames.size();
        System.out.println("Number of Users: " + size1);

        for (int i = 0; i < size1; i++) {
            String firstName = firstNames.get(i);
            System.out.println("User " + i + " First Name: " + firstName);
        }
//                .body("[0].contents[1].contId", equalTo(8));// Use data[0].id instead of data.id[0]
//                .log().all();
    }
}
