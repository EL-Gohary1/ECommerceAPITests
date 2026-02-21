package com.mahmoudelgohary.ecommerce.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahmoudelgohary.ecommerce.constants.InvalidType;
import com.mahmoudelgohary.ecommerce.pojo.request.RegisterRequest;

import java.util.Map;

public class ApisRequestHelper {

    // Helper method to create a RegisterRequest object with random data using TestDataHelper
    public static RegisterRequest getValidRegisterRequest() {
        return new RegisterRequest(TestDataHelper.generateRandomFirstName(), TestDataHelper.generateRandomLastName(), TestDataHelper.generateRandomPassword(), TestDataHelper.generateRandomEmail());
    }

    private static final ObjectMapper mapper = new ObjectMapper();

    public static Map<String, Object> getInvalidRegisterRequest(InvalidType invalidType) {

        RegisterRequest registerRequest = getValidRegisterRequest();
        Map<String, Object> mapRequest = mapper.convertValue(registerRequest, new TypeReference<Map<String, Object>>() {});
        switch (invalidType) {
            case MISSING_FIRST_NAME ->
                    mapRequest.remove("firstName");
            case MISSING_LAST_NAME ->
                    mapRequest.remove("lastName");
            case MISSING_PASSWORD ->
                    mapRequest.remove("password");
            case INVALID_EMAIL_FORMAT ->
                    mapRequest.put("email","invalid-email-format"); // Set an invalid email format
            case DUPLICATE_EMAIL ->
                    mapRequest.put("email","admin@admin.com"); // Set an email that is already registered in the system to simulate duplicate email scenario
            case INVALID_DATA_TYPE ->
                    mapRequest.put("firstName", 12345); // Set a number instead of a string to simulate invalid data type for first name
        }
        return mapRequest;
    }


}
