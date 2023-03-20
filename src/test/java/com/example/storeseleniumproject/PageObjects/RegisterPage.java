package com.example.storeseleniumproject.PageObjects;

import com.example.storeseleniumproject.UtilsHandlers.DropdownInput;
import com.example.storeseleniumproject.UtilsHandlers.MethodsHandlers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver webDriver;
    MethodsHandlers methodsHandlers;

    By femaleCheckbox = By.id("gender-female");
    By firstNameInput = By.id("FirstName");
    By lastNameInput = By.id("LastName");
    By emailInput = By.id("Email");
    By passwordInput = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By dayDropdown = By.cssSelector("select[name='DateOfBirthDay']");
    By monthDropdown = By.cssSelector("[name='DateOfBirthMonth']");
    By yearDropdown = By.cssSelector("[name='DateOfBirthYear']");
    By expectedMessage = By.className("result");

    public RegisterPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.methodsHandlers = new MethodsHandlers(webDriver);
    }

    public void clickGenderCheckbox() {
        this.webDriver.findElement(femaleCheckbox).click();
    }

    public void setFirstNameInput(String firstname) {
        this.webDriver.findElement(firstNameInput).sendKeys(firstname);
    }

    public void setLastNameInput(String lastName) {
        this.webDriver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void setEmailInput(String email) {
        this.webDriver.findElement(emailInput).sendKeys(email);
    }

    public void setPasswordInput(String password) {
        this.webDriver.findElement(passwordInput).sendKeys(password);
    }

    public void setConfirmPassword(String confirmedPassword) {
        this.webDriver.findElement(confirmPassword).sendKeys(confirmedPassword);
    }

    public void setDayInput(String selectedText) {
        this.methodsHandlers.setDropdown(dayDropdown, selectedText);
    }

    public void clickRegisterButton() {
        this.webDriver.findElement(registerButton).click();
    }

    public void setDropDownInput(DropdownInput dropdownInput, String selectedText) {
        switch (dropdownInput) {
            case DAY -> this.methodsHandlers.setDropdown(dayDropdown, selectedText);
            case MONTH -> this.methodsHandlers.setDropdown(monthDropdown, selectedText);
            case YEAR -> this.methodsHandlers.setDropdown(yearDropdown, selectedText);
        }
    }

}
