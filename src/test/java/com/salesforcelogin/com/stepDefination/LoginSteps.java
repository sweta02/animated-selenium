package com.salesforcelogin.com.stepDefination;

import com.salesforcelogin.com.driver.DriverManager;
import com.salesforcelogin.com.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class LoginSteps {

    private HomePage homePage = new HomePage();

    @Given("^User is already on login page$")
    public void user_is_already_on_login_page()  {
        String actual = homePage.getCurrentUrl();

    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() {

    }

    @Then("^user is on homepage$")
    public void user_is_on_homepage() {

    }
    
    //@When("^title of login is Salesforce$")
    //public void title_of_login_is_Salesforce() throws Throwable {
       // String title = driver.getTitle();
        //System.out.println(title);
        //assertThat(title, is(equalToIgnoringCase("Login | Salesforce")));
   // }

    //@Then("^user enters username and password$")
    //public void user_enters_username_and_password() throws Throwable {
      //  driver.findElement(By.id("username")).sendKeys("swetapatel");
        //driver.findElement(By.id("password")).sendKeys("ahghdghfg");
   // }

    //@Then("^user should be logged in successfully$")
    //public void user_should_be_logged_in_successfully() throws Throwable{

//}
}
