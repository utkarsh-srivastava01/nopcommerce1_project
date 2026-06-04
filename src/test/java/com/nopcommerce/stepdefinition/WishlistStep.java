package com.nopcommerce.stepdefinition;

import org.testng.Assert;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Search;
import com.nopcommerce.pages.Wishlist;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistStep extends base {

    Search sr;
    Wishlist wl;

    @When("User searches wishlist product")
    public void user_searches_wishlist_product() {

    try {

        sr = new Search(driver);

        sr.enterSearchKeyword("book");
        Thread.sleep(2000);

        sr.clickSearchButton();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User selects wishlist product")
    public void user_selects_wishlist_product() {

    try {

        wl = new Wishlist(driver);

        wl.clickProduct();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User clicks add to wishlist button")
    public void user_clicks_add_to_wishlist_button() {

    try {

        wl.addToWishlist();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Wishlist success message should display")
    public void wishlist_success_message_should_display() {

    try {

        Assert.assertTrue(
                wl.getWishlistMessage()
                        .contains("The product has been added"));

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User opens wishlist page")
    public void user_opens_wishlist_page() {

    try {

        wl = new Wishlist(driver);

        wl.openWishlist();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User removes wishlist product")
    public void user_removes_wishlist_product() {

    try {

        wl.selectRemoveProduct();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Wishlist empty message should display")
    public void wishlist_empty_message_should_display() {

    try {

        Assert.assertTrue(
                wl.getEmptyWishlistMessage()
                        .contains("The wishlist is empty"));

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Wishlist page title should display")
    public void wishlist_page_title_should_display() {

    try {

        Assert.assertEquals(
                wl.getWishlistTitle(),
                "Wishlist");

    } catch (Exception e) {

        e.printStackTrace();
    }

    }}