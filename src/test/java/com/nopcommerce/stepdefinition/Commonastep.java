package com.nopcommerce.stepdefinition;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Login;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Commonastep extends base {

    Login lg;

    @Given("User launches application")
    public void user_launches_application() {

        System.out.println("Application Launched");
    }

    @When("User logs into application")
    public void user_logs_into_application()
            throws Exception {

        lg = new Login(driver);

        lg.clicklogin();
        Thread.sleep(2000);

        lg.enteremail("utkarshsri3690@gmail.com");
        Thread.sleep(2000);

        lg.enterpassword("#uttu123");
        Thread.sleep(2000);

        lg.clickloginbutton();
        Thread.sleep(2000);
    }

    @After
    public void closeBrowser() {

        tearDown();
    }
}