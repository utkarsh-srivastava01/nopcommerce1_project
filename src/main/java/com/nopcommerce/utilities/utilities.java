package com.nopcommerce.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilities {

    WebDriver driver;

    // Initialize WebDriver instance
    public utilities(WebDriver driver) {
        this.driver = driver;
    }

    // Wait for element visibility
    public void waitForElement(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Enter text into an element
    public void typeText(WebElement element, String value) {

        try {
            waitForElement(element);
            element.sendKeys(value);

        } catch (Exception e) {
            System.out.println("Failed to enter text");
            throw e;
        }
    }

    // Click on an element
    public void clickElement(WebElement element) {

        try {
            waitForElement(element);
            element.click();

        } catch (Exception e) {
            System.out.println("Failed to click element");
            throw e;
        }
    }

    // Switch to newly opened window
    public void switchWindow() {

        String parent = driver.getWindowHandle();

        Set<String> windows = driver.getWindowHandles();

        for (String w : windows) {

            if (!w.equals(parent)) {
                driver.switchTo().window(w);
            }
        }
    }

    // Capture page screenshot
    public void capturePageScreenshot(String screenshotName) {

        try {

            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            String destinationPath =
                    "src/test/resources/Screenshot/" + screenshotName + ".png";

            FileUtils.copyFile(src, new File(destinationPath));

        } catch (IOException e) {
            System.out.println("Failed to save screenshot");
        }
    }

    // Close login popup if displayed
    public void closeLoginPopup() {

        try {
            driver.findElement(By.xpath("//span[text()='✕']")).click();

        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }
    }
    public void back()
    {
try {
	
    driver.navigate().back();

    
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("page is not navigating back");
}
    }
    // Get current page title
    public String getTitle() {

        return driver.getTitle();
    }
}