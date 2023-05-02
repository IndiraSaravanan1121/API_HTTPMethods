package com.api.calls;

import static io.restassured.RestAssured.given;

public class BearerToken implements Tokens {

	void bearerTokenRequest() {
		// TODO Auto-generated method stub
		given()
			.header("Authorization", "Bearer "+bearerToken)
		.when()
			.get(bearerTokenURL)
		.then()
			.statusCode(200)
			.log().all();
	}
}
