package com.api.calls;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetRequest {

	public static void main(String[] args) {
		
		given()
			.pathParam("mypath", "users") //path parameter
			.queryParam("page", 2) //query parameter
			.queryParam("id", 5)
		.when()
			.get("https://reqres.in/api/{mypath}").
		then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7))
			.body("data.first_name[0]", equalTo("Michael"));
	}
}
