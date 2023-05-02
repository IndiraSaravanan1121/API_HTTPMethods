package com.api.calls;

public interface Tokens {
	
	String basicAuthURL= "https://postman-echo.com/basic-auth";
	String username= "postman";
	String password= "password";
	
	String bearerTokenURL = "https://api.github.com/user/repos";
	String bearerToken = "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";
	
	String noAuthURL = "https://dummyapi.io/";
	
	String ntlmAuthURL = "https://postman-echo.com/";
	String workStation = "workstation/abc-10";
	String domain = "domain";

}
