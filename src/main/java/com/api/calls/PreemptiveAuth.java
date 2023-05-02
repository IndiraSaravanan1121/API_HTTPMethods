package com.api.calls;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PreemptiveAuth implements Tokens {
	
	void preemptiveRequest() {
		given()
			.auth().preemptive().basic(username, password)
		.when()
			.get(basicAuthURL)
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();
	}

}
