package com.restassured_training;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class Delete_Sample {
	public static void deleteRequest() {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://reqres.in/";
		
		ValidatableResponse statusCode = RestAssured
		.given()
			.header("","")
		.when().delete("/api/users/2")
		.then().statusCode(204);
		
		
		System.out.println(statusCode);
	}

	public static void main(String[] args) {
		deleteRequest();
	}
}
