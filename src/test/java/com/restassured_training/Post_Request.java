package com.restassured_training;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class Post_Request {

	public static void postMethod() {
		// TODO Auto-generated method stub
		JSONObject object = new JSONObject();

		object.put("name", "mani");
		object.put("job", "Automation engineer");

		System.out.println(object.toJSONString());
		RestAssured.baseURI = "https://reqres.in/";

		ValidatableResponse statusCode = RestAssured.given().header("", "").body(object.toJSONString())
				.post("/api/users").then().statusCode(201);

		System.out.println(statusCode);

	}
	public static void main(String[] args) {
		postMethod();
	}

}
