package com.salesforcelogin.com.pages;

import com.salesforcelogin.com.driver.DriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ResultPage extends DriverManager {

    @FindBy(css = ".findability-facet__rating-label")
    private List<WebElement> ratingWebElement;

    @FindBy(css = "div[data-test=\"component-ratings\"]")
    private List<WebElement> ratingStars;

    @FindBy(css = "label[name=\"price\"]")
    private List<WebElement> priceSelect;

    @FindBy(css = "label[name=\"brands\"]")
    private List<WebElement> brandWebElement;

    public void selectFilter(String filterOption) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(".findability-facet__rating-label"), 4));
        for (WebElement review : ratingWebElement) {
            String availableFilter = review.getText();
            if (availableFilter.equalsIgnoreCase(filterOption)) {
                review.click();
                break;
            }
        }
    }

    public List<Double> getProductRating() {
        sleep(3000);
        List<Double> ratingList = new ArrayList<>();
        for (WebElement rating : ratingStars) {
            String ratingInString = rating.getAttribute("data-star-rating");
            double ratingInDouble = Double.parseDouble(ratingInString);
            ratingList.add(ratingInDouble);
        }
        return ratingList;
    }

    public void selectPrice(Integer priceOption) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("label[name=\"price\"]"), 3));
        for (WebElement price : priceSelect) {
            // int priceFilter = Integer.parseInt(price.getCssValue("4"));
           // if (priceFilter("<£20 && >£25")) ;
           // price.click();
            //break;
        }
    }
    //public boolean priceFilter(String s) {
      //  priceFilter("true");
      //  return true;
    //}
    public void selectBrand(String Tefal){
        new WebDriverWait(driver,20)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("label[name=\"brands\"]"),3));
        for(WebElement brand :brandWebElement){
            String availableBrand = brand.getText();
            if(availableBrand.matches(Tefal)){
                //brand.findElements(By.cssSelector("label[id=\"filter-brands-tefal-label\"]"));
                brand.click();
                break;
            }

        }
}

}


