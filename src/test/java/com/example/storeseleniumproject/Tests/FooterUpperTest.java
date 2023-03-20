package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.Components.FooterUpper;
import com.example.storeseleniumproject.UtilsHandlers.LoginHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterUpperTest extends TestBase{
    FooterUpper footerUpper;
    LoginHandler loginHandler;

    public FooterUpperTest(){
        super("https://demo.nopcommerce.com/");
        this.footerUpper = new FooterUpper(webDriver);
        this.loginHandler = new LoginHandler(webDriver);

    }

    @Test
    public void openAboutUpPage(){
        this.footerUpper.clickInformationCategory("About us");
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. About us");
    }

    @Test
    public void openBlogPage(){
        this.footerUpper.clickCustomerServiceCategory("Blog");
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Blog");
    }

    @Test
    public void openMyAccountPage(){
        this.footerUpper.clickMyAccountCategory("My account");
        this.loginHandler.logIn();
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. My Account");

    }
    @Test
    public void openYoutubePage(){
        this.footerUpper.clickFollowUsCategory("Youtube");
    }
}
