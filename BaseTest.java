package com.generic;

import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest extends Pojo 
{

	public static WebDriver driver;
	private String strBaseURL;
	private SeleniumWrapperFunction objSeleniumWrapper;
	
	public void intializationWebEnv() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		strBaseURL ="https://www.myntra.com";
		this.setBaseURL(strBaseURL);
		driver.get(this.getBaseURL());
		this.setDriver(driver);
		setObjUtilities(new Utilities());
		this.setObjUtilities(getObjUtilities());
		objSeleniumWrapper = new SeleniumWrapperFunction(this);
		this.setObjSeleniumWrapper(objSeleniumWrapper);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		BaseTest.driver = driver;
	}
	
	public void waitFor(int timeUnitinsecond)
	{
		try {
			Thread.sleep(TimeUnit.MILLISECONDS.convert(timeUnitinsecond,TimeUnit.SECONDS));
			
		} catch (Exception exception) {
			System.out.println("Error Message " +exception.getMessage());
		}
		
	}



}
