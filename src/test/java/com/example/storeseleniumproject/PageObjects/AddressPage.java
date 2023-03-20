package com.example.storeseleniumproject.PageObjects;

import com.example.storeseleniumproject.UtilsHandlers.MethodsHandlers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
    WebDriver webDriver;
    MethodsHandlers methodsHandlers;

    By addNewButton = By.cssSelector("div[class='add-button']");
    By firstNameInput = By.id("Address_FirstName");
    By lastNameInput = By.id("Address_LastName");
    By emailInput = By.id("Address_Email");
    By cityInput = By.id("Address_City");
    By zipInput = By.id("Address_ZipPostalCode");
    By phoneInput = By.id("Address_PhoneNumber");
    By countryInput = By.id("Address_CountryId");
    By addressInput = By.id("Address_Address1");
    By saveButton = By.cssSelector("[class='button-1 save-address-button']");


    public AddressPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.methodsHandlers = new MethodsHandlers(webDriver);
    }

    public void clickAddNewButton() {
        this.webDriver.findElement(addNewButton).click();
    }

    public void setFirstNameInput(String firstname) {
        webDriver.findElement(firstNameInput).sendKeys(firstname);
    }

    public void setLastNameInput(String lastname) {
        webDriver.findElement(lastNameInput).sendKeys(lastname);
    }

    public void setEmailInput(String email) {
        webDriver.findElement(emailInput).sendKeys(email);
    }

    public void setCountryInput(String text) {
        this.methodsHandlers.setDropdown(cityInput, text);
    }

    public void setCityInput(String city) {
        webDriver.findElement(cityInput).sendKeys(city);
    }

    public void setAddressInput(String address) {
        webDriver.findElement(addressInput).sendKeys(address);
    }

    public void setZipInput(String zip) {
        webDriver.findElement(zipInput).sendKeys(zip);
    }

    public void setPhoneInput(String phone) {
        webDriver.findElement(zipInput).sendKeys(phone);
    }

    public void clickSaveButton() {
        webDriver.findElement(saveButton).click();
    }

}
