package com.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.util.DriverUtilClass;

public class ListnerClass extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
	test=report.createTest(result.getName());
	
		
	}

	public void onTestSuccess(ITestResult result) {
	  test.log(Status.PASS, "testcase passed");
	  
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "tastcase failed");
	String path=DriverUtilClass.getscreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, "testcase skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
		
	}

}