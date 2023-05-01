package com.api.calls;

import org.codehaus.groovy.ast.stmt.ThrowStatement;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetRequest {

	public static void main(String[] args) {

		Response response = get("https://reqres.in/api/users?page=2");
		// System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		
		if(statusCode == 200) {
			System.out.println("Getting Expected Status");
		} else {
			System.out.println("Not getting expected status code");
		}
		
		given().
			get("https://reqres.in/api/users?page=2").
		then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7))
			.body("data.first_name[0]", equalTo("Michael"));

	}
}
