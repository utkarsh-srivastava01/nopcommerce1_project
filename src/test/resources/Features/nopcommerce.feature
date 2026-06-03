Feature: To test NopCommerce E-Commerce Application

# Registration Module

Scenario: Verify user registration with valid details
Given User launches application
When User clicks register link
And User enters first name
And User enters last name
And User enters unique email
And User enters company name
And User enters password
And User enters confirm password
And User clicks register button
Then Registration success message should display

Scenario: Verify registration with existing email
Given User launches application
When User clicks register link
And User enters existing email details
And User clicks register button
Then Existing email error message should display

Scenario: Verify mandatory field validation
Given User launches application
When User clicks register link
And User clicks register button without entering details
Then Mandatory field validation message should display

Scenario: Verify successful registration message
Given User launches application
When User completes registration successfully
Then Registration success message should display


# Login Module

Scenario: Login with valid credentials
Given User launches application
When User clicks login link
And User enters valid email
And User enters valid password
And User clicks login button
Then User should login successfully

Scenario: Login with invalid credentials
Given User launches application
When User clicks login link
And User enters invalid email
And User enters invalid password
And User clicks login button
Then Login error message should display

Scenario: Verify forgot password functionality
Given User launches application
When User clicks login link
And User clicks forgot password link
And User enters registered email
And User clicks recover button
Then Recovery email message should display

Scenario: Verify logout functionality
Given User launches application
When User logs into application
And User clicks logout button
Then User should logout successfully


# Search Module

Scenario: Search product with valid keyword
Given User launches application
When User enters valid search keyword
And User clicks search button
Then Search result should display

Scenario: Search product with invalid keyword
Given User launches application
When User enters invalid search keyword
And User clicks search button
Then No product found message should display

Scenario: Verify product details page
Given User launches application
When User searches product
And User opens product details page
Then Product details page should display


# Wishlist Module

Scenario: Add product to wishlist
Given User launches application
When User logs into application
And User searches wishlist product
And User selects wishlist product
And User clicks add to wishlist button
Then Wishlist success message should display

Scenario: Remove product from wishlist
Given User launches application
When User logs into application
And User opens wishlist page
And User removes wishlist product
Then Wishlist empty message should display

Scenario: Verify wishlist page
Given User launches application
When User opens wishlist page
Then Wishlist page title should display


# Cart Module

Scenario: Add product to cart
Given User launches application
When User logs into application
And User searches cart product
And User selects cart product
And User clicks add to cart button
Then Product should be added to cart

Scenario: Update quantity in cart
Given User launches application
When User logs into application
And User opens shopping cart
And User updates product quantity
Then Quantity should be updated

Scenario: Remove item from cart
Given User launches application
When User logs into application
And User opens shopping cart
And User removes cart item
Then Cart item should be removed

Scenario: Verify cart total
Given User launches application
When User logs into application
And User opens shopping cart
Then Cart total should display


# Checkout Module

Scenario: Proceed to checkout
Given User launches application
When User logs into application
And User opens shopping cart
And User accepts terms and conditions
And User clicks checkout button
Then Checkout page should open

Scenario: Enter billing details

Given User launches application
When User logs into application
And User opens shopping cart
And User accepts terms and conditions
And User clicks checkout button
Then Checkout page should open

When User enters billing first name
And User enters billing last name
And User enters billing email
And User selects country
And User selects state
And User enters city
And User enters address
And User enters zip code
And User enters phone number
And User clicks billing continue button

Then Billing details should be accepted


Scenario: Select payment method

Given User launches application
When User logs into application
And User opens shopping cart
And User accepts terms and conditions
And User clicks checkout button
Then Checkout page should open

And User clicks billing continue button
And User clicks shipping continue button
And User clicks payment method continue button
And User clicks payment information continue button

Then Payment method should be accepted


Scenario: Confirm order successfully

Given User launches application
When User logs into application
And User opens shopping cart
And User accepts terms and conditions
And User clicks checkout button
Then Checkout page should open

And User clicks billing continue button
And User clicks shipping continue button
And User clicks payment method continue button
And User clicks payment information continue button

Then Payment method should be accepted

When User clicks confirm order button

Then Order should be placed successfully