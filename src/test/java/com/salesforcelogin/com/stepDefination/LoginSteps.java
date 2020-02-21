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
    public void user_is_already_on_login_page() throws Throwable {
        String actual = homePage.getCurrentUrl();
        throw new PendingException();
    }
    @When("^title is title$")
    public void title_is_title() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Then("^title is fighter$")
    public void title_is_fighter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
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
