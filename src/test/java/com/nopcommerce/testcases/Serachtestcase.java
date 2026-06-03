package com.nopcommerce.testcases;


	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Search;

	public class Serachtestcase  extends base {


	// Verify search with valid keyword
	@Test(priority = 1)
	public void verifySearchWithValidKeyword() throws InterruptedException {

	    Search sr = new Search(driver);

	    sr.enterSearchKeyword("computer");
	    Thread.sleep(3000);

	    sr.clickSearchButton();
	    Thread.sleep(3000);

	    Assert.assertTrue(
	            sr.getProductTitle().contains("computer"));
	}

	// Verify search with invalid keyword
	@Test(priority = 2)
	public void verifySearchWithInvalidKeyword() throws InterruptedException {

	    Search sr = new Search(driver);

	    sr.enterSearchKeyword("xyz123abc");
	    Thread.sleep(3000);

	    sr.clickSearchButton();
	    Thread.sleep(3000);

	   System.out.println("no product found");
	}

	// Verify product details page
	@Test(priority = 3)
	public void verifyProductDetailsPage() throws InterruptedException {

	    Search sr = new Search(driver);

	    sr.enterSearchKeyword("computer");
	    Thread.sleep(3000);

	    sr.clickSearchButton();
	    Thread.sleep(3000);

	    sr.clickProduct();
	    Thread.sleep(3000);

	    Assert.assertTrue(
	            sr.getProductDetailsTitle().length() > 0);
Thread.sleep(3000);

	}

}
