package com.restAssured.BDD;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasSize;

import org.testng.annotations.Test;



class ResponseBodyValidation {

	@Test
	public void responseValidation() {			
		given().
		baseUri("https://reqres.in").
		when().get("/api/users?page=2")
		.then()
		.log().all()		
		.body("data.first_name[0]", equalTo("Michael"));						
		
	}
	
	@Test
	public void containsMethodValidation() {		
		given().
		baseUri("https://reqres.in").
		when().get("/api/users?page=2")
		.then()					
		.body("data.first_name", contains("Michael", "Lindsay", "Tobias", "Byron", "George", "Rachel"));			
		
	}
	
	@Test
	public void hasItemsValidation() {		
		given().
		baseUri("https://reqres.in").
		when().get("/api/users?page=2")
		.then()				
		.body("data.first_name", hasItems("Michael"));					
		
	}
	
	@Test
	public void hasSizeValidation() {		
		given().
		baseUri("https://reqres.in").
		when().get("/api/users?page=2")
		.then()				
		.body("data.first_name", hasSize(6));					
		
	}
	
	@Test
	public void hasKeyValidation() {		
		given().
		baseUri("https://reqres.in").
		when().get("/api/users?page=2")
		.then()				
		.body("data[0]", hasKey("first_name"));					
		
	}
	
	@Test
	public void hasEntryValidation() {		
		given().
		baseUri("https://reqres.in").
		when().get("/api/users?page=2")
		.then()				
		.body("data[0]", hasEntry("last_name","Lawson"));					
		
	}

}
