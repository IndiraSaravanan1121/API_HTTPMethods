package com.api.calls;

import static io.restassured.RestAssured.given;

public class NTLMAuth implements Tokens {

	void ntlmAuthRequest() {
	given()
		.auth().ntlm(username, password, workStation, domain)
	.when()
		.get(ntlmAuthURL)
	.then()
		.statusCode(200)
		.log().all();

	}

}
