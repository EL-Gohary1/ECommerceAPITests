package com.mahmoudelgohary.ecommerce.constants;

import io.restassured.http.Method;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum AuthPaths {

    LOGIN("/login", Method.POST),
    REGISTER("/register", Method.POST);

    private final String path;
    private final Method method;

}
