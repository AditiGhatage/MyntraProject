package com.myntra.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.myntra.flows.ProductSearch;
import com.myntra.pageFactory.DisplayPhonesPage;

public class MyntraProductSearchTest extends BaseTest
{
	private DisplayPhonesPage objDisplayPhonesPage;
    private ProductSearch objpProductSearch;

    public void initializeWebPages() 
    {
    	objDisplayPhonesPage = new DisplayPhonesPage(this);
    	objpProductSearch = new ProductSearch(this);
    }

	@BeforeClass
	public void initializeWebEnv() {
		this.initializeWebPages();
		this.intializationWebEnv();
	}

	@AfterClass
	public void tearDownEnv(){
		this.tearDown();
	}

	@Test
	public void TCID_101_verifyMensMenuIsSelected()
	{
		this.waitFor(3);
		objDisplayPhonesPage.mouseHoverOnMenMenu();
		objDisplayPhonesPage.verifyMobilePhonesCasesPageIsDisplayed();
		System.out.println("Phones are displayed.");
	}
	
	@Test
	public void TCID_102_verifyClickOnThridProduct()
	{
		this.waitFor(2);
		objpProductSearch.getThirdRowThirdItem();
		//objpProductSearch.verifyPriceIsDisplayed();
		waitFor(3);
	}
	
}
