package com.api.calls;

import org.json.JSONObject;
import org.json.JSONTokener;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PostRequest {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File(".\\body.json");
		
		FileReader fr = new FileReader(f);
		
		JSONTokener jt = new JSONTokener(fr);

		JSONObject data = new JSONObject(jt);

		given().
			header("Content-Type", "application/json").
			body(data.toString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201);
	}
}

