package com.example.storeseleniumproject.Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderLower {

    WebDriver webDriver;

    By logo = By.cssSelector("a[href='/']");
    By searchBox = By.id("small-searchterms");
    By searchButton = By.cssSelector("button[class='button-1 search-box-button']");
    public HeaderLower(WebDriver webDriver){
     this.webDriver = webDriver;
    }

    public void clickLogo(){
        this.webDriver.findElement(logo).click();
    }
    public void setSearchInput(String text){
        this.webDriver.findElement(searchBox).sendKeys(text);
    }
    public void clickSearchButton(){
        this.webDriver.findElement(searchButton).click();
    }
}
