
package com.nopcommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Registration;

public class registrationtestcase extends base {


// Verify user registration with valid details
@Test(priority = 1)
public void verifyValidRegistration() {

    Registration re = new Registration(driver);

    re.clickregistration();
    re.genderselection();
    re.firstname("Utkarsh");
    re.lastname("Srivastava");

    String email =
            "utkarsh" + System.currentTimeMillis() + "@gmail.com";

    re.enteremail(email);
    re.entercompanyname("Wipro");
    re.enterpassword("#uttu123");
    re.enterconfirmpassword("#uttu123");
    re.registorbuttton();

    Assert.assertEquals(
            re.getSuccessMessage(),
            "Your registration completed");
}

// Verify registration with existing email
@Test(priority = 2)
public void verifyRegistrationWithExistingEmail() {

    Registration re = new Registration(driver);

    re.clickregistration();
    re.genderselection();
    re.firstname("Utkarsh");
    re.lastname("Srivastava");
    re.enteremail("utkarshsri3690@gmail.com");
    re.entercompanyname("Wipro");
    re.enterpassword("#uttu123");
    re.enterconfirmpassword("#uttu123");
    re.registorbuttton();

    Assert.assertTrue(
            re.getExistingEmailError()
                    .contains("already exists"));
}

// Verify mandatory field validation
@Test(priority = 3)
public void verifyMandatoryFieldValidation() throws InterruptedException {

    Registration re = new Registration(driver);

    re.clickregistration();
    re.registorbuttton();
Thread.sleep(3000);
    Assert.assertEquals(
            re.getFirstNameError(),
            "First name is required.");
    Thread.sleep(3000);
    Assert.assertEquals(
            re.getLastNameError(),
            "Last name is required.");
    Thread.sleep(3000);
    Assert.assertEquals(
            re.getEmailError(),
            "Email is required.");

    Thread.sleep(3000);
    Assert.assertEquals(
            re.getConfirmPasswordError(),
            "Password is required.");
    Thread.sleep(3000);
    Assert.assertEquals(re.getConfirmPasswordError(),"Password is required.");
}

// Verify successful registration message
@Test(priority = 4)
public void verifySuccessfulRegistrationMessage() {

    Registration re = new Registration(driver);

    re.clickregistration();
    re.genderselection();
    re.firstname("Test");
    re.lastname("User");

    String email =
            "test" + System.currentTimeMillis() + "@gmail.com";

    re.enteremail(email);
    re.entercompanyname("Wipro");
    re.enterpassword("#uttu123");
    re.enterconfirmpassword("#uttu123");
    re.registorbuttton();

    String actualMessage =
            re.getSuccessMessage();

    Assert.assertEquals(
            actualMessage,
            "Your registration completed");
}


}
