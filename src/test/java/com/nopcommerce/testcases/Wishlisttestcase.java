package com.nopcommerce.testcases;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Login;
import com.nopcommerce.pages.Search;
import com.nopcommerce.pages.Wishlist;

	public class Wishlisttestcase extends base {


	// Verify add product to wishlist
	@Test(priority = 1)
	public void verifyAddProductToWishlist() throws InterruptedException {
		Login lo=new Login (driver);
		lo.clicklogin();
		Thread.sleep(3000);
		lo.enteremail("utkarshsri3690@gmail.com");
		Thread.sleep(3000);
		lo.enterpassword("#uttu123");
		Thread.sleep(3000);
		lo.clickloginbutton();
		Thread.sleep(3000);
		Search ra=new Search(driver);
		ra.enterSearchKeyword("book");
		Thread.sleep(3000);
		ra.clickSearchButton();
		Thread.sleep(3000);
	    Wishlist wl = new Wishlist(driver);

	    wl.clickProduct();
	    Thread.sleep(3000);

	    wl.addToWishlist();
	    Thread.sleep(3000);

	    Assert.assertTrue(
	            wl.getWishlistMessage()
	            .contains("The product has been added"));
	}

	 //Verify remove product from wishlist
	@Test(priority = 2)
	public void verifyRemoveProductFromWishlist() throws InterruptedException {
		Login lo=new Login (driver);
		lo.clicklogin();
		Thread.sleep(3000);
		lo.enteremail("utkarshsri3690@gmail.com");
		Thread.sleep(3000);
		lo.enterpassword("#uttu123");
		Thread.sleep(3000);
		lo.clickloginbutton();
		Thread.sleep(3000);
		Wishlist wl = new Wishlist(driver);
	    wl.openWishlist();
	    
	    Thread.sleep(3000);

	    wl.selectRemoveProduct();
	    Thread.sleep(3000);

	    Assert.assertTrue(
	            wl.getEmptyWishlistMessage()
	            .contains("The wishlist is empty"));
	}

	// Verify wishlist page
	@Test(priority = 3)
	public void verifyWishlistPage() throws InterruptedException {

	    Wishlist wl = new Wishlist(driver);

	    wl.openWishlist();
	    Thread.sleep(3000);

	    Assert.assertEquals(
	            wl.getWishlistTitle(),
	            "Wishlist");
	}

	}


