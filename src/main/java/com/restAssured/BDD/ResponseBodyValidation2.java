package com.restAssured.BDD;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasSize;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


class ResponseBodyValidation2 {

	@Test
	public void responseValidation() {			
		Response response=given().
		baseUri("https://reqres.in").
		when().get("/api/users?page=2")
		.then()
		//.log().all()		
		.extract().response();	
		
		//System.out.println(response.asPrettyString());
		
		//System.out.println(response.getHeaders());
		//System.out.println(response.getBody().asString());
		//System.out.println(response.asString());
		
		JsonPath path = new JsonPath(response.asString());
		
		response.getBody()
		
		String email=path.get("data[0].email");
		
		//String email=path.get("data.email");		
		
		System.out.println(path.get("data.email"));
		System.out.println(path.get("data.size()"));
		
	}
	
	

}
