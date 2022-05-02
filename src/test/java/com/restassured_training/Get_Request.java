package com.restassured_training;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class Get_Request {
	public void getmethod() {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://reqres.in/";
		
		RestAssured.
		given()
			.param("", "");
		ValidatableResponse statusCode = RestAssured.
		when()
			.get("/api/users?page=2\r\n" + 
					"\r\n" + 
					"").
		then()
			.statusCode(200);
		System.out.println(statusCode.toString());
			
	}
	public static void main(String[] args) {
		Get_Request g=new Get_Request();
		g.getmethod();
	}
}
