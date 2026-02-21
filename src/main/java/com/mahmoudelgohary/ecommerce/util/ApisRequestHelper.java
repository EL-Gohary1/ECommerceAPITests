package com.mahmoudelgohary.ecommerce.util;

import com.mahmoudelgohary.ecommerce.pojo.request.RegisterRequest;

public class ApisRequestHelper {

    // Helper method to create a RegisterRequest object with random data using TestDataHelper
    public static RegisterRequest getRegisterRequest() {
        return new RegisterRequest(TestDataHelper.generateRandomFirstName(), TestDataHelper.generateRandomLastName(), TestDataHelper.generateRandomPassword(), TestDataHelper.generateRandomEmail());
    }



}
