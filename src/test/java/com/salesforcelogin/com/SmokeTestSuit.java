package com.salesforcelogin.com;

import com.salesforcelogin.com.pages.HomePage;
import com.salesforcelogin.com.pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import sun.plugin.dom.html.HTMLDocument;

import java.sql.Driver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SmokeTestSuit extends Hooks{

    private HomePage homePage = new HomePage();

    @Test
    public void loginTest(){
        String title = homePage.getTitle();
        assertThat(title, is(equalToIgnoringCase("Login | Salesforce")));
    }

    @Test
    public void getCurrentUrlTest(){
        String url = homePage.getCurrentUrl();
        assertThat(url,is(equalToIgnoringCase("https://login.salesforce.com/")));
    }
}
