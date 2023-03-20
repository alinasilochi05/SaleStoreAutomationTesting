package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.Components.MyAccountSideBar;
import com.example.storeseleniumproject.UtilsHandlers.LoginHandler;
import com.example.storeseleniumproject.UtilsHandlers.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyAccountSideBarTest extends TestBase{
    MyAccountSideBar myAccountSideBar;
    LoginHandler loginHandler;
    public MyAccountSideBarTest(){
        super("https://demo.nopcommerce.com/login?returnUrl=%2F");
        this.myAccountSideBar = new MyAccountSideBar(webDriver);
        this.loginHandler = new LoginHandler(webDriver);
    }

    @BeforeMethod
    public void setup(){
        this.loginHandler.logIn();
        webDriver.get("https://demo.nopcommerce.com/customer/info");
    }


    @Test
    public void openOrdersSection(){
        this.myAccountSideBar.clickMyAccountCategory("Orders");
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Account");
    }
}
