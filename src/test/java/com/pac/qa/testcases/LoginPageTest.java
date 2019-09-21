package com.pac.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

	WebDriver driver;

	@BeforeMethod

	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nidhi Bajpai\\Documents\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://way2automation.com/way2auto_jquery/index.php");

	}

	@Test(enabled = false)

	public void registerForm() {
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("myname");
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("1008952300");
		WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
		email.sendKeys("rashi.qa@gmail.com");
		Select dpCountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		dpCountry.selectByVisibleText("Nepal");
		WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
		city.sendKeys("kath");
		WebElement userName = driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']"));
		userName.sendKeys("giri");
		WebElement password = driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']"));
		password.sendKeys("giri12345");
		WebElement submitBtn = driver.findElement(By.xpath("//div[@id='load_box']//input[@class='button']"));
		submitBtn.click();
	}

	@Test(enabled = true)
	public void signInTest() {
		WebElement signInLink = driver.findElement(By.linkText("Signin"));
		signInLink.click();

		WebElement username1 = driver.findElement(By.xpath("//div[@id='login']//input[@name='username']"));
		username1.sendKeys("Nidhi");
		WebElement password1 = driver.findElement(By.xpath("//div[@id='login']//input[@name='password']"));
		password1.sendKeys("nidhi123");
		WebElement submitbtn1 = driver.findElement(By.xpath("//div[@id='login']//input[@class='button']"));
		submitbtn1.click();
		
		driver.navigate().to("http://way2automation.com/way2auto_jquery/submit_button_clicked.php");
		
	
	//	WebElement list = driver.findElement(By.xpath("//h2[contains(text(),'Droppable')]"));

		//list.click();
	}

	@Test(enabled = false)
	public void clickdroppable() {

		WebElement list = driver.findElement(By.xpath("//h2[contains(text(),'Droppable')]"));

		list.click();
	}

	@AfterMethod

	public void tearDown() {
		// driver.close();
	}

}
