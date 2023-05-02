package com.api.calls;

import static io.restassured.RestAssured.given;

public class NoAuth implements Tokens{
	
	void NoAuthRequest() {

		given()
			.get(noAuthURL)
		.then()
			.statusCode(200)
			.log().all();
	}
}
