package com.salesforcelogin.com.pages;

import com.salesforcelogin.com.driver.DriverManager;
import org.openqa.selenium.By;

public class LoginPage extends DriverManager {

    public void logIn() {
        driver.findElement(By.id("username")).sendKeys("swetapatel");
        driver.findElement(By.id("password")).sendKeys("ahghdghfg");
        driver.findElement(By.id("Login")).click();
    }

    public String getLoginDetails() {
        return driver.findElement(By.id("error")).getText();

    }

}