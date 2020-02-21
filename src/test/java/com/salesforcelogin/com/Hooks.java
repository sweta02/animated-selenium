package com.salesforcelogin.com;

import com.salesforcelogin.com.driver.DriverManager;
import org.junit.After;
import org.junit.Before;

public class Hooks{
DriverManager manager = new DriverManager();

@Before
    public void setUp(){
    manager.openBrowser();
    manager.navigateTo("https://login.salesforce.com/");
    manager.maxibrowser();

}
@After
    public void tearDown(){
    manager.closeBrowser();

}

}
