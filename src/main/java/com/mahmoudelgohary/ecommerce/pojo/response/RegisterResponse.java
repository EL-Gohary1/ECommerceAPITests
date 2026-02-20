package com.mahmoudelgohary.ecommerce.pojo.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterResponse{

	@JsonProperty("customerId")
	private String customerId;

	@JsonProperty("isAdmin")
	private boolean isAdmin;

	@JsonProperty("email")
	private String email;

}