package com.restAssured.BDD;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.BaseTest;

public class ComplexJason extends BaseTest {

	
	@Test(priority=1, enabled=false)
	public void complexJasonDataTest() {

	String response= Data.jsonData();		
	JsonPath path = new JsonPath(response);		
	System.out.println(path.get("company.company_name"));
	System.out.println(path.get("company.salary"));
	
	int count = path.get("courses.size()");
	System.out.println(" count "+count);
	
	for (int i = 0; i < count; i++) {		
		System.out.println(" title: "+path.get("courses["+i+"].title"));
		System.out.println(" price "+path.get("courses["+i+"].price"));
	}


	}
	
	
	@Test(priority=1, enabled=true)
	public void ResponseValidation() {

	String response= Data.jsonData();		
	JsonPath path = new JsonPath(response);		
	//System.out.println(path.get("company.company_name"));
	//System.out.println(path.get("company.salary"));
	

	System.out.println(" titles "+path.get("courses.title"));
	System.out.println(" titles "+path.get("courses.title"));
	 System.out.println(BaseTest.prop.get("URL"));
	



	}



}
