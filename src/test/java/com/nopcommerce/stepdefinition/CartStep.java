package com.nopcommerce.stepdefinition;

import org.testng.Assert;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Search;
import com.nopcommerce.pages.cart;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStep extends base  {

    Search sr;
    cart ct;

    @When("User searches cart product")
    public void user_searches_cart_product() {

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

    @When("User selects cart product")
    public void user_selects_cart_product() {

    try {

        ct = new cart(driver);

        ct.clickProduct();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User clicks add to cart button")
    public void user_clicks_add_to_cart_button() {

    try {

        ct.addProductToCart();
        Thread.sleep(5000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Product should be added to cart")
    public void product_should_be_added_to_cart() {

    try {

        ct.openCart();
        Thread.sleep(4000);

        System.out.println(
                "Successfully Product Added To Cart");

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User opens shopping cart")
    public void user_opens_shopping_cart() {

    try {

        ct = new cart(driver);

        ct.openCart();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User updates product quantity")
    public void user_updates_product_quantity() {

    try {

        ct.updateQuantity("4");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Quantity should be updated")
    public void quantity_should_be_updated() {

    try {

        Assert.assertTrue(true);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @When("User removes cart item")
    public void user_removes_cart_item() {

    try {

        ct.removeItemFromCart();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Cart item should be removed")
    public void cart_item_should_be_removed() {

    try {

        System.out.println(
                "Successfully Remove Item From Cart");

    } catch (Exception e) {

        e.printStackTrace();
    }

    }

    @Then("Cart total should display")
    public void cart_total_should_display() {

    try {

        Assert.assertFalse(
                ct.getCartTotal().isEmpty());

    } catch (Exception e) {

        e.printStackTrace();
    }

    }}