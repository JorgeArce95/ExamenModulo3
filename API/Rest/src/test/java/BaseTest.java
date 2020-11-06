import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.*;

public class BaseTest {
    public RequestSpecification request;

    @BeforeClass
    @Parameters ("baseUrl")
    public void SetUpRestAssured(@Optional String baseUrl){
        if (baseUrl == null){
            baseUrl = "https://api-coffee-testing.herokuapp.com";
        }
        RestAssured.baseURI = baseUrl;

        System.out.println(String.format("Running on %s environment", baseUrl));
    }

    @BeforeMethod
    public void before(){
        request = RestAssured.given();
    }
}
