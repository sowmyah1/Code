import io.restassured.path.json.JsonPath;
import org.example.Payload;
import org.testng.annotations.Test;

public class DynamicParsing {

    @Test
    void TestDynamicParsing()
    {
        String s= Payload.returnJsonSTring();
        JsonPath js=new JsonPath(s);
        System.out.println(js.getInt("courses.size()."));


        //Dynamic parsing
        for(int i=0;i<js.getInt("courses.size()");i++)
        {
            System.out.println(js.getInt("courses["+i+"].price"));
        }


        //(query on json data) check if all course price matches main price
        int purchaseAmount = js.get("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);
        int sum=0;
        for(int i=0;i<js.getInt("courses.size().");i++){
            sum=js.getInt("courses["+i+"].price")+sum;
        }
        if(purchaseAmount>=sum)
            System.out.println("limit not crossed"+sum);
    }


}
