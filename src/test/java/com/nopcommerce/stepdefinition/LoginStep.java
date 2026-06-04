package com.nopcommerce.stepdefinition;

import org.testng.Assert;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Login;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends base {

    Login lg;

    @When("User clicks login link")
    public void user_clicks_login_link() {

    try {

        lg = new Login(driver);

        lg.clicklogin();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User enters valid email")
    public void user_enters_valid_email() {

    try {

        lg.enteremail("utkarshsri3690@gmail.com");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User enters valid password")
    public void user_enters_valid_password() {

    try {

        lg.enterpassword("#uttu123");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User clicks login button")
    public void user_clicks_login_button() {

    try {

        lg.clickloginbutton();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

    try {

        Assert.assertTrue(
                lg.isLogoutDisplayed());

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User enters invalid email")
    public void user_enters_invalid_email() {

    try {

        lg.enteremail("invalid@gmail.com");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User enters invalid password")
    public void user_enters_invalid_password() {

    try {

        lg.enterpassword("wrong123");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Login error message should display")
    public void login_error_message_should_display() {

    try {

        Assert.assertTrue(
                lg.getLoginErrorMessage()
                        .contains("Login was unsuccessful"));

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User clicks forgot password link")
    public void user_clicks_forgot_password_link() {

    try {

        lg.forgetpassword();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User enters registered email")
    public void user_enters_registered_email() {

    try {

        lg.forgetemail("utkarshsri3690@gmail.com");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User clicks recover button")
    public void user_clicks_recover_button() {

    try {

        lg.recoverbutton();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Recovery email message should display")
    public void recovery_email_message_should_display() {

    try {

        Assert.assertTrue(
                lg.getForgotPasswordMessage()
                        .contains("Email"));

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User clicks logout button")
    public void user_clicks_logout_button() {

    try {

        lg.loginlogout();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("User should logout successfully")
    public void user_should_logout_successfully() {

    try {

        Assert.assertTrue(
                lg.isLoginDisplayed());

    } catch (Exception e) {

        e.printStackTrace();
    }

    }}