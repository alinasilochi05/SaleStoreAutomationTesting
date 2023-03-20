package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.PageObjects.AddressPage;
import com.example.storeseleniumproject.UtilsHandlers.LoginHandler;
import org.testng.annotations.BeforeMethod;

public class AddressTest extends TestBase{
     AddressPage addressPage;
      LoginHandler loginHandler;

    public AddressTest(){
        super("https://demo.nopcommerce.com/login?returnUrl=%2Fcustomer%2Faddresses");
        this.addressPage = new AddressPage(webDriver);
    }

    @BeforeMethod
    public void setup(){
        this.loginHandler.logIn();
        webDriver.get("https://demo.nopcommerce.com/customer/addresses");
        this.addressPage.clickAddNewButton();
    }
}
