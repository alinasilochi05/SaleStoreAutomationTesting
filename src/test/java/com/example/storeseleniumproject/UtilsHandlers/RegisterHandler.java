package com.example.storeseleniumproject.UtilsHandlers;

import com.example.storeseleniumproject.PageObjects.RegisterPage;
import org.openqa.selenium.WebDriver;

public class RegisterHandler {
    WebDriver webDriver;
    RegisterPage registerPage;

    public RegisterHandler(WebDriver webDriver){
        this.webDriver = webDriver;
        this.registerPage= new RegisterPage(webDriver);
    }

    public void createAccount(){
        this.registerPage.setFirstNameInput("test");
        this.registerPage.setLastNameInput("test");
        this.registerPage.setEmailInput("automationtest550@gmail.com");
        this.registerPage.setPasswordInput("pass123");
        this.registerPage.setConfirmPassword("pass123");
        this.registerPage.clickRegisterButton();

    }
}
