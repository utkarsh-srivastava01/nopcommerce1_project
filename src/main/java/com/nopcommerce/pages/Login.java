package com.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.utilities.utilities;

public class Login {

WebDriver driver;
utilities rm;

public Login(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);
    rm = new utilities(driver);
}

// Login Link
@FindBy(xpath="//a[text()='Log in']")
WebElement login;

public void clicklogin() {
    rm.clickElement(login);
}

// Email Field
@FindBy(id="Email")
WebElement emaill;

public void enteremail(String value) {
    emaill.clear();
    emaill.sendKeys(value);
}

// Password Field
@FindBy(id="Password")
WebElement pass;

public void enterpassword(String value) {
    pass.clear();
    pass.sendKeys(value);
}

// Remember Me Checkbox
@FindBy(id="RememberMe")
WebElement rem;

public void clickRememberme() {
    rm.clickElement(rem);
}

// Login Button
@FindBy(xpath="//button[text()='Log in']")
WebElement loginbu;

public void clickloginbutton() {
    rm.clickElement(loginbu);
}

// Forgot Password Link
@FindBy(xpath="//a[text()='Forgot password?']")
WebElement forget;

public void forgetpassword() {
    rm.clickElement(forget);
}

// Forgot Password Email
@FindBy(id="Email")
WebElement foremail;

public void forgetemail(String value) {
    foremail.clear();
    foremail.sendKeys(value);
}

// Recover Button
@FindBy(xpath="//button[text()='Recover']")
WebElement recover;

public void recoverbutton() {
    rm.clickElement(recover);
}

// Logout Link
@FindBy(xpath="//a[text()='Log out']")
WebElement logout;

public void loginlogout() {
    rm.clickElement(logout);
}

// Invalid Login Error Message
@FindBy(xpath="//div[contains(@class,'message-error')]")
WebElement loginError;

public String getLoginErrorMessage() {
    return loginError.getText();
}

// Forgot Password Success Message
@FindBy(xpath="//p[text()='Email with instructions has been sent to you.']")
WebElement forgotPasswordMessage;

public String getForgotPasswordMessage() {
    return forgotPasswordMessage.getText();
}

// Verify Logout Link Displayed
@FindBy(xpath="//a[text()='Log out']")
WebElement logoutVerify;

public boolean isLogoutDisplayed() {
    return logoutVerify.isDisplayed();
}

// Verify Login Link Displayed After Logout
@FindBy(xpath="//a[text()='Log in']")
WebElement loginVerify;

public boolean isLoginDisplayed() {
    return loginVerify.isDisplayed();
}


}
