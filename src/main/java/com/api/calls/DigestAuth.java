package com.api.calls;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DigestAuth implements Tokens{

	void DigestAuthRequest() {
		// TODO Auto-generated method stub
		given()
			.auth().digest(username, password)
		.when()
			.get(basicAuthURL)
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();
	}
}
