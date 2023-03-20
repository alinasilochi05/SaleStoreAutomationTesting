package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.Components.MyAccountSideBar;
import com.example.storeseleniumproject.UtilsHandlers.LoginHandler;
import com.example.storeseleniumproject.UtilsHandlers.RegisterHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyAccountSideBarTest extends TestBase {
    MyAccountSideBar myAccountSideBar;
    LoginHandler loginHandler;
    RegisterHandler registerHandler;

    public MyAccountSideBarTest() {
        super("https://demo.nopcommerce.com/register?returnUrl=%2Fcustomer%2Finfo");
        this.myAccountSideBar = new MyAccountSideBar(webDriver);
        this.loginHandler = new LoginHandler(webDriver);
        this.registerHandler = new RegisterHandler(webDriver);
    }

    @BeforeMethod
    public void setup() {
        this.registerHandler.createAccount();
        webDriver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fcustomer%2Finfo");
        this.loginHandler.logIn();

    }


    @Test
    public void openOrdersSection() {
        this.myAccountSideBar.clickMyAccountCategory("Orders");
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Account");
    }
}
