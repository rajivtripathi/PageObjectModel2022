package com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	
	public static WebDriver driver;	
		

	@BeforeMethod
	public void setUp() {
		System.out.println("===before Method Called====");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	

}
