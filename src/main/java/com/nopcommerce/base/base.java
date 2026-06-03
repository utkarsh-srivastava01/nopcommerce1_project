package com.nopcommerce.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

    public WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        
      
            // Setup ChromeDriver
            WebDriverManager.chromedriver().setup();
            
            // Create ChromeOptions
            ChromeOptions options = new ChromeOptions();
           
         
           
          
            options.addArguments("--disable-blink-features=AutomationControlled");
            driver = new ChromeDriver(options);
            
        
            driver.manage().window().maximize();
            // Initialize driver
           
            
       
      
            driver.get("https://demo.nopcommerce.com/");
            
            Thread.sleep(15000);
            
        
        
   
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}