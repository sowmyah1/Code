import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.LambokForUser;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class POJOClassTestForUser {
    @Test
    void passingListOfObject() throws JsonProcessingException {
        LambokForUser lambokForUser = new LambokForUser();
        lambokForUser.setName("all ok");
        lambokForUser.setJob("job is a job");
        lambokForUser.setId(394);

        LambokForUser lambokForUser1 = new LambokForUser();
        lambokForUser1.setName("Yes this is my name");
        lambokForUser1.setJob("This is my job");
        lambokForUser1.setId(433);

        List<LambokForUser> list = new ArrayList<>();
        list.add(lambokForUser);
        list.add(lambokForUser1);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
        System.out.println(jsonString);

        given().
                contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(jsonString)
                .when()
                .post("http://localhost:3000/users")
                .statusCode();
    }
}
