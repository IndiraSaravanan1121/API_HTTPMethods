package com.api.calls;

import static io.restassured.RestAssured.given;

public class JWTToken implements Tokens {
	
	void jwtTokenRequest() {
		given()
		.header("Authorization", "Bearer "+bearerToken)
	.when()
		.get(bearerTokenURL)
	.then()
		.statusCode(200)
		.log().all();
	}

}
