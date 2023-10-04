import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class AddAttachment {
    @Test
    void TestAddAttachmentWithComment(){

        RestAssured.baseURI = "http://localhost:8080";
        SessionFilter session= new SessionFilter();

        //Login
        String response =given()
                .header("Content-Type","application/json")
                .body("{\n" +
                "    \"username\": \"hsowmya\",\n" +
                "    \"password\": \"Smy@\"\n" +
                "}")
//                .log()
//                .all()
                .filter(session)
                .when()
                .post("/rest/auth/1/session")
                .then()
                .extract().response().asString();


        //add comment
        given().pathParam("key","10005")
//                .log().all()
                .header("Content-Type","application/json")
                .body("{\n" +
                "    \"body\": \"hello world\",\n" +
                "    \"visibility\": {\n" +
                "        \"type\": \"role\",\n" +
                "        \"value\": \"Administrators\"\n" +
                "    }\n" +
                "}")
                .filter(session)
                .when()
                .post("/rest/api/2/issue/{key}/comment");
//                .then().log().all().assertThat().statusCode(201);

        //Add attachment
        given()
                .header("X-Atlassian-Token","no-check")
                .filter(session)
                .pathParam("key","10005")
                .header("Content-Type","multipart/form-data")
                .multiPart(new File("jiraHello.txt"))
                .when()
                .post("/rest/api/2/issue/{key}/attachments");
//                .then().log().all().assertThat().statusCode(200);
        String s = given()
                .header("Content-Type","application/Json")
                .filter(session)
                .pathParam("key","10005")
                .queryParams("fields","comments")
                .when()
                .get("/rest/api/2/issue/{key}")
                .then()
                .log().all().extract().response()
                .asString();
        System.out.println(s);
//        JsonPath js = new JsonPath(s);
//        int jsCount = js.getInt("fields.comment.comments.size()");
//        for(int i=0;i<jsCount;i++)
//            System.out.println(js.getInt( "fields.comment.comments["+i+"].id"));

    }
}
