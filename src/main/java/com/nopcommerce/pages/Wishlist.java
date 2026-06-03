package com.nopcommerce.pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.utilities.utilities;

	public class Wishlist {
	WebDriver driver;
	utilities rm;

	public Wishlist(WebDriver driver) {

	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	    rm = new utilities(driver);
	}

	// Open product
	@FindBy(xpath="//a[text()='Samsung Premium Ultrabook']")
	WebElement product;

	public void clickProduct() {
	    rm.clickElement(product);
	}

	// Add to wishlist button
	@FindBy(xpath="//button[text()='Add to wishlist']")
	WebElement addWishlist;

	public void addToWishlist() {
	    rm.clickElement(addWishlist);
	}

	// Wishlist success message
	@FindBy(xpath="//div[@id='bar-notification']")
	WebElement wishlistMessage;

	public String getWishlistMessage() {
	    return wishlistMessage.getText();
	}

	// Wishlist menu
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement wishlistLink;

	public void openWishlist() {
	    rm.clickElement(wishlistLink);
	}

	// Remove checkbox
	@FindBy(className="remove-btn")
	WebElement removeCheckbox;

	public void selectRemoveProduct() {
	    rm.clickElement(removeCheckbox);
	}

	// Update wishlist button
	@FindBy(id="updatecart")
	WebElement updateWishlist;

	public void updateWishlist() {
	    rm.clickElement(updateWishlist);
	}

	// Empty wishlist message
	@FindBy(xpath="//div[@class='no-data']")
	WebElement emptyWishlistMessage;

	public String getEmptyWishlistMessage() {
	    return emptyWishlistMessage.getText();
	}

	// Wishlist page title
	@FindBy(xpath="//div[@class='page-title']/h1")
	WebElement wishlistTitle;

	public String getWishlistTitle() {
	    return wishlistTitle.getText();
	}


	}


