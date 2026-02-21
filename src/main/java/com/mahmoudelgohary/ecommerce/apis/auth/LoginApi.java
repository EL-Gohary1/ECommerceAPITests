package com.mahmoudelgohary.ecommerce.apis.auth;

import com.mahmoudelgohary.ecommerce.constants.AuthPaths;
import com.mahmoudelgohary.ecommerce.http.BaseApi;
import com.mahmoudelgohary.ecommerce.pojo.request.LoginRequest;
import io.restassured.http.ContentType;

public class LoginApi extends BaseApi<LoginApi> {

    public LoginApi() {
        super();
        this.loggAllRequestData()
            .loggAllResponseData()
            .setContentType(ContentType.JSON)
            .setBasePath(AuthPaths.LOGIN.getPath());
    }

    public void performLogin(LoginRequest credential) {
        // Send the API request to the login endpoint
        this.setRequestBody(credential)
            .sendRequest(AuthPaths.LOGIN.getMethod());
    }
}
