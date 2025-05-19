package org.test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Practice {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		Response response = given().header("x-api-key", "reqres-free-v1").get();

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);
	}
}
