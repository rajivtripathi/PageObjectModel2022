package com.Extentreports;

import java.io.IOException;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Utilities.ScreenShotCapture;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class MyListener implements ITestListener {

	ExtentTest test;
	
	Date date = new Date();
	String dateName=date.toString().replace(":", "_").replace(" ", "_");
	String basePath = "./Reports/"+dateName;
	String reportPath=basePath+".html";
	String screenShotPath=basePath+".png";
	ExtentReports extent = ExtentReportManager.getExtentReport(reportPath);		
	
	
	public void onFinish(ITestContext context) {		
		System.out.println(" report is flushed ");
		extent.flush();		
	}

	public void onStart(ITestContext context) {			
		System.out.println("====== on start ==== ");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" onTestFailedButWithinSuccessPercentage ");
		
	}

	public void onTestFailure(ITestResult result) {	
		System.out.println("====Inside TestFailure===== ");
		System.out.println(" test is failed ");
		test.fail(" Step 1 ");
		test.fail(" Step 2 ");
		test.log(Status.FAIL, null)
		test.log(Status.FAIL, MarkupHelper.createLabel("this is pass in green", ExtentColor.RED));
		test.log(Status.FAIL, " Test is failed"+result.getTestName());
		try {			
			ScreenShotCapture.takeScreenShot(screenShotPath);
			System.out.println("=======Screenshot Taken======");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		try {
			System.out.println("===screenshot Path ==="+screenShotPath);
			test.fail(" Take screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
			System.out.println("===---Screenshot attached to ExtentReport========");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(" test is skipped ");
		test.log(Status.SKIP, " Test is skipped "+result.getTestName());		
	}

	public void onTestStart(ITestResult result) {		
		System.out.println("===inside onTestStart=====");			
		//test=extent.createTest(" CreateTest "+result.getTestClass().getName()+ " Method Name: "+result.getMethod().getMethodName());
		test=extent.createTest(" TestCase Name: "+result.getMethod().getMethodName());		
		System.out.println("===inside onTestStart finnshed=====");		
		
	}

	public void onTestSuccess(ITestResult result) {		
		System.out.println("==== ITestResult====");
		System.out.println(" test is passed ");
		test.pass(" Step 1 ");		
		try {	
			System.out.println("===screenshot Path ==="+screenShotPath);			
			ScreenShotCapture.takeScreenShot(screenShotPath);			
			System.out.println("=======Screenshot Taken======");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			//String screenshotpath ="./path
			//test.pass(" Take screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
			test.pass(" Step 2");
			test.addScreenCaptureFromPath(screenShotPath);
			test.pass(" Take screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
			System.out.println("===---Screenshot attached to ExtentReport========");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.pass(" Step 2 ");		
		test.log(Status.PASS, MarkupHelper.createLabel("this is pass in green", ExtentColor.GREEN));
	}
	

}
