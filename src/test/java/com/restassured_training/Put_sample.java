package com.restassured_training;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class Put_sample {
	public static void putMethod() {
		// TODO Auto-generated method stub
		JSONObject object = new JSONObject();

		object.put("name", "mani");
		object.put("job", "Automation engineer");

		System.out.println(object.toJSONString());
		RestAssured.baseURI = "https://reqres.in/";

		ValidatableResponse statusCode = RestAssured.given().header("", "").body(object.toJSONString())
				.put("api/users/2").then().statusCode(200);

		System.out.println(statusCode);

	}
	public static void main(String[] args) {
		putMethod();
	}

}
