package com.restAssured.BDD;

public class Data {
	
	
	
	public static String jsonData() {
		
		return "{\r\n" + 
				" \"name\":\"rajiv\",\r\n" + 
				" \"age\": 30,\r\n" + 
				" \"company\": {\r\n" + 
				" \r\n" + 
				"  \"company_name\": \"Birlasoft\",\r\n" + 
				"  \"salary\": \"2000\",\r\n" + 
				"  \"address\": \"Sector 135\" \r\n" + 
				" },\r\n" + 
				" \r\n" + 
				" \"courses\":[\r\n" + 
				" \r\n" + 
				" {\"title\":\"selenium\",\r\n" + 
				" \"price\": 100 \r\n" + 
				" },\r\n" + 
				" \r\n" + 
				"  {\"title\":\"QTP\",\r\n" + 
				" \"price\": 200 \r\n" + 
				" },\r\n" + 
				" \r\n" + 
				"   {\"title\":\"API\",\r\n" + 
				" \"price\": 300 \r\n" + 
				" }\r\n" + 
				" \r\n" + 
				" ]\r\n" + 
				"\r\n" + 
				"}";
	}

}
