package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PageClass extends BaseClass {
   
	@FindBy(id="email")
	WebElement urname;
	@FindBy(id="password")
	WebElement pass;
	@FindBy(xpath="//button")
	WebElement loginbutton;
	
	public PageClass(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void logintoapplicatopn(String username,String password) {
		   
		urname.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
	}
	
}
