package com.pac.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.function.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pac.qa.utils.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase()

	{
		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\Nidhi Bajpai\\eclipse-workspace\\PAC\\src\\main\\java\\com\\pac\\qa"
							+ "\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String browserName= prop.getProperty("browser");
		
		if( browserName.equals("chrome"))
			driver=new ChromeDriver();
		//Log.info("Browser Lunch")
		else if( browserName.equals("firefox"))
		{driver=new FirefoxDriver();
		
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPILICITLY_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
}
