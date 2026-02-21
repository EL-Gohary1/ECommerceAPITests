package com.mahmoudelgohary.ecommerce.tests;

import com.mahmoudelgohary.ecommerce.apis.auth.LoginApi;
import com.mahmoudelgohary.ecommerce.base.BaseTest;
import com.mahmoudelgohary.ecommerce.pojo.request.LoginRequest;
import org.testng.annotations.Test;

public class LoginApiTests extends BaseTest<LoginApi> {

    @Override
    protected LoginApi createApiInstance() {
        return new LoginApi(); // Replace with actual API instance if needed
    }

    @Test
    public void validateLoginStatusCode() {
        // This test will validate the status code of the login API response.
        getApi().performLogin(new LoginRequest("dfgg","dd@ddd.com"));

    }

}
