package com.mahmoudelgohary.ecommerce.tests.dataproviders;

import com.mahmoudelgohary.ecommerce.constants.InvalidType;
import com.mahmoudelgohary.ecommerce.util.ApisRequestHelper;
import org.testng.annotations.DataProvider;

public class RegisterDataProviders {

    @DataProvider(name = "validRegistrationData")
    public Object[][] validRegistrationDataProvider() {
        // Provide multiple sets of RegisterRequest data for testing
        int numberOfTests = 3; // You can adjust this number to generate more or fewer test cases
        Object[][] data = new Object[numberOfTests][1];

        for (int i = 0; i < numberOfTests; i++) {
            data[i][0] = ApisRequestHelper.getValidRegisterRequest();
        }
        return data;
    }

    @DataProvider(name = "inValidRegistrationData")
    public Object[][] inValidRegistrationDataProvider() {
        InvalidType[] types = InvalidType.values();
        int numberOfTests = types.length; // Generate one test case for each type of invalid input defined in the InvalidType enum
        Object[][] data = new Object[numberOfTests][1];

        for (int i = 0; i < numberOfTests; i++) {
            data[i][0] = ApisRequestHelper.getInvalidRegisterRequest(types[i]);
        }
        return data;
    }
}
