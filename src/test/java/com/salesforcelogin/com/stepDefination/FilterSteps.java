package com.salesforcelogin.com.stepDefination;

import com.salesforcelogin.com.pages.ResultPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FilterSteps {

    private ResultPage resultPage = new ResultPage();

    //@When("^I apply filter review \"([^\"]*)\"$")
    //public void i_apply_filter_review(String filter) {
    //resultPage.selectFilter(filter);
    //}

    //@Then("^I should be able to see refined results review \"([^\"]*)\"$")
    //public void i_should_be_able_to_see_refined_results_review(double expected) {
    //    List<Double> actual =  resultPage.getProductRating();
    //    assertThat(actual, everyItem(is(greaterThanOrEqualTo(expected))));

    //}
    //@When("^I apply filter price \"([^\"]*)\"$")
    //public void i_apply_filter_colour(String prices) {
    //resultPage.selectPrice(prices);
    //}

    //@Then("^i should be able to see result colour \"([^\"]*)\"$")
    //public void i_should_be_able_to_see_result_colour(String arg1) {
    //}

    @When("^I apply filter by brand \"([^\"]*)\"$")
    public void i_apply_filter_by_brand(String Tefal) {
    resultPage.selectBrand(Tefal);
    }

}
