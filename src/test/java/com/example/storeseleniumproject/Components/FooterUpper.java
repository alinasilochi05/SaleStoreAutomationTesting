package com.example.storeseleniumproject.Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterUpper {
    WebDriver webDriver;

    public FooterUpper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickInformationCategory(String text) {
        List<WebElement> categories = webDriver.findElements(By.cssSelector(".footer-block.information > ul > li > a"));
        for (WebElement category : categories) {
            if (category.getText().contains(text)) {
                category.click();
                return;
            }
        }
    }

    public void clickCustomerServiceCategory(String text) {
        List<WebElement> categories = webDriver.findElements(By.cssSelector(".footer-block.customer-service > ul > li > a"));
        for (WebElement category : categories) {
            if (category.getText().contains(text)) {
                category.click();
                return;
            }
        }
    }

    public void clickMyAccountCategory(String text) {
        List<WebElement> categories = webDriver.findElements(By.cssSelector(".footer-block.my-account > ul > li > a"));
        for (WebElement category : categories) {
            if (category.getText().contains(text)) {
                category.click();
                return;
            }
        }
    }

    public void clickFollowUsCategory(String text) {
        List<WebElement> categories = webDriver.findElements(By.cssSelector(".follow-us.footer-block > ul > li > a"));
        for (WebElement category : categories) {
            if (category.getText().contains(text)) {
                category.click();
                return;
            }
        }
    }
}
