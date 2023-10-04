import io.restassured.http.ContentType;
import org.example.LambokForUser;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PassingObjectInBody {
    @Test
    void passObjectAndTest() {
        LambokForUser lambokForUser = new LambokForUser();
        lambokForUser.setName("hello");
        lambokForUser.setJob("hello1234");
        lambokForUser.setId(567);

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(lambokForUser)
                .post("http://localhost:3000/users");
    }

}
