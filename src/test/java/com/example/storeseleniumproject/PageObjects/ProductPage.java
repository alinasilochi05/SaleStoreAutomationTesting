package com.example.storeseleniumproject.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    WebDriver webDriver;

    By addToCart = By.xpath("//*[text()='Add to cart'][1]");
    By addToCompareList = By.xpath(" //*[text()='Add to compare list'][1]");
    By addToWishList = By.xpath("//*[text()='Add to wishlist'][1]");
    By expectedMessage = By.cssSelector("div > p > a");


    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickAddToCartButton() {
        webDriver.findElement(addToCart).click();
    }

    public void clickAddToCompareButton() {
        webDriver.findElement(addToCompareList).click();
    }

    public void clickAddToWishListButton() {
        webDriver.findElement(addToWishList).click();
    }

    public String getActualMessage() {
        return webDriver.findElement(expectedMessage).getText();
    }

    public WebElement getAddToCartButton(String productName) {
        String selector = String.format(
                "//*[contains(text(), \"%s\")]//ancestor::div[@class=\"details\"]//button[contains(text(), \"Add to cart\")]",
                productName);
        return webDriver.findElement(By.xpath(selector));
    }

}
