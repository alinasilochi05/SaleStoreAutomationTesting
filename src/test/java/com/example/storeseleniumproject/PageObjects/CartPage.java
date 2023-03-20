package com.example.storeseleniumproject.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver webDriver;

    By quantityInput = By.id("itemquantity11222");
    By removeButton = By.cssSelector("button[class='remove-btn']");
    By updateButton = By.id("updatecart");
    By continueShoppingButton = By.cssSelector("button[name='continueshopping']");
    By estimateShippingButton = By.id("open-estimate-shipping-popup");
    By checkoutButton = By.id("checkout");
    By termsOfService = By.id("termsofservice");
    By removeItemMessage = By.cssSelector("div[class='no-data']");


    public CartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickUpdateButton() {
        webDriver.findElement(updateButton).click();
    }

    public void clickContinueShoppingButton() {
        webDriver.findElement(continueShoppingButton).click();
    }

    public void clickEstimateShippingButton() {
        webDriver.findElement(estimateShippingButton).click();
    }

    public void clickRemoveButton() {
        webDriver.findElement(removeButton).click();
    }

    public void setQuantityInput(String text) {
        webDriver.findElement(quantityInput).clear();
        webDriver.findElement(quantityInput).sendKeys(text);
    }

    public void clickCheckoutButton() {
        webDriver.findElement(checkoutButton).click();
    }

    public void clickOfTermsOfService() {
        webDriver.findElement(termsOfService).click();
    }

    public String getRemovedProductMessage(){
        return webDriver.findElement(removeItemMessage).getText();
    }
}
