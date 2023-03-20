package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.Components.TopMenu;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenu topMenu;

    public TopMenuTest() {
        super("https://demo.nopcommerce.com/register?returnUrl=%2F");
        this.topMenu = new TopMenu(webDriver);
    }

    @Test
    public void hover() {
        this.topMenu.hoverOverTopMenu("Apparel");
    }

    @Test
    public void openShoesSubcategory() throws InterruptedException {
        this.topMenu.hoverOverTopMenu("Apparel");
        this.topMenu.clickSubcategory("Shoes");
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Shoes");
    }
}


