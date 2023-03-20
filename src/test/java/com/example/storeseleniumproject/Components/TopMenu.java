package com.example.storeseleniumproject.Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class TopMenu {
    WebDriver webDriver;

    public TopMenu(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void hoverOverTopMenu(String text){
        List<WebElement> categories = webDriver.findElements(By.cssSelector("ul[class='top-menu notmobile'] > li > a"));
        for ( WebElement category : categories) {
            if (category.getText().contains(text)){
                Actions action = new Actions(webDriver);
                action.moveToElement(category).perform();
                return;
            }
        }

    }
    public void clickSubcategory(String subcategoryText) {
        List<WebElement> subcategories = webDriver.findElements(By.cssSelector("ul[class= 'sublist first-level'] > li > a"));
        for (WebElement subcategory : subcategories) {
            if (subcategory.getText().contains(subcategoryText)) {
                subcategory.click();
                return;
            }
        }
    }
}
