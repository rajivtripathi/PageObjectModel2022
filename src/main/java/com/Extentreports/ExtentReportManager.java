package com.Extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportManager {	
	
	public static ExtentReports extentReport;
	public static ExtentHtmlReporter htmlReporter;

	
	public static ExtentReports getExtentReport(String str) {	
		
		htmlReporter = new ExtentHtmlReporter(str);
		htmlReporter.config().setDocumentTitle(" Rajiv Extent Report ");
		htmlReporter.config().setEncoding("UTF-8");
		htmlReporter.config().setReportName(" Rajiv Extent Report Name ");
		
		extentReport =new ExtentReports();
		extentReport.attachReporter(htmlReporter);
		
		extentReport.setSystemInfo(" Tester", " Rajiv");
		extentReport.setSystemInfo("build", "15");		
		return extentReport;
		
		
	}
	
	
	

}
