import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class OAuthClientRequestingAccessToken {
    @Test
    void clientRequestToAutorisationServer(){

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php");
        driver.findElement(By.cssSelector("#identifierId")).sendKeys("hsowmya305@gmail.com");
        driver.findElement(By.cssSelector("#identifierId")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("hello");
        driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys(Keys.ENTER);
        String currentUrl = driver.getCurrentUrl();
        String subUrl = currentUrl.split("code=")[1];
        String code = subUrl.split("&client")[0];
        System.out.println(code);


        String responseAccessToken= given().urlEncodingEnabled(false)//bcz rest assured will convert special characters into numerical value to avoid it we use this.
                .queryParams("code","")
                .queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
                .queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
                .queryParams("grant_type","authorization_code")
                .when()
                .log().all()
                .post("https://www.googleapis.com/oauth2/v4/token").asString();

        JsonPath js = new JsonPath(responseAccessToken);
        String accessToken = js.getString("access_token");
        System.out.println(accessToken+"Access token");

    }
}
