package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.PageObjects.RegisterPage;
import com.example.storeseleniumproject.UtilsHandlers.DropdownInput;
import com.example.storeseleniumproject.UtilsHandlers.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class RegisterTest extends TestBase {
    RegisterPage registerPage;


    public RegisterTest() {
        super("https://demo.nopcommerce.com/register?returnUrl=%2F");
        this.registerPage = new RegisterPage(webDriver);
    }

//    @BeforeSuite()
//    @Override()
//    public void setUpBeforeSuite() {
//        this.webDriver.get(Urls.registerUrl);
//    }

    @Test
    public void createAccount() {
        this.registerPage.clickGenderCheckbox();
        this.registerPage.setFirstNameInput("Test");
        this.registerPage.setLastNameInput("Test");
        this.registerPage.setDropDownInput(DropdownInput.DAY, "1");
        this.registerPage.setDropDownInput(DropdownInput.MONTH, "March");
        this.registerPage.setDropDownInput(DropdownInput.YEAR, "2000");
        this.registerPage.setEmailInput("test1234mira@gmail.com");
        this.registerPage.setPasswordInput("pass123");
        this.registerPage.setConfirmPassword("pass123");
        this.registerPage.clickRegisterButton();
        Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Register");
    }
}
