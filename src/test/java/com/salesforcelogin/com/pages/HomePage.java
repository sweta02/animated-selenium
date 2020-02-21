package com.salesforcelogin.com.pages;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.salesforcelogin.com.driver.DriverManager;
import org.openqa.selenium.By;

public class HomePage extends DriverManager {

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
     public void clickLogin(){
        driver.findElement(By.cssSelector(".dropdown")).click();
    }
    public String getTitle(){
        return driver.getTitle();

    }
}

//Enterbjabdfbjassdhfghsdbdsjsbdfjbsd