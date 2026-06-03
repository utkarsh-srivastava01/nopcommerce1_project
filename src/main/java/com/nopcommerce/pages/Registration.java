package com.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.utilities.utilities;

public class Registration {


WebDriver driver;
utilities rm;

public Registration(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);
    rm = new utilities(driver);
}

@FindBy(xpath="//a[text()='Register']")
WebElement regis;

public void clickregistration() {
    rm.clickElement(regis);
}

@FindBy(id="gender-male")
WebElement gender;

public void genderselection() {
    rm.clickElement(gender);
}

@FindBy(id="FirstName")
WebElement first;

public void firstname(String value) {
    first.sendKeys(value);
}

@FindBy(id="LastName")
WebElement last;

public void lastname(String value) {
    last.sendKeys(value);
}

@FindBy(id="Email")
WebElement email;

public void enteremail(String value) {
    email.sendKeys(value);
}

@FindBy(id="Company")
WebElement compname;

public void entercompanyname(String value) {
    compname.sendKeys(value);
}

@FindBy(id="Password")
WebElement password;

public void enterpassword(String value) {
    password.sendKeys(value);
}

@FindBy(id="ConfirmPassword")
WebElement confirmpass;

public void enterconfirmpassword(String value) {
    confirmpass.sendKeys(value);
}

@FindBy(xpath="//button[text()='Register']")
WebElement register;

public void registorbuttton() {
    rm.clickElement(register);
}

@FindBy(xpath="//a[text()='Continue']")
WebElement con;

public void continuebutton() {
    rm.clickElement(con);
}

// Registration success message
@FindBy(className="result")
WebElement successMessage;

public String getSuccessMessage() {
    return successMessage.getText();
}

// Existing email validation message
@FindBy(xpath="//li[contains(text(),'The specified email already exists')]")
WebElement existingEmailError;

public String getExistingEmailError() {
    return existingEmailError.getText();
}

// First Name validation message
@FindBy(id="FirstName-error")
WebElement firstNameError;

public String getFirstNameError() {
    return firstNameError.getText();
}

// Last Name validation message
@FindBy(id="LastName-error")
WebElement lastNameError;

public String getLastNameError() {
    return lastNameError.getText();
}

// Email validation message
@FindBy(id="Email-error")
WebElement emailError;

public String getEmailError() {
    return emailError.getText();
}

// Password validation message


@FindBy(id="Password-error")
WebElement passwordError;

public String getPasswordError() {

    rm.waitForElement(passwordError);

    return passwordError.getText().trim();
}


// Confirm Password validation message
@FindBy(id="ConfirmPassword-error")
WebElement confirmPasswordError;

public String getConfirmPasswordError() {
    return confirmPasswordError.getText();
}


}
