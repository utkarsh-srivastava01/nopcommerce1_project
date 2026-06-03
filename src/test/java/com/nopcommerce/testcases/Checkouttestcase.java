package com.nopcommerce.testcases;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Checkout;
import com.nopcommerce.pages.Login;

	public class Checkouttestcase extends base {

	// Verify Proceed to Checkout
	@Test(priority = 1)
	public void verifyProceedToCheckout() throws InterruptedException {
		Login lo=new Login (driver);
		lo.clicklogin();
		Thread.sleep(3000);
		lo.enteremail("utkarshsri3690@gmail.com");
		Thread.sleep(3000);
		lo.enterpassword("#uttu123");
		Thread.sleep(3000);
		lo.clickloginbutton();
		Thread.sleep(3000);
	    Checkout ck = new Checkout(driver);

	    ck.openCart();
	    Thread.sleep(3000);

	    ck.acceptTerms();
	    Thread.sleep(3000);

	    ck.clickCheckout();
	    Thread.sleep(3000);

	    Assert.assertTrue(driver.getCurrentUrl().contains("checkout"));
	}

	// Verify Billing Details
	@Test(priority = 2)
	public void verifyBillingDetails() throws InterruptedException {
		Login lo=new Login (driver);
		lo.clicklogin();
		Thread.sleep(3000);
		lo.enteremail("utkarshsri3690@gmail.com");
		Thread.sleep(3000);
		lo.enterpassword("#uttu123");
		Thread.sleep(3000);
		lo.clickloginbutton();
		Thread.sleep(3000);
		 Checkout ck = new Checkout(driver);

		    ck.openCart();
		    Thread.sleep(3000);

		    ck.acceptTerms();
		    Thread.sleep(3000);

		    ck.clickCheckout();
		    Thread.sleep(3000);

	    ck.enterFirstName("Utkarsh");
	    Thread.sleep(3000);

	    ck.enterLastName("Srivastava");
	    Thread.sleep(3000);

	    ck.enterEmail("utkarsh@gmail.com");
	    Thread.sleep(3000);
	    ck.selectCountryIndia();
	    Thread.sleep(3000);
	    ck.selectStateProvince();
	    Thread.sleep(3000);
	    ck.enterCity("Kanpur");
	    Thread.sleep(3000);

	    ck.enterAddress("nawabganj");
	    Thread.sleep(3000);
	    ck.enterAddress2("na");
        Thread.sleep(3000);
	    ck.enterZipCode("226001");
	    Thread.sleep(3000);

	    ck.enterPhone("6393010033");
	    Thread.sleep(3000);
	    ck.faxnumber("na");
	    Thread.sleep(3000);

	    ck.clickBillingContinue();
	    Thread.sleep(3000);

	    Assert.assertTrue(true);
	}

	// Verify Payment Method
	@Test(priority = 3)
	public void verifyPaymentMethod() throws InterruptedException {
		Login lo=new Login (driver);
		lo.clicklogin();
		Thread.sleep(3000);
		lo.enteremail("utkarshsri3690@gmail.com");
		Thread.sleep(3000);
		lo.enterpassword("#uttu123");
		Thread.sleep(3000);
		lo.clickloginbutton();
		Thread.sleep(3000);
		 Checkout ck = new Checkout(driver);

		    ck.openCart();
		    Thread.sleep(3000);

		    ck.acceptTerms();
		    Thread.sleep(3000);

		    ck.clickCheckout();
		    Thread.sleep(3000);
		    ck.clickBillingContinue();
		   Thread.sleep(5000);
		   ck.clickShippingContinue();;
		   Thread.sleep(5000);
		   ck.clickPaymentMethodContinue();
	    Thread.sleep(3000);
	    ck.clickPaymentInfoContinue();
	    Thread.sleep(3000);

	    Assert.assertTrue(true);
	}

	// Verify Order Confirmation
	@Test(priority = 4)
	public void verifyConfirmOrderSuccessfully() throws InterruptedException {
		Login lo=new Login (driver);
		lo.clicklogin();
		Thread.sleep(3000);
		lo.enteremail("utkarshsri3690@gmail.com");
		Thread.sleep(3000);
		lo.enterpassword("#uttu123");
		Thread.sleep(3000);
		lo.clickloginbutton();
		Thread.sleep(3000);
		 Checkout ck = new Checkout(driver);

		    ck.openCart();
		    Thread.sleep(3000);

		    ck.acceptTerms();
		    Thread.sleep(3000);

		    ck.clickCheckout();
		    Thread.sleep(3000);
		   

		   
		    ck.clickBillingContinue();
			   Thread.sleep(5000);
			   ck.clickShippingContinue();;
			   Thread.sleep(5000);
			   ck.clickPaymentMethodContinue();
		    Thread.sleep(3000);
		    ck.clickPaymentInfoContinue();
		    Thread.sleep(3000);
	    ck.clickConfirmOrder();
	    Thread.sleep(5000);

	  
	}

	}



