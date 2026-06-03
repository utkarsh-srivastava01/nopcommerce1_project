package com.nopcommerce.pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.utilities.utilities;

	public class cart {


	WebDriver driver;
	utilities rm;

	public cart(WebDriver driver) {

	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	    rm = new utilities(driver);
	}

	// Select Product
	@FindBy(xpath="//a[text()='Samsung Premium Ultrabook']")
	WebElement product;

	public void clickProduct() {
	    rm.clickElement(product);
	}

	// Add to Cart Button
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addToCart;

	public void addProductToCart() {
	    rm.clickElement(addToCart);
	}

	// Shopping Cart Link
	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement shoppingCart;

	public void openCart() {
	    rm.clickElement(shoppingCart);
	}

	// Quantity Textbox
	@FindBy(className="qty-input")
	WebElement quantity;

	public void updateQuantity(String value) {
	    quantity.clear();
	    quantity.sendKeys(value);
	}

	// Update Cart Button
	@FindBy(name="updatecart")
	WebElement updateCart;

	public void clickUpdateCart() {
	    rm.clickElement(updateCart);
	}

	// Remove Product Checkbox
	@FindBy(className="remove-btn")
	WebElement removeItem;

	public void removeItemFromCart() {
	    rm.clickElement(removeItem);
	}

	// Cart Total
	@FindBy(className="product-subtotal")
	WebElement cartTotal;

	public String getCartTotal() {
	    return cartTotal.getText();
	}

	// Empty Cart Message
	@FindBy(xpath="//div[@class='order-summary-content']")
	WebElement emptyCartMessage;

	public String getEmptyCartMessage() {
	    return emptyCartMessage.getText();
	}
	

	}


