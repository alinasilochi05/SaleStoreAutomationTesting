package com.example.storeseleniumproject.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver webDriver;

    By addToCart = By.xpath("//*[text()='Add to cart'][1]");
    By addToCompareList = By.xpath(" //*[text()='Add to compare list'][1]");
    By addToWishList = By.xpath("//*[text()='Add to wishlist'][1]");
    By expectedMessage = By.xpath("//*[@id=\"bar-notification\"]/div/p");


    public ProductPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void clickAddToCartButton(){
        webDriver.findElement(addToCart).click();
    }
    public void  clickAddToCompareButton(){
        webDriver.findElement(addToCompareList).click();
    }
    public void  clickAddToWishListButton(){
        webDriver.findElement(addToWishList).click();
    }
    public String getActualMessage(){
        return webDriver.findElement(expectedMessage).getText();
    }


}
