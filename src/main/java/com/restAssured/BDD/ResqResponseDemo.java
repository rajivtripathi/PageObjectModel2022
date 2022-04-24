package com.restAssured.BDD;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResqResponseDemo {
	
	String placeid;

	@BeforeMethod
	public void setUp() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
	}
	
	@Test(priority=1, enabled=true)
	public void GetTest1() {

	Response response= given()
	.header("Content-Type","application/json")
	.queryParam("key", "qaclick")	
	.body("{\r\n" + 
			"  \"location\": {\r\n" + 
			"    \"lat\": -38.383494,\r\n" + 
			"    \"lng\": 33.427362\r\n" + 
			"  },\r\n" + 
			"  \"accuracy\": 50,\r\n" + 
			"  \"name\": \"Frontline house\",\r\n" + 
			"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
			"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
			"  \"types\": [\r\n" + 
			"    \"shoe park\",\r\n" + 
			"    \"shop\"\r\n" + 
			"  ],\r\n" + 
			"  \"website\": \"http://google.com\",\r\n" + 
			"  \"language\": \"French-IN\"\r\n" + 
			"}\r\n" + 
			"")
	.when()
	.post("/maps/api/place/add/json")
	.then()	
	.extract().response();
	
	JsonPath path = new JsonPath(response.asString());	
	placeid=path.get("place_id");	
	System.out.println(" Place Id: "+placeid);	

	}

	
	@Test(priority=2, enabled=false)
	public void GetTest2() {

		System.out.println(" value: "+placeid);
	String response= given().log().all()
	.header("Content-Type","application/json")
	.queryParam("key", "qaclick123")
	.queryParam("place_id", placeid)
	.when()
	.get("/maps/api/place/get/json")
	.then()
	.log().all()
	.extract().response().asString();
	
	System.out.println(" response: " +response);	
	//JsonPath path = new JsonPath(response);		

	}







	

}
