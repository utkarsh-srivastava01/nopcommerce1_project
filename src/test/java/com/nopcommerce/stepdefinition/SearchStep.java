package com.nopcommerce.stepdefinition;

import org.testng.Assert;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Search;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep extends base {

    Search sr;

    @When("User enters valid search keyword")
    public void user_enters_valid_search_keyword() {

    try {

        sr = new Search(driver);

        sr.enterSearchKeyword("computer");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User clicks search button")
    public void user_clicks_search_button() {

    try {

        sr.clickSearchButton();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Search result should display")
    public void search_result_should_display() {

    try {

        Assert.assertTrue(
                sr.getProductTitle()
                        .contains("computer"));

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User enters invalid search keyword")
    public void user_enters_invalid_search_keyword() {

    try {

        sr = new Search(driver);

        sr.enterSearchKeyword("xyz123abc");
        Thread.sleep(4000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("No product found message should display")
    public void No_product_found_message_should_display() {

    try {

        System.out.println("No Product Found");

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User searches product")
    public void user_searches_product() {

    try {

        sr = new Search(driver);

        sr.enterSearchKeyword("computer");
        Thread.sleep(4000);

        sr.clickSearchButton();
        Thread.sleep(3000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User opens product details page")
    public void user_opens_product_details_page() {

    try {

        sr.clickProduct();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Product details page should display")
    public void product_details_page_should_display() {

    try {

        Assert.assertTrue(
                sr.getProductDetailsTitle()
                        .length() > 0);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }}