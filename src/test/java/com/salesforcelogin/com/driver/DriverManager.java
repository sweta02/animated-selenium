package com.salesforcelogin.com.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

    public static WebDriver driver ;
    private String browser = "";
    public void openBrowser(){
        switch (browser){
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
    }
    public void navigateTo(String url){ driver.get(url);}
    public void maxibrowser() {
        driver.manage().window().maximize();
    }
    public void applyImplicitWaits(){

    }
    public void closeBrowser(){
        driver.quit();
    }
}
