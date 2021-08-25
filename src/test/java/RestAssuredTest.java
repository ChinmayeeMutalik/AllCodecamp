import org.junit.jupiter.api.Test;
import io.restassured.assertion.*;

import static io.restassured.RestAssured.*;

public class RestAssuredTest {

    @Test
   public void Status200Test() {


        given().param("q","Melbourne").and().header("auth-key","c6d9bca5-bb8f-47b1-babd-37041888a681").

        when().
                get("https://digitalapi.auspost.com.au/postcode/search.xml").then()

        .assertThat().statusCode(200);


    }
    @Test
    public void When_PostCode_Test(){

        given().param("length","20").and().header("auth-key","c6d9bca5-bb8f-47b1-babd-37041888a681").

                when().get("https://digitalapi.auspost.com.au/postage/letter/domestic/service.json").

                then().statusCode(200);

    }

   }
