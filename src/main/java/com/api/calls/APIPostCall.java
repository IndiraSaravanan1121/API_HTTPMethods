package com.api.calls;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIPostCall {

	public static void main(String[] args) {

//		JSONObject requestPayload = new JSONObject();
//		requestPayload.put("name", "APIDemo1");
//		requestPayload.put("email", "APIDemo@gmail.com");
//		requestPayload.put("password", "password@123");
//
//		Response response = RestAssured.given().baseUri("http://restapi.adequateshop.com/api/authaccount")
//				.contentType("application/json").body(requestPayload.toString()).when().post("/registration").then()
//				.log().all().extract().response();
//		
//		if (response.jsonPath().get("data") != null) {
//			System.out.println("Token Value: " + response.jsonPath().get("data.Token"));
//		} else {
//			System.out.println("Response Message: " + response.jsonPath().get("data.message"));
//		}
		
		BasicAuth ba = new BasicAuth();
		BearerToken bt = new BearerToken();
		DigestAuth dt = new DigestAuth();
		NoAuth na = new NoAuth();
		NTLMAuth ntlma = new NTLMAuth();
		OAuth oa = new OAuth();
		PreemptiveAuth p = new PreemptiveAuth();
		JWTToken jt = new JWTToken();
		
		
		ba.basicAuthentication();
		bt.bearerTokenRequest();
		dt.DigestAuthRequest();
		na.NoAuthRequest();
		ntlma.ntlmAuthRequest();
		oa.OAuthRequest();
		p.preemptiveRequest();
		jt.jwtTokenRequest();
	}
}
