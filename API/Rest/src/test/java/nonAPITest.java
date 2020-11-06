import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.core.IsEqual.equalTo;


public class nonAPITest extends BaseTest{

    private static String RESOURCE = "/v1/examen/status";

    @Test
    public void validaStatus() {

    when().
        get(String.format("%s",RESOURCE))
    .then()
        .statusCode(200)
        .body("status", equalTo("Listos para el examen"));

}
}
