package com.pac.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pac.qa.base.TestBase;

public class HomePage extends TestBase {
	
	// Page Factory/OR
	
	@FindBy(xpath="//input[@name='name']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//a[@class='btn btn-block btn-info']")
	WebElement nextButton;
	
	//  initialization of 
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pwd)
	{
		userName.sendKeys(un);
		email.sendKeys(pwd);
		nextButton.click();
		
	
		
	}

}
