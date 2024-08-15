package test.automation.builder;


import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.ResponseSpecification;

public class ResponseBuilder {

    ///*
    int statusCode = 2001;
    String expBody = "HTTP/1.1 200 OK";
     //*/ // will be removed later

    public ResponseSpecification createBasicResponseSpecification(){
        return new ResponseSpecBuilder()
                    .expectStatusCode(statusCode)
                    .expectStatusLine(expBody)
                    .log(LogDetail.ALL)
                    .build();


    }
}
