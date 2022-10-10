package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.util.Utilproperties;

public class BaseClass {
    public static WebDriver driver=null;
    public static ExtentReports report=null;
    public static ExtentSparkReporter spark=null;
    public static ExtentTest test=null;
    public static Logger log=Logger.getLogger(BaseClass.class);
	public static void intialization() throws Exception  {
		log.info("intilization browser");
		String browsername=Utilproperties.readproperty("browser");
        if (browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("WebDriver.chrome.driver","D:/ChromeDriver.exe")	;
		  driver=new ChromeDriver();
		  
		}
        if (browsername.equalsIgnoreCase("FirefoxDriver")) {
    		System.setProperty("WebDriver.gecko.driver","D:/geckoDriver.exe")	;
    		  driver=new FirefoxDriver();
    		  
    		}
       driver.manage().window().maximize();
       driver.get(Utilproperties.readproperty("url"));
        	 
         }
        	
	  public static void reportInit() {
	   report=new ExtentReports() ;
	 spark= new ExtentSparkReporter(System.getProperty("user.dir")+"/target/Extentreport.html");
	   report.attachReporter(spark);
	
       
	}

	

	
}
