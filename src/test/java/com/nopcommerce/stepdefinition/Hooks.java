package com.nopcommerce.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.nopcommerce.base.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends base {

    @Before
    public void beforeScenario() throws Exception {

        setup();
    }

    @After
    public void afterScenario(Scenario scenario)
            throws IOException {

        if (!scenario.isFailed()) {

            File src =
                    ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            File dest = new File(
                    "src/test/resources/Screenshot/PASSED_"
                    + scenario.getName().replace(" ", "_")
                    + ".png");

            FileUtils.copyFile(src, dest);

            System.out.println(
                    "Screenshot Saved : "
                    + scenario.getName());
        }

        tearDown();
    }
}