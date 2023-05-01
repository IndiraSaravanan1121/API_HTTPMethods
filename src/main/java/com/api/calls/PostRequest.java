package com.api.calls;

import org.json.JSONObject;

import static io.restassured.RestAssured.*;

public class PostRequest {

	public static void main(String[] args) {

//		Map<String, Object> map = new HashMap<String, Object>();	
//		map.put("name", "morpheus");
//		map.put("job", "leader");

		JSONObject request = new JSONObject();

		request.put("name", "morpheus");
		request.put("job", "leader");

//		System.out.println(request);
		System.out.println(request.toString());

		given().
			header("Content-Type", "application/json").
			body(request.toString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(200);
	}
}
