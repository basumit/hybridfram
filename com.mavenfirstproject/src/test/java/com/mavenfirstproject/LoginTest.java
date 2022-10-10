package com.mavenfirstproject;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.listners.ListnerClass;
import com.pages.PageClass;

@Listeners(ListnerClass.class)
public class LoginTest extends BaseClass{
     PageClass ll=null;
      @BeforeSuite
	 public  void setup() throws Exception {
		   
		  intialization();
		  reportInit();
		  ll=new PageClass(driver);
      }
			
	 @Test
	 public void test01() {
		 ll.logintoapplicatopn("kiran@gmail.com", "123456");
	 }
	 @Test
	 public void test02() {
		 System.out.println("test02");
		Assert.assertTrue(false);
	 }
	 @Test
	 public void test03() {
		 throw new SkipException("skpping test");
	 }
}
