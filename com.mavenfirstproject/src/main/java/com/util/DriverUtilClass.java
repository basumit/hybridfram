package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

public class DriverUtilClass extends BaseClass {
   
	public static String  getscreenshot(String name)  {
		 
		 TakesScreenshot ta=(TakesScreenshot)driver;
		 File src=ta.getScreenshotAs(OutputType.FILE);
		 String path=System.getProperty("user.dir")+"/screenshotes/"+name+"jpg";
		 File desp=new File(path);
		 try {
			FileUtils.copyFile(src, desp);
		} catch (IOException e) {
			
		}
		 return path;
	}
}
