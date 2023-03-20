package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.Components.HeaderUpper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderUpperTest extends TestBase {
    HeaderUpper headerUpper;

    public HeaderUpperTest() {
        super("https://demo.nopcommerce.com/");
        this.headerUpper = new HeaderUpper(webDriver);
    }

    @Test
    public void openRegisterPage() {
        this.headerUpper.clickRegisterButton();
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Register");
    }

    @Test
    public void openLoginPage() {
        this.headerUpper.clickLoginButton();
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Login");
    }

    @Test
    public void openWishListPage() {
        this.headerUpper.clickWishListButton();
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Wishlist");
    }

    @Test
    public void openShoppingCart() {
        this.headerUpper.clickShoppingCartButton();
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Shopping Cart");
    }
}
