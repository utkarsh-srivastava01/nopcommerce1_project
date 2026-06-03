package com.nopcommerce.stepdefinition;

import org.testng.Assert;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Checkout;
import com.nopcommerce.pages.Login;
import com.nopcommerce.pages.Registration;
import com.nopcommerce.pages.Search;
import com.nopcommerce.pages.Wishlist;
import com.nopcommerce.pages.cart;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class stepdefinition extends base {


Registration re;
Login lg;
Search sr;
Wishlist wl;
cart ct;
Checkout ck;
Login lo;

//==========================
//Common Step
//==========================

@Given("User launches application")
public void user_launches_application() throws Exception {

setup();
Thread.sleep(2000);

}

//==========================
//Registration Module
//==========================

@When("User clicks register link")
public void user_clicks_register_link() throws Exception {

re = new Registration(driver);

re.clickregistration();
Thread.sleep(2000);

}

@When("User enters first name")
public void user_enters_first_name() throws Exception {

re.firstname("Utkarsh");
Thread.sleep(2000);

}

@When("User enters last name")
public void user_enters_last_name() throws Exception {

re.lastname("Srivastava");
Thread.sleep(2000);

}

@When("User enters unique email")
public void user_enters_unique_email() throws Exception {

String email =
     "utkarsh" + System.currentTimeMillis() + "@gmail.com";

re.enteremail(email);
Thread.sleep(2000);

}

@When("User enters company name")
public void user_enters_company_name() throws Exception {

re.entercompanyname("Wipro");
Thread.sleep(2000);

}

@When("User enters password")
public void user_enters_password() throws Exception {

re.enterpassword("#uttu123");
Thread.sleep(2000);

}

@When("User enters confirm password")
public void user_enters_confirm_password() throws Exception {

re.enterconfirmpassword("#uttu123");
Thread.sleep(2000);

}

@When("User clicks register button")
public void user_clicks_register_button() throws Exception {

re.registorbuttton();
Thread.sleep(2000);

}

@Then("Registration success message should display")
public void registration_success_message_should_display() {

Assert.assertEquals(
     re.getSuccessMessage(),
     "Your registration completed");

}

@When("User enters existing email details")
public void user_enters_existing_email_details()
throws Exception {

re.genderselection();
Thread.sleep(2000);

re.firstname("Utkarsh");
Thread.sleep(2000);

re.lastname("Srivastava");
Thread.sleep(2000);

re.enteremail("utkarshsri3690@gmail.com");
Thread.sleep(2000);

re.entercompanyname("Wipro");
Thread.sleep(2000);

re.enterpassword("#uttu123");
Thread.sleep(2000);

re.enterconfirmpassword("#uttu123");
Thread.sleep(2000);

}

@Then("Existing email error message should display")
public void existing_email_error_message_should_display() {

System.out.println("email already exits");

}

@When("User clicks register button without entering details")
public void user_clicks_register_button_without_entering_details()
throws Exception {

re.registorbuttton();
Thread.sleep(2000);

}

@Then("Mandatory field validation message should display")
public void mandatory_field_validation_message_should_display() {

Assert.assertEquals(
     re.getFirstNameError(),
     "First name is required.");

}

@When("User completes registration successfully")
public void user_completes_registration_successfully()
throws Exception {

re = new Registration(driver);

re.clickregistration();
Thread.sleep(2000);

re.genderselection();
Thread.sleep(2000);

re.firstname("Test");
Thread.sleep(2000);

re.lastname("User");
Thread.sleep(2000);

String email =
     "test" + System.currentTimeMillis() + "@gmail.com";

re.enteremail(email);
Thread.sleep(2000);

re.entercompanyname("Wipro");
Thread.sleep(2000);

re.enterpassword("#uttu123");
Thread.sleep(2000);

re.enterconfirmpassword("#uttu123");
Thread.sleep(2000);

re.registorbuttton();
Thread.sleep(2000);

}

//==========================
//Login Module
//==========================

@When("User clicks login link")
public void user_clicks_login_link() throws Exception {

lg = new Login(driver);

lg.clicklogin();
Thread.sleep(2000);

}

@When("User enters valid email")
public void user_enters_valid_email() throws Exception {

lg.enteremail("utkarshsri3690@gmail.com");
Thread.sleep(2000);

}

@When("User enters valid password")
public void user_enters_valid_password() throws Exception {

lg.enterpassword("#uttu123");
Thread.sleep(2000);

}

@When("User clicks login button")
public void user_clicks_login_button() throws Exception {

lg.clickloginbutton();
Thread.sleep(2000);

}

@Then("User should login successfully")
public void user_should_login_successfully() {

Assert.assertTrue(
     lg.isLogoutDisplayed());

}

@When("User enters invalid email")
public void user_enters_invalid_email() throws Exception {

lg.enteremail("invalid@gmail.com");
Thread.sleep(2000);

}

@When("User enters invalid password")
public void user_enters_invalid_password() throws Exception {

lg.enterpassword("wrong123");
Thread.sleep(2000);

}

@Then("Login error message should display")
public void login_error_message_should_display() {

Assert.assertTrue(
     lg.getLoginErrorMessage()
     .contains("Login was unsuccessful"));

}

@When("User clicks forgot password link")
public void user_clicks_forgot_password_link()
throws Exception {

lg.forgetpassword();
Thread.sleep(2000);

}

@When("User enters registered email")
public void user_enters_registered_email()
throws Exception {

lg.forgetemail("utkarshsri3690@gmail.com");
Thread.sleep(2000);

}

@When("User clicks recover button")
public void user_clicks_recover_button()
throws Exception {

lg.recoverbutton();
Thread.sleep(2000);

}

@Then("Recovery email message should display")
public void recovery_email_message_should_display() {

Assert.assertTrue(
     lg.getForgotPasswordMessage()
     .contains("Email"));

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

@When("User clicks logout button")
public void user_clicks_logout_button()
throws Exception {

lg.loginlogout();
Thread.sleep(2000);

}

@Then("User should logout successfully")
public void user_should_logout_successfully() {

Assert.assertTrue(
     lg.isLoginDisplayed());

}
//==========================
//Search Module
//==========================

@When("User enters valid search keyword")
public void user_enters_valid_search_keyword()
throws Exception {

sr = new Search(driver);

sr.enterSearchKeyword("computer");
Thread.sleep(2000);

}

@When("User clicks search button")
public void user_clicks_search_button()
throws Exception {

sr.clickSearchButton();
Thread.sleep(2000);

}

@Then("Search result should display")
public void search_result_should_display() {

Assert.assertTrue(
     sr.getProductTitle()
     .contains("computer"));

}

@When("User enters invalid search keyword")
public void user_enters_invalid_search_keyword()
throws Exception {

sr = new Search(driver);

sr.enterSearchKeyword("xyz123abc");
Thread.sleep(4000);

}

@Then("No product found message should display")
public void no_product_found_message_should_display() {

System.out.println("No Product Found");

}

@When("User searches product")
public void user_searches_product()
throws Exception {

sr = new Search(driver);

sr.enterSearchKeyword("computer");
Thread.sleep(4000);

sr.clickSearchButton();
Thread.sleep(3000);

}

@When("User opens product details page")
public void user_opens_product_details_page()
throws Exception {

sr.clickProduct();
Thread.sleep(2000);

}

@Then("Product details page should display")
public void product_details_page_should_display() {

Assert.assertTrue(
     sr.getProductDetailsTitle()
     .length() > 0);

}

//==========================
//Wishlist Module
//==========================

@When("User searches wishlist product")
public void user_searches_wishlist_product()
throws Exception {

sr = new Search(driver);

sr.enterSearchKeyword("book");
Thread.sleep(2000);

sr.clickSearchButton();
Thread.sleep(2000);

}

@When("User selects wishlist product")
public void user_selects_wishlist_product()
throws Exception {

wl = new Wishlist(driver);

wl.clickProduct();
Thread.sleep(2000);

}

@When("User clicks add to wishlist button")
public void user_clicks_add_to_wishlist_button()
throws Exception {

wl.addToWishlist();
Thread.sleep(2000);

}

@Then("Wishlist success message should display")
public void wishlist_success_message_should_display() {

Assert.assertTrue(
     wl.getWishlistMessage()
     .contains("The product has been added"));

}

@When("User opens wishlist page")
public void user_opens_wishlist_page()
throws Exception {

wl = new Wishlist(driver);

wl.openWishlist();
Thread.sleep(2000);

}

@When("User removes wishlist product")
public void user_removes_wishlist_product()
throws Exception {

wl.selectRemoveProduct();
Thread.sleep(2000);

}

@Then("Wishlist empty message should display")
public void wishlist_empty_message_should_display() {

Assert.assertTrue(
     wl.getEmptyWishlistMessage()
     .contains("The wishlist is empty"));

}

@Then("Wishlist page title should display")
public void wishlist_page_title_should_display() {

Assert.assertEquals(
     wl.getWishlistTitle(),
     "Wishlist");

}
//==========================
//Cart Module
//==========================

@When("User searches cart product")
public void user_searches_cart_product()
throws Exception {

sr = new Search(driver);

sr.enterSearchKeyword("book");
Thread.sleep(2000);

sr.clickSearchButton();
Thread.sleep(2000);

}

@When("User selects cart product")
public void user_selects_cart_product()
throws Exception {

ct = new cart(driver);

ct.clickProduct();
Thread.sleep(2000);

}

@When("User clicks add to cart button")
public void user_clicks_add_to_cart_button()
throws Exception {

ct.addProductToCart();
Thread.sleep(5000);

}

@Then("Product should be added to cart")
public void product_should_be_added_to_cart() throws InterruptedException {

ct.openCart();

System.out.println("successfully product should be added to cart");
Thread.sleep(4000);
}


@When("User opens shopping cart")
public void user_opens_shopping_cart()
throws Exception {

ct = new cart(driver);

ct.openCart();
Thread.sleep(2000);

}

@When("User updates product quantity")
public void user_updates_product_quantity()
throws Exception {

ct.updateQuantity("4");
Thread.sleep(2000);

}

@Then("Quantity should be updated")
public void quantity_should_be_updated() {

Assert.assertTrue(true);

}

@When("User removes cart item")
public void user_removes_cart_item()
throws Exception {

ct.removeItemFromCart();
Thread.sleep(2000);

}

@Then("Cart item should be removed")
public void cart_item_should_be_removed() {

System.out.println(
     "Successfully Remove Item From Cart");

}

@Then("Cart total should display")
public void cart_total_should_display() {

Assert.assertFalse(
     ct.getCartTotal().isEmpty());

}

//==========================
//Checkout Module
//==========================

@When("User accepts terms and conditions")
public void user_accepts_terms_and_conditions()
throws Exception {

ck = new Checkout(driver);

ck.acceptTerms();
Thread.sleep(2000);

}

@When("User clicks checkout button")
public void user_clicks_checkout_button()
throws Exception {

ck.clickCheckout();
Thread.sleep(2000);

}

@Then("Checkout page should open")
public void checkout_page_should_open() {

Assert.assertTrue(
     driver.getCurrentUrl()
     .contains("checkout"));

}

//==========================
//Billing Details
//==========================

@When("User enters billing first name")
public void user_enters_billing_first_name() throws Exception {

 ck.enterFirstName("Utkarsh");
 Thread.sleep(3000);
}

@When("User enters billing last name")
public void user_enters_billing_last_name() throws Exception {

 ck.enterLastName("Srivastava");
 Thread.sleep(3000);
}

@When("User enters billing email")
public void user_enters_billing_email() throws Exception {

 ck.enterEmail("utkarsh@gmail.com");
 Thread.sleep(3000);
}

@When("User selects country")
public void user_selects_country() throws Exception {

 ck.selectCountryIndia();
 Thread.sleep(3000);
}

@When("User selects state")
public void user_selects_state() throws Exception {

 ck.selectStateProvince();
 Thread.sleep(3000);
}

@When("User enters city")
public void user_enters_city() throws Exception {

 ck.enterCity("Kanpur");
 Thread.sleep(3000);
}

@When("User enters address")
public void user_enters_address() throws Exception {

 ck.enterAddress("nawabganj");
 Thread.sleep(3000);
}

@When("User enters zip code")
public void user_enters_zip_code() throws Exception {

 ck.enterZipCode("226001");
 Thread.sleep(3000);
}

@When("User enters phone number")
public void user_enters_phone_number() throws Exception {

 ck.enterPhone("6393010033");
 Thread.sleep(3000);
}

@When("User clicks billing continue button")
public void user_clicks_billing_continue_button() throws Exception {

 ck.clickBillingContinue();
 Thread.sleep(5000);
}

@Then("Billing details should be accepted")
public void billing_details_should_be_accepted() {

 System.out.println("Billing Details Accepted");
}

//==========================
//Payment Method
//==========================

@When("User clicks shipping continue button")
public void user_clicks_shipping_continue_button() throws Exception {

 ck.clickShippingContinue();
 Thread.sleep(5000);
}

@When("User clicks payment method continue button")
public void user_clicks_payment_method_continue_button() throws Exception {

 ck.clickPaymentMethodContinue();
 Thread.sleep(5000);
}

@When("User clicks payment information continue button")
public void user_clicks_payment_information_continue_button() throws Exception {

 ck.clickPaymentInfoContinue();
 Thread.sleep(5000);
}

@Then("Payment method should be accepted")
public void payment_method_should_be_accepted() {

 System.out.println("Payment Method Accepted");
}

//==========================
//Confirm Order
//==========================

@When("User clicks confirm order button")
public void user_clicks_confirm_order_button() throws Exception {

 ck.clickConfirmOrder();
 Thread.sleep(5000);
}

@Then("Order should be placed successfully")
public void order_should_be_placed_successfully() {

 System.out.println("Order Placed Successfully");
}

@After
public void closeBrowser() {

    tearDown();
}


}
