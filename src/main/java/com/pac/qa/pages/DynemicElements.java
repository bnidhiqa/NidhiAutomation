package com.pac.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class DynemicElements {

	WebDriver driver;

	@BeforeMethod

	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nidhi Bajpai\\Documents\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com");
	}

	@Test(enabled = false)
	public void linkCount() {
		WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'HTML contact form')]"));
		contact.click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HTML contact form");
		Assert.assertEquals(true, false);

		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());

	}

	@Test
	public void uploadFileTest() {
		WebElement keyboard = driver.findElement(By.xpath("//aside[2]//ul[1]//li[2]//a[1]"));
		keyboard.click();
		// WebElement chooseFile=
		// driver.findElement(By.xpath("//input[@id='browseFile']")));
		// chooseFile.click();
		// chooseFile.sendKeys("C:\\Users\\Nidhi
		// Bajpai\\Desktop\\Testcases\\Status.xlsx");
		WebElement fileInput = driver.findElement(By.xpath("//input[@id='browseFile']"));
		;
		fileInput.sendKeys("C:\\Users\\Nidhi Bajpai\\Desktop\\Testcases\\Status.xlsx");
		WebElement uploadFile = driver.findElement(By.xpath("//button[@id='uploadButton']"));
		uploadFile.click();

		 Alert alert= driver.switchTo().alert();
		 String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();

	}

}
