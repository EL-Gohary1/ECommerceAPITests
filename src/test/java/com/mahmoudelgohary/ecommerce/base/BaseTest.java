package com.mahmoudelgohary.ecommerce.base;

import com.mahmoudelgohary.ecommerce.apis.auth.RegisterApi;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// BaseTest class serves as a base class for all test classes in the project,
// providing common setup and teardown methods
public abstract class BaseTest {

    // Using ThreadLocal to ensure that each test method gets its own instance of RegisterApi,
    // which is important for thread safety when running tests in parallel
    protected static final ThreadLocal<RegisterApi> registerApiThreadLocal = new ThreadLocal<>();

    // Getter method to access the RegisterApi instance for the current thread
    protected RegisterApi getRegisterApi() {
        return registerApiThreadLocal.get();
    }

    // Before each test method, initialize the RegisterApi instance and set it in the ThreadLocal variable
    @BeforeMethod
    protected void setUp() {
        registerApiThreadLocal.set(new RegisterApi());
    }

    // After each test method, remove the RegisterApi instance from the ThreadLocal variable to prevent memory leaks
    @AfterMethod
    protected void tearDown() {
        registerApiThreadLocal.remove();
    }

}
