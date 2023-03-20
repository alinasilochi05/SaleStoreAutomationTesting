package com.example.storeseleniumproject.UtilsHandlers;

import com.example.storeseleniumproject.PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginHandler {
    LoginPage loginPage;

    public LoginHandler(WebDriver webDriver){
        this.loginPage = new LoginPage(webDriver);
    }

    public void logIn(){
        this.loginPage.setEmailInput("automationtest550@gmail.com");
        this.loginPage.setPasswordInput("pass123");
        this.loginPage.clickLoginButton();
    }
}
