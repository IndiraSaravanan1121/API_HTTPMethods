package com.api.calls;

import static io.restassured.RestAssured.given;

public class OAuth implements Tokens {
	
	void OAuthRequest() {
		given()
			.auth().oauth2(bearerToken)
		.when()
			.get(bearerTokenURL)
		.then()
			.statusCode(200)
			.log().all();
	}

}
