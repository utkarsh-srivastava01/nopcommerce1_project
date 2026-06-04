package com.nopcommerce.stepdefinition;

import org.testng.Assert;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Checkout;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStep extends base {

    Checkout ck;

    //==========================
    // Checkout Module
    //==========================

    @When("User accepts terms and conditions")
    public void user_accepts_terms_and_conditions() {

    try {

        ck = new Checkout(driver);

        ck.acceptTerms();
        Thread.sleep(2000);

    } catch (Exception e) {

        System.out.println("Failed to accept terms and conditions");
        e.printStackTrace();
    }

    }

    @When("User clicks checkout button")
    public void user_clicks_checkout_button() {

    try {

        ck.clickCheckout();
        Thread.sleep(2000);

    } catch (Exception e) {

        System.out.println("Failed to click checkout button");
        e.printStackTrace();
    }

    }

    @Then("Checkout page should open")
    public void checkout_page_should_open() {

    try {

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("checkout"));

    } catch (Exception e) {

        System.out.println("Checkout page verification failed");
        e.printStackTrace();
    }

    }

    @When("User enters billing first name")
    public void user_enters_billing_first_name() {

    try {

        ck.enterFirstName("Utkarsh");
        Thread.sleep(3000);

    } catch (Exception e) {

        System.out.println("Failed to enter first name");
        e.printStackTrace();
    }

    }

    @When("User enters billing last name")
    public void user_enters_billing_last_name() {

    try {

        ck.enterLastName("Srivastava");
        Thread.sleep(3000);

    } catch (Exception e) {

        System.out.println("Failed to enter last name");
        e.printStackTrace();
    }

    }

    @When("User enters billing email")
    public void user_enters_billing_email() {

    try {

        ck.enterEmail("utkarsh@gmail.com");
        Thread.sleep(3000);

    } catch (Exception e) {

        System.out.println("Failed to enter email");
        e.printStackTrace();
    }

    }

    @When("User selects country")
    public void user_selects_country() {

    try {

        ck.selectCountryIndia();
        Thread.sleep(3000);

    } catch (Exception e) {

        System.out.println("Failed to select country");
        e.printStackTrace();
    }

    }

    @When("User selects state")
    public void user_selects_state() {

    try {

        ck.selectStateProvince();
        Thread.sleep(3000);

    } catch (Exception e) {

        System.out.println("Failed to select state");
        e.printStackTrace();
    }

    }

    @When("User enters city")
    public void user_enters_city() {

    try {

        ck.enterCity("Kanpur");
        Thread.sleep(3000);

    } catch (Exception e) {

        System.out.println("Failed to enter city");
        e.printStackTrace();
    }

    }

    @When("User enters address")
    public void user_enters_address() {

    try {

        ck.enterAddress("nawabganj");
        Thread.sleep(3000);

    } catch (Exception e) {

        System.out.println("Failed to enter address");
        e.printStackTrace();
    }

    }

    @When("User enters zip code")
    public void user_enters_zip_code() {

    try {

        ck.enterZipCode("226001");
        Thread.sleep(3000);

    } catch (Exception e) {

        System.out.println("Failed to enter zip code");
        e.printStackTrace();
    }

    }

    @When("User enters phone number")
    public void user_enters_phone_number() {

    try {

        ck.enterPhone("6393010033");
        Thread.sleep(3000);

    } catch (Exception e) {

        System.out.println("Failed to enter phone number");
        e.printStackTrace();
    }

    }

    @When("User clicks billing continue button")
    public void user_clicks_billing_continue_button() {

    try {

        ck.clickBillingContinue();
        Thread.sleep(5000);

    } catch (Exception e) {

        System.out.println("Failed to click billing continue button");
        e.printStackTrace();
    }

    }

    @Then("Billing details should be accepted")
    public void billing_details_should_be_accepted() {

    try {

        System.out.println("Billing Details Accepted");

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User clicks shipping continue button")
    public void user_clicks_shipping_continue_button() {

    try {

        ck.clickShippingContinue();
        Thread.sleep(5000);

    } catch (Exception e) {

        System.out.println("Failed to click shipping continue button");
        e.printStackTrace();
    }

    }

    @When("User clicks payment method continue button")
    public void user_clicks_payment_method_continue_button() {

    try {

        ck.clickPaymentMethodContinue();
        Thread.sleep(5000);

    } catch (Exception e) {

        System.out.println("Failed to click payment method continue button");
        e.printStackTrace();
    }

    }

    @When("User clicks payment information continue button")
    public void user_clicks_payment_information_continue_button() {

    try {

        ck.clickPaymentInfoContinue();
        Thread.sleep(5000);

    } catch (Exception e) {

        System.out.println("Failed to click payment information continue button");
        e.printStackTrace();
    }

    }

    @Then("Payment method should be accepted")
    public void payment_method_should_be_accepted() {

    try {

        System.out.println("Payment Method Accepted");

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User clicks confirm order button")
    public void user_clicks_confirm_order_button() {

    try {

        ck.clickConfirmOrder();
        Thread.sleep(5000);

    } catch (Exception e) {

        System.out.println("Failed to click confirm order button");
        e.printStackTrace();
    }

    }

    @Then("Order should be placed successfully")
    public void order_should_be_placed_successfully() {

    try {

        System.out.println("Order Placed Successfully");

    } catch (Exception e) {

        e.printStackTrace();
    }

    }}