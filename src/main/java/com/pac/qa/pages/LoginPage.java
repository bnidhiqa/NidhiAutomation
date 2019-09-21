package com.pac.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base {
	
	
	//Page Factory/OR
	
	@FindBy(xpath= "//span[contains(text(),'Login')]");
	WebElement loginLink;
	
	

}
