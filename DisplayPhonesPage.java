package com.myntra.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.Pojo;

public class DisplayPhonesPage {
	
private Pojo objpojo;


	public DisplayPhonesPage(Pojo pojo)
	{
		this.objpojo = pojo;
	}
		By loc_MensMenu = By.xpath("//a[@data-group='men']");
		By loc_txtPhoneCases = By.xpath("//a[@data-reactid='168']");
		By loc_txtMobilePhonesCases = By.xpath("//h1[text()='Mobile Phone Cases']");
		By loc_txtProduct = By.xpath("//div[@id='mountRoot']//ul/li[@class='product-base'][11]");
	    By loc_txtPrice = By.xpath("//div[@id='mountRoot']//strong[contains(text(),'Rs.')]");
		
	public void mouseHoverOnMenMenu() 
	{
		Assert.assertTrue(objpojo.getObjSeleniumWrapper().mouseHover(loc_MensMenu));
		Assert.assertTrue(objpojo.getObjSeleniumWrapper().clickEvent(loc_txtPhoneCases));

	}

	public void verifyMobilePhonesCasesPageIsDisplayed() 
	{
		Assert.assertTrue(objpojo.getObjSeleniumWrapper().getText(loc_txtMobilePhonesCases).equals("Mobile Phone Cases"));
		System.out.println("Mobile phone is displayed.");
	}
	

}