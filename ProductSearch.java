package com.myntra.flows;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.Pojo;

public class ProductSearch
{
	private Pojo objpojo;
		
	 public ProductSearch(Pojo pojo)
		{
			this.objpojo = pojo;
		}
	
		By loc_txtProduct = By.xpath("//ul[@class='results-base']/li[@class='product-base'][11]");
	    By loc_txtPrice = By.xpath("//div[@id='mountRoot']//strong[contains(text(),'Rs')]");
	    
	    
	    public void getThirdRowThirdItem()
	    {
	    	objpojo.getObjSeleniumWrapper().clickEvent(loc_txtProduct);	
	    	System.out.println("Third item is present");
	    	/*String parentwindow = objpojo.getDriver().getWindowHandle();
	    	ArrayList<String> childwindow = new ArrayList<String>(objpojo.getDriver().getWindowHandles());
	    	childwindow.remove(parentwindow);
	        objpojo.getDriver().switchTo().window(childwindow.get(0));*/
	    }
	    
	    public void verifyPriceIsDisplayed() 
		{
	    	Assert.assertTrue(objpojo.getObjSeleniumWrapper().getText(loc_txtPrice).contains("Rs."));
	    	System.out.println("Price is Displayed");
			/*
			 * String strPrice = objpojo.getObjSeleniumWrapper().getText(loc_txtPrice);
			 * String strvalue = strPrice.replaceAll("Rs.", ""); int intPrice =
			 * Integer.parseInt(strvalue); if(intPrice>=10)
			 * System.out.println("Price is valid " +intPrice); else
			 * System.out.println("Price is less than 10 " +intPrice);
			 */
	    }

}
