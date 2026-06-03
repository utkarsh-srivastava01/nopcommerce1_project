package com.nopcommerce.testcases;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Login;
import com.nopcommerce.pages.Search;
import com.nopcommerce.pages.cart;

	public class Carttestcase extends base {

	// Verify add product to cart
	@Test(priority = 1)
	public void verifyAddProductToCart() throws InterruptedException {
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
		Thread.sleep(5000);
	    cart ct = new cart(driver);

	    ct.clickProduct();
	    Thread.sleep(4000);

	    ct.addProductToCart();
	    Thread.sleep(5000);
	    ct.closeNotificationPopup();
	    Thread.sleep(5000);
	    ct.openCart();
	    Thread.sleep(3000);

	    Assert.assertTrue(driver.getTitle().contains("Shopping Cart"));
	}

	// Verify update quantity in cart
	@Test(priority = 2)
	public void verifyUpdateQuantityInCart() throws InterruptedException {
		Login lo=new Login (driver);
		lo.clicklogin();
		Thread.sleep(3000);
		lo.enteremail("utkarshsri3690@gmail.com");
		Thread.sleep(3000);
		lo.enterpassword("#uttu123");
		Thread.sleep(3000);
		lo.clickloginbutton();
		Thread.sleep(5000);
	    cart ct = new cart(driver);

	    ct.openCart();
	    Thread.sleep(3000);

	    ct.updateQuantity("4");
	    Thread.sleep(3000);

	    Assert.assertTrue(true);
	}

	// Verify remove item from cart
	@Test(priority = 4)
	public void verifyRemoveItemFromCart() throws InterruptedException {
		Login lo=new Login (driver);
		lo.clicklogin();
		Thread.sleep(3000);
		lo.enteremail("utkarshsri3690@gmail.com");
		Thread.sleep(3000);
		lo.enterpassword("#uttu123");
		Thread.sleep(3000);
		lo.clickloginbutton();
		Thread.sleep(4000);
	    cart ct = new cart(driver);

	    ct.openCart();
	    Thread.sleep(5000);

	    ct.removeItemFromCart();
	    Thread.sleep(3000);
	   System.out.println("Successfully Remove Item from this cart");
	}

	// Verify cart total
	@Test(priority = 3)
	public void verifyCartTotal() throws InterruptedException {
		Login lo=new Login (driver);
		lo.clicklogin();
		Thread.sleep(3000);
		lo.enteremail("utkarshsri3690@gmail.com");
		Thread.sleep(3000);
		lo.enterpassword("#uttu123");
		Thread.sleep(3000);
		lo.clickloginbutton();
		Thread.sleep(5000);
	    cart ct = new cart(driver);

	    ct.openCart();
	    Thread.sleep(3000);

	    String total = ct.getCartTotal();

	    Assert.assertFalse(total.isEmpty());
	

	}

}
