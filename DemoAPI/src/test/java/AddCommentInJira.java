import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.response.Response;
import org.apache.http.protocol.ResponseServer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
@Test

public class AddCommentInJira {
   @Test
   void TestAddComment(){

        RestAssured.baseURI = "http://localhost:8080";
        SessionFilter session= new SessionFilter();
        String response =given().header("Content-Type","application/json").body("{\n" +
                "    \"username\": \"hsowmya\",\n" +
                "    \"password\": \"Smy@\"\n" +
                "}").log().all().filter(session).when().post("/rest/auth/1/session").then().extract().response().asString();

        given().pathParam("key","10005").log().all().header("Content-Type","application/json").body("{\n" +
                "    \"body\": \"hello world\",\n" +
                "    \"visibility\": {\n" +
                "        \"type\": \"role\",\n" +
                "        \"value\": \"Administrators\"\n" +
                "    }\n" +
                "}").filter(session).when().post("/rest/api/2/issue/{key}/comment").then().log().all().assertThat().statusCode(201);

    }
}
