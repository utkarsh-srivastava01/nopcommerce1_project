package com.nopcommerce.stepdefinition;

import org.testng.Assert;

import com.nopcommerce.base.base;
import com.nopcommerce.pages.Registration;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStep extends base {


Registration re;

@When("User clicks register link")
public void user_clicks_register_link() {

    try {

        re = new Registration(driver);

        re.clickregistration();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }
}

@When("User enters first name")
public void user_enters_first_name() {

    try {
    	  re.genderselection();
          Thread.sleep(3000);
        re.firstname("Utkarsh");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }
}

@When("User enters last name")
public void user_enters_last_name() {

    try {

        re.lastname("Srivastava");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }
}

@When("User enters unique email")
public void user_enters_unique_email() {

    try {

        String email =
                "utkarsh" + System.currentTimeMillis() + "@gmail.com";

        re.enteremail(email);
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }
}

@When("User enters company name")
public void user_enters_company_name() {

    try {

        re.entercompanyname("Wipro");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }
}

@When("User enters password")
public void user_enters_password() {

    try {

        re.enterpassword("#uttu123");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }
}

@When("User enters confirm password")
public void user_enters_confirm_password() {

    try {

        re.enterconfirmpassword("#uttu123");
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }
}

@When("User clicks register button")
public void user_clicks_register_button() {

    try {

        re.registorbuttton();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }
}

@Then("Registration success message should display")
public void registration_success_message_should_display() {

    Assert.assertEquals(
            re.getSuccessMessage(),
            "Your registration completed");
}

@When("User enters existing email details")
public void user_enters_existing_email_details() {

    try {

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

    } catch (Exception e) {

        e.printStackTrace();
    }
}

@Then("Existing email error message should display")
public void existing_email_error_message_should_display() {

    System.out.println("Email already exists");
}

@When("User clicks register button without entering details")
public void user_clicks_register_button_without_entering_details() {

    try {

        re.registorbuttton();
        Thread.sleep(2000);

    } catch (Exception e) {

        e.printStackTrace();
    }
}

@Then("Mandatory field validation message should display")
public void mandatory_field_validation_message_should_display() {

    Assert.assertEquals(
            re.getFirstNameError(),
            "First name is required.");
}

@When("User completes registration successfully")
public void user_completes_registration_successfully() {

    try {

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

    } catch (Exception e) {

        e.printStackTrace();
    }
}


}
