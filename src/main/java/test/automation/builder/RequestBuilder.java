package test.automation.builder;

import io.restassured.authentication.AuthenticationScheme;
import io.restassured.authentication.BasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;

import java.net.URI;

public class RequestBuilder {

    //
    // /*
    final URI baseUri = URI.create("https://postman-echo.com/basic-auth");
    final AuthenticationScheme auth = testAuth();
    public AuthenticationScheme testAuth(){
        BasicAuthScheme authentication = new BasicAuthScheme();
        authentication.setUserName("postman");
        authentication.setPassword("password");

        return authentication;
    }
    //*/    // test code will be removed later

    public RequestSpecification createBasicRequestSpecification(){

        return new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .setAuth(auth)
                .log(LogDetail.ALL)
                .build();
    }
}
