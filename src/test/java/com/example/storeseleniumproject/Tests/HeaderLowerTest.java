package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.Components.HeaderLower;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderLowerTest extends TestBase {
    HeaderLower headerLower;

    public HeaderLowerTest() {

        super("https://demo.nopcommerce.com/");
        this.headerLower = new HeaderLower(webDriver);
    }

    @Test
    public void goToHomePage() {
        this.headerLower.clickLogo();
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store");
    }

    @Test
    public void searchItemFromSearchBox() {
        this.headerLower.setSearchInput("Nikon");
        this.headerLower.clickSearchButton();
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Search");
    }


}
