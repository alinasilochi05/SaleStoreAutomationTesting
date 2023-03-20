package com.example.storeseleniumproject.Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountSideBar {
    WebDriver webDriver;

    public MyAccountSideBar(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickMyAccountCategory(String text) {
        List<WebElement> categories = webDriver.findElements(By.cssSelector(".block.block-account-navigation > div > ul > li > a"));
        for (WebElement category : categories) {
            if (category.getText().contains(text)) {
                category.click();
                return;
            }
        }
    }
}

