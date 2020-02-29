package com.salesforcelogin.com;

import com.salesforcelogin.com.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
private DriverManager manager = new DriverManager();

@Before
    public void setUp(){
    manager.openBrowser();
    manager.maxbrowser();
    manager.navigateTo("https://www.argos.co.uk/");
    manager.applyImplicitWaits();

}
@After
    public void tearDown(){
    manager.closeBrowser();

}

}
