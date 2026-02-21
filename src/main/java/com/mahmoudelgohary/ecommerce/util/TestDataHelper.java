package com.mahmoudelgohary.ecommerce.util;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// TestDataHelper class provides utility methods to generate random test data using the Faker library.
public class TestDataHelper {

    // Using a single instance of Faker to generate random data for tests
    private final static Faker FAKER = Faker.instance();

    // Method to get the Faker instance
    public static Faker getFaker() {
        return FAKER;
    }

    // Method to generate a random first name
    public static String generateRandomFirstName() {
        return FAKER.name().firstName();
    }

    // Method to generate a random last name
    public static String generateRandomLastName() {
        return FAKER.name().lastName();
    }

    // Method to generate a random email address
    public static String generateRandomEmail() {
        return FAKER.internet().emailAddress();
    }

    // Method to generate a random password
    public static String generateRandomPassword() {
        return FAKER.internet().password(8, 16); // Password between 8 and 16 characters
    }

    // Method to generate a random number
    public static long generateRandomNumber() {
        return FAKER.number().randomNumber();
    }

    // Method to generate a date in the future
    public static String generateFutureDate(int days, DateTimeFormatter formatter) {
        return LocalDate.now()
                        .plusDays(days).format(formatter);
    }

}
