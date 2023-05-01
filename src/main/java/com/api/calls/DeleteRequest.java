package com.api.calls;

import static io.restassured.RestAssured.*;

public class DeleteRequest {

	public static void main(String[] args) {
		
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();
		
	}
}
