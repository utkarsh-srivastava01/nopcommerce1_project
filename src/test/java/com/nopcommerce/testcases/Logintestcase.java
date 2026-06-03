package com.nopcommerce.testcases;


	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Login;

	public class Logintestcase extends base {
		

		
		// Verify login with valid credentials
		@Test(priority = 1)
		public void verifyValidLogin() throws InterruptedException {

		    Login lg = new Login(driver);

		    lg.clicklogin();
		    Thread.sleep(3000);

		    lg.enteremail("utkarshsri3690@gmail.com");
		    Thread.sleep(3000);

		    lg.enterpassword("#uttu123");
		    Thread.sleep(3000);

		    lg.clickloginbutton();
		    Thread.sleep(3000);

		    Assert.assertTrue(lg.isLogoutDisplayed());
		}

		// Verify login with invalid credentials
		@Test(priority = 2)
		public void verifyInvalidLogin() throws InterruptedException {

		    Login lg = new Login(driver);

		    lg.clicklogin();
		    Thread.sleep(3000);

		    lg.enteremail("invalid@gmail.com");
		    Thread.sleep(3000);

		    lg.enterpassword("wrong123");
		    Thread.sleep(3000);

		    lg.clickloginbutton();
		    Thread.sleep(3000);

		    Assert.assertTrue(
		            lg.getLoginErrorMessage()
		            .contains("Login was unsuccessful"));
		}

		// Verify forgot password functionality
		@Test(priority = 3)
		public void verifyForgotPasswordFunctionality() throws InterruptedException {

		    Login lg = new Login(driver);

		    lg.clicklogin();
		    Thread.sleep(3000);

		    lg.forgetpassword();
		    Thread.sleep(3000);

		    lg.forgetemail("utkarshsri3690@gmail.com");
		    Thread.sleep(3000);

		    lg.recoverbutton();
		    Thread.sleep(3000);

		    Assert.assertTrue(
		            lg.getForgotPasswordMessage()
		            .contains("Email with instructions has been sent"));
		    System.out.println(lg.getForgotPasswordMessage());
		}

		// Verify logout functionality
		@Test(priority = 4)
		public void verifyLogoutFunctionality() throws InterruptedException {

		    Login lg = new Login(driver);

		    lg.clicklogin();
		    Thread.sleep(3000);

		    lg.enteremail("utkarshsri3690@gmail.com");
		    Thread.sleep(3000);

		    lg.enterpassword("#uttu123");
		    Thread.sleep(3000);

		    lg.clickloginbutton();
		    Thread.sleep(4000);

		    lg.loginlogout();
		    Thread.sleep(3000);

		    Assert.assertTrue(lg.isLoginDisplayed());
		}
		

		}		

	



