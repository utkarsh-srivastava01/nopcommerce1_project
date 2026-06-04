package com.nopcommerce.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.utilities.utilities;

public class Search {

WebDriver driver;
utilities rm;

public Search(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);
    rm = new utilities(driver);
}

// Search textbox
@FindBy(id="small-searchterms")
WebElement searchBox;

public void enterSearchKeyword(String value) {

    rm.waitForElement(searchBox);

    searchBox.clear();
    searchBox.sendKeys(value);
}

// Search button
@FindBy(xpath="//button[text()='Search']")
WebElement searchButton;

public void clickSearchButton() {

    rm.clickElement(searchButton);
}

// Product title
@FindBy(xpath="//h2[@class='product-title']/a")
WebElement productTitle;

public String getProductTitle() {
    return productTitle.getText();
}

// No result message
@FindBy(xpath="//div[@class='no-result']")
WebElement noResultMessage;

public String getNoResultMessage() {
    return noResultMessage.getText();
}

// Product details page title
@FindBy(xpath="//div[@class='product-name']/h1")
WebElement productDetailsTitle;

public String getProductDetailsTitle() {
    return productDetailsTitle.getText();
}

// Open product details page
public void clickProduct() {
    rm.clickElement(productTitle);
}

}


