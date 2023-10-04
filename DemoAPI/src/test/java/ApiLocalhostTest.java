import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//import static jdk.internal.vm.vector.VectorSupport.extract;
import static org.hamcrest.MatcherAssert.assertThat;
@Test


public class ApiLocalhostTest {
    @DataProvider(name = "DataforPost")
    public Object[][] dataForPost() {
        Object[][] data = new Object[2][2];

        data[0][0] = "Albert ";
        data[0][1] = "Einstein ";
//        data[0][2] = 4;

        data[1][0] = "Alb";
        data[1][1] = "Einst ";
//        data[1][2] = 5;

        return data;
//        return new Object[][]{
//                {"Gram", "hell", 6},
//                {"qwerty", "key", 7}
//        };
        }



    @Test
    void getApiRequestTest(){
        baseURI = "http://localhost:3000/";

       given()
               .param("name","Protector")
                .get("users ")
               .then()
               .statusCode(200)
               .log().all();

    }

    @Test(dataProvider = "DataforPost")
   public void postApiRequestTest(String firstname,String lastname){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("first name",firstname);
        jsonObject.put("last name",lastname);
//        jsonObject.put("id",id);

        System.out.println(jsonObject);

        long requestTime=given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(jsonObject.toJSONString())
                .when()
                .post("http://localhost:3000/users")

                .then()
//               .statusCode(201)
               .log().all()
                .extract().time(); // Convert the long to int
        System.out.println(requestTime);
//
        // Assert the response time is less than 5000 milliseconds (5 seconds)
//        assertThat((int)time, lessThan(5000));
    }
//    @Test
//    void patchApiRequestTest(){
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("last name","Carmom");
//
//        System.out.println(jsonObject);
//
//        given()
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .body(jsonObject.toJSONString())
//                .when()
//                .patch("http://localhost:3000/users/26")
//
//                .then()
//                .statusCode(200)
//                .log().all();
//
//    }
//    @DataProvider(name="Deletedata")
//    public Object[] dataDelete(){
//        return new Object[]{
//              12,30
//        };
//    }
//    @Test(dataProvider = "Deletedata")
//
//    void deleteApiRequestTest(int id){
//        when()
//                .delete("http://localhost:3000/users/"+id)
//                .then()
//                .statusCode(200)
//                .log().all();
//
//    }
}
