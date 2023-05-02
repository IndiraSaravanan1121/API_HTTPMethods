package com.api.calls;

import static io.restassured.RestAssured.*;

public class ApiKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		given()
			.pathParam("mypath", "geo/1.0/direct")
			.queryParam("q", "chicago")
			.queryParam("limit", 1)
			.queryParam("appid", "e71238e36dbbb77cfab35aba27cce36b")
		.when()
			.get("http://api.openweathermap.org/{mypath}")
		.then()
			.statusCode(200)
			.log().all();
	}
}
