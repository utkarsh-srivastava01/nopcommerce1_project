package com.nopcommerce.stepdefinition;

import io.cucumber.java.Before;

import com.nopcommerce.base.base;

import io.cucumber.java.After;

public class Hooks extends base {

    @Before
    public void beforeScenario() throws Exception {

        setup();
    }

    @After
    public void afterScenario() {

        tearDown();
    }
}