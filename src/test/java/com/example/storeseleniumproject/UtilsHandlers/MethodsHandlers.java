package com.example.storeseleniumproject.UtilsHandlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodsHandlers {
      WebDriver webDriver;
      public MethodsHandlers(WebDriver webDriver){
          this.webDriver = webDriver;
      }
    public void setDropdown(By element, String text){
        Select select = new Select(webDriver.findElement(element));
        select.selectByVisibleText(text);
    }

//    public void clearInput(){
//
//    }
}
