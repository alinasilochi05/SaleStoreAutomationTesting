package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.PageObjects.LoginPage;
import com.example.storeseleniumproject.UtilsHandlers.LoginHandler;
import com.example.storeseleniumproject.UtilsHandlers.ReadCredentials;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginTest extends  TestBase{
    LoginPage loginPage;
    LoginHandler loginHandler;

    public LoginTest() throws IOException {
        super("https://demo.nopcommerce.com/login?returnUrl=%2F");
        this.loginPage = new LoginPage(webDriver);
        this.loginHandler = new LoginHandler(webDriver);

    }

    @Test
    public void login(){
        this.loginHandler.logIn();
    }
    @Test
    public void loginValidCredentials() throws IOException {
        ReadCredentials.getCredentials().forEach(credentials -> {
            this.loginPage.setEmailInput(credentials.get("username").toString());
            this.loginPage.setPasswordInput(credentials.get("password").toString());
            this.loginPage.clickLoginButton();
        });
    }




}
