package com.nopcommerce.pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.utilities.utilities;

	public class Checkout {

	WebDriver driver;
	utilities rm;

	public Checkout(WebDriver driver) {

	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	    rm = new utilities(driver);
	}

	// Shopping Cart
	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement cart;

	public void openCart() {
	    rm.clickElement(cart);
	}

	// Terms and Conditions
	@FindBy(id="termsofservice")
	WebElement terms;

	public void acceptTerms() {
	    rm.clickElement(terms);
	}

	// Checkout Button
	@FindBy(id="checkout")
	WebElement checkout;

	public void clickCheckout() {
	    rm.clickElement(checkout);
	}

	// First Name
	@FindBy(id="BillingNewAddress_FirstName")
	WebElement firstname;

	public void enterFirstName(String value) {
	    firstname.clear();
	    firstname.sendKeys(value);
	}

	// Last Name
	@FindBy(id="BillingNewAddress_LastName")
	WebElement lastname;

	public void enterLastName(String value) {
	    lastname.clear();
	    lastname.sendKeys(value);
	}

	// Email
	@FindBy(id="BillingNewAddress_Email")
	WebElement email;

	public void enterEmail(String value) {
	    email.clear();
	    email.sendKeys(value);
	}
	//Country
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement country;

	@FindBy(xpath="//option[text()='India']")
	WebElement india;

	public void selectCountryIndia() {

	    rm.clickElement(country);
	    rm.clickElement(india);
	}
    //State/province
	@FindBy(id="BillingNewAddress_StateProvinceId")
	WebElement state;

	@FindBy(xpath="//option[text()='Uttar Pradesh']")
	WebElement uttarpradesh;

	public void selectStateProvince() {

	    rm.clickElement(state);
	    rm.clickElement(uttarpradesh);
	}
	// City
	@FindBy(id="BillingNewAddress_City")
	WebElement city;

	public void enterCity(String value) {
	    city.sendKeys(value);
	}

	// Address1
	@FindBy(id="BillingNewAddress_Address1")
	WebElement address;

	public void enterAddress(String value) {
	    address.sendKeys(value);
	}
	// Address2
		@FindBy(id="BillingNewAddress_Address2")
		WebElement addres;

		public void enterAddress2(String value) {
		    addres.sendKeys(value);
		}

	// Zip Code
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement zipcode;

	public void enterZipCode(String value) {
	    zipcode.sendKeys(value);
	}

	// Phone Number
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement phone;

	public void enterPhone(String value) {
	    phone.sendKeys(value);
	}
	//fax number

	@FindBy(id="BillingNewAddress_FaxNumber")
	WebElement phone2;

	public void faxnumber(String value) {
	    phone2.sendKeys(value);
	}

	// Continue Billing
	@FindBy(xpath="//button[text()='Continue']")
	WebElement billingContinue;

	public void clickBillingContinue() {
	    rm.clickElement(billingContinue);
	}
  //shipping continue
	@FindBy(css=".shipping-method-next-step-button")
	WebElement shippingContinue;

	public void clickShippingContinue() {

	    rm.clickElement(shippingContinue);
	}
	// Payment Method Continue
	@FindBy(css=".payment-method-next-step-button")
	WebElement paymentContinue;
    
	public void clickPaymentMethodContinue() {
	    rm.clickElement(paymentContinue);
	}

	// Payment Information Continue
	@FindBy(css=".payment-info-next-step-button")
	WebElement paymentInfoContinue;

	public void clickPaymentInfoContinue() {
	    rm.clickElement(paymentInfoContinue);
	}

	// Confirm Order
	@FindBy(css=".confirm-order-next-step-button")
	WebElement confirmOrder;

	public void clickConfirmOrder() {
	    rm.clickElement(confirmOrder);
	}

	// Success Message
	@FindBy(xpath="//div[@class='title']/strong")
	WebElement successMessage;

	public String getSuccessMessage() {
	    return successMessage.getText();
	}

	}


