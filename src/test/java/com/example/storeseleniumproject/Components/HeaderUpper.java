package com.example.storeseleniumproject.Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderUpper {
    WebDriver webDriver;

    By registerOption = By.cssSelector("a[class='ico-register']");
    By loginOption = By.cssSelector("a[class='ico-login']");
    By wishListOption = By.cssSelector("a[class='ico-wishlist']");
    By shoppingCart = By.cssSelector("a[class='ico-cart']");
    By customerCurrency = By.id("customerCurrency");

    public HeaderUpper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickRegisterButton() {
        this.webDriver.findElement(registerOption).click();
    }

    public void clickLoginButton() {
        this.webDriver.findElement(loginOption).click();
    }

    public void clickWishListButton() {
        this.webDriver.findElement(wishListOption).click();
    }

    public void clickShoppingCartButton() {
        this.webDriver.findElement(shoppingCart).click();
    }

}
