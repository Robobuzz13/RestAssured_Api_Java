import io.restassured.RestAssured;
import io.restassured.response.Response;
import test.automation.builder.RequestBuilder;
import test.automation.builder.ResponseBuilder;

import java.sql.SQLOutput;


void main() {
    long start1 = System.currentTimeMillis();
    RequestBuilder builder = new RequestBuilder();
    ResponseBuilder responseBuilder = new ResponseBuilder();
    try{
        Response res = RestAssured.given(builder.createBasicRequestSpecification()).get().then().spec(responseBuilder.createBasicResponseSpecification()).extract().response();
    } catch (AssertionError e) {
        System.out.println(e.getLocalizedMessage());
        e.printStackTrace();

    }
    long end1 = System.currentTimeMillis();
    System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));



    //System.out.println(res.getBody().print());

}
