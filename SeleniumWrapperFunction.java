package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunction 
{
	private Pojo objPojo;

	public SeleniumWrapperFunction(Pojo pojo) 
	{
		this.objPojo = pojo;
	}

	public boolean setText(By locator, String inputValue) 
	{
		try {
			objPojo.getDriver().findElement(locator).sendKeys(inputValue);
			return true;
		} catch (Exception exception) {
			System.out.println("Set text exception. " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	public boolean mouseHover(By locator) 
	{
		try 
		{
			WebElement objWebElement = objPojo.getDriver().findElement(locator);
			Actions objActions = new Actions(objPojo.getDriver());
			objActions.moveToElement(objWebElement).perform();
			return true;
		} catch (Exception exception) {
			System.out.println("Mouseover Exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
			}
	}
	
	
	public String getText(By locator) 
	{
		try {
		String strgetText =	objPojo.getDriver().findElement(locator).getText().trim();
			return strgetText;
			} catch (Exception exception) {
				System.out.println("There is an exception." + exception.getMessage());
				exception.printStackTrace();
			return null;
			}
		
	}
	
	public boolean selectDropDown(By locator, String selectValue) {
		try {
			Select selectDropDown = new Select(objPojo.getDriver().findElement(locator));
			selectDropDown.selectByVisibleText(selectValue);
			return true;
		} catch (Exception exception) {
			System.out.println("Exception in Dropdown : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
		}
	

	public boolean clickEvent(By locator) {
		try {
			objPojo.getDriver().findElement(locator).click();
			return true;
		} catch (Exception exception) {
			System.out.println("Error Occured: " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

}
