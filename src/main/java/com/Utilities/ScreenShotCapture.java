package com.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;



public class ScreenShotCapture extends BaseClass {	

	
	  public static void takeScreenShot(String str) throws IOException {
		  
	  File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file, new File(str));
	  
	  }
	 
	


}
