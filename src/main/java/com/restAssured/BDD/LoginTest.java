package com.restAssured.BDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseClass.BaseTest;

import io.restassured.path.json.JsonPath;

public class LoginTest {
	
	
	@Test(priority=1, enabled=true)
	public void correctLogin() {
		System.out.println(BaseTest.prop.get("URL"));
		System.out.println(" successful Login done");
		Assert.assertTrue(true);

	}
	
	@Test(priority=2, enabled=true)
	public void incorrectLogin() {
		System.out.println(BaseTest.prop.get("URL"));
		System.out.println(" successful Login done");
		Assert.assertTrue(true);

	}
	
	@Test(priority=3, enabled=true)
	public void LoginSSO() {
		System.out.println(BaseTest.prop.get("URL"));
		System.out.println(" successful Login done");
		Assert.assertTrue(false);

	}

}
