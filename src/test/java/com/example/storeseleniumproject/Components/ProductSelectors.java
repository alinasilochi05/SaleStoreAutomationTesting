package com.example.storeseleniumproject.Components;

import com.example.storeseleniumproject.UtilsHandlers.MethodsHandlers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSelectors {
    WebDriver webDriver;
    MethodsHandlers methodsHandlers;
    By sortByDropdown = By.id("products-orderby");
    By displayDropdown = By.id("products-pagesize");
    By gridView = By.cssSelector("a[title='Grid']");
    By listView = By.cssSelector(("a[title='List']"));
    public ProductSelectors(WebDriver webDriver){
        this.webDriver = webDriver;
        this.methodsHandlers = new MethodsHandlers(webDriver);

    }

    public void setSortByInput(String selectedText){
        this.methodsHandlers.setDropdown(sortByDropdown, selectedText);
    }
    public void setDisplayInput(String selectedText){
        this.methodsHandlers.setDropdown(displayDropdown, selectedText);
    }
    public void clickGridView(){
        webDriver.findElement(gridView).click();
    }
    public void clickListView(){
        webDriver.findElement(listView).click();
    }
}
