package com.api.calls;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicAuth implements Tokens {

	void basicAuthentication() {
		given()
			.auth().basic(username, password)
		.when()
			.get(basicAuthURL)
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();
	}
}
