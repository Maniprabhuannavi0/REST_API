package com.restassured_training;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.ValidatableResponse;

public class Json_Validation {

	public static void checking() {
		// TODO Auto-generated method stub
		ValidatableResponse body = get("https://reqres.in/api/users/2").then().body("data.id", equalTo(2));
		System.out.println(body.toString());

	}
	public static void checking_1() {
		// TODO Auto-generated method stub
		ValidatableResponse body = get("https://reqres.in/api/users/2").then().body("data.email", equalTo("janet.weaver@reqres.in"));
		System.out.println(body.toString());

	}
	public static void checking_2() {
		// TODO Auto-generated method stub
		ValidatableResponse body = get("https://reqres.in/api/users/2").then().body("data.first_name", equalTo("Janet"));
		System.out.println(body.toString());

	}

	public static void main(String[] args) {
		checking();
		checking_1();
		checking_2();
	}
}
