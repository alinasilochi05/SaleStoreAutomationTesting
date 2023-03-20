package com.example.storeseleniumproject.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver webDriver;
    By emailInput = By.id("Email");
    By passwordInput = By.id("Password");
    By loginButton = By.className("login-button");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setEmailInput(String email) {
        webDriver.findElement(emailInput).sendKeys(email);
    }

    public void setPasswordInput(String password) {
        webDriver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        webDriver.findElement(loginButton).click();
    }
}
