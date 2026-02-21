package com.mahmoudelgohary.ecommerce.tests;

import com.mahmoudelgohary.ecommerce.base.BaseTest;
import com.mahmoudelgohary.ecommerce.pojo.request.RegisterRequest;
import com.mahmoudelgohary.ecommerce.util.ApisRequestHelper;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class RegisterApiTests extends BaseTest {

    @Test
    public void validateRegisterStatusCode() {
        // Create a RegisterRequest object with the required data
        RegisterRequest registerRequest = ApisRequestHelper.getRegisterRequest();
        // Send the register request and assert that the status code is 201 (Created)
        getRegisterApi().sendRegisterRequest(registerRequest)
                        .then().assertThat().statusCode(201);
    }

    @Test
    public void validateRegisterResponse() {
        // Create a RegisterRequest object with the required data
        RegisterRequest registerRequest = ApisRequestHelper.getRegisterRequest();
        // Send the register request and assert that the response body contains the expected data
        getRegisterApi().sendRegisterRequest(registerRequest)
                        .then().assertThat().body("email", equalTo(registerRequest.getEmail()))
                        .and().assertThat().body("customerId", notNullValue())
                        .and().assertThat().body("firstName", equalTo(registerRequest.getFirstName()))
                        .and().assertThat().body("lastName", equalTo(registerRequest.getLastName()));

    }

}
