package com.LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utilities.ScreenShotCapture;
import com.baseClass.BaseClass;

public class LoginPage extends BaseClass{	

	/*
	 * @BeforeMethod public void setUp() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "./src/main/resources/chromedriver.exe"); driver = new ChromeDriver();
	 * driver.manage().window().maximize(); driver.get("https://google.com"); }
	 */
	
	@AfterMethod
	public void tearDown() {
		
		System.out.println("===after Method Called====");
		if(driver!=null) {
		driver.quit();
	}		
	}
		
	@Test(enabled=true)
	public void verifyTitle() {		
		System.out.println(" browser Title: "+driver.getTitle());		
		Assert.assertTrue(driver.getTitle().toLowerCase().contains("google"));
	}
	
	@Test
	public void veryfyBrowserName() {		
		System.out.println(" browser URL: "+driver.getCurrentUrl());			
		Assert.assertTrue(driver.getCurrentUrl().contains("gooogle"));
	}
	

}
