package com.restassured_training;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Sample {
public static void main(String[] args) {
	Response response = RestAssured.get("http://www.amazon.in/");
	int statusCode = response.statusCode();
	System.out.println(statusCode);
	String statusLine = response.statusLine();
	System.out.println(statusLine);
	
}
}
