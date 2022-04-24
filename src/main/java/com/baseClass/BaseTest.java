package com.baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	public static Properties prop;
	
	@BeforeSuite
	public void setUp() throws IOException {
		
		System.out.println("=====set up method started=====");		 
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		 prop = new Properties();
		 prop.load(fis);
		 prop.get("URL"); 
		 System.out.println("=====config file loaded=====");		 
		 System.out.println("=====set up for base URI=====");	 
		
	}
	
	
	@AfterSuite
	public void tearDown() {		
		System.out.println(" tear Down method");
	}

}
