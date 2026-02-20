package com.mahmoudelgohary.ecommerce.apis.auth;

import com.mahmoudelgohary.ecommerce.constants.AuthPaths;
import com.mahmoudelgohary.ecommerce.http.BaseApi;
import com.mahmoudelgohary.ecommerce.pojo.request.RegisterRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RegisterApi extends BaseApi<RegisterApi> {

    public RegisterApi() {
        super();
        this.loggAllRequestData()
                .loggAllResponseData()
                .setContentType(ContentType.JSON)
                .setBasePath(AuthPaths.REGISTER.getPath());
    }

    public Response sendRegisterRequest(RegisterRequest registerRequest) {
        // Send the API request to the registration endpoint and return the response as a RegisterResponse object
        return this.setRequestBody(registerRequest)
                .sendRequest(AuthPaths.REGISTER.getMethod());
    }
}
