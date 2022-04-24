package com.Extentreports;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoTests {
	
	
	
	@Test
	public void test1() {		
		System.out.println(" this is test1 ");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {		
		System.out.println(" this is test2 ");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {		
		System.out.println(" this is test3 ");
		Assert.assertTrue(false);
	}
	
	@Test(enabled=true)
	public void test4() {		
		System.out.println(" this is test4 ");
		throw new SkipException(" test case skipped ");
		
	}
	




}
