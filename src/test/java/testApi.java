import io.restassured.RestAssured;
import io.restassured.response.Response;
import test.automation.builder.RequestBuilder;

public class testApi {



    public static void main(String[] args){
        RequestBuilder builder = new RequestBuilder();
        Response res = RestAssured.given(builder.createBasicRequestSpecification()).get();
        System.out.println(res.getBody().prettyPrint());
    }



}
