package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.UtilsHandlers.LoginHandler;
import com.example.storeseleniumproject.UtilsHandlers.Urls;
import com.example.storeseleniumproject.WebDriver.WebDriverStrategy;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    protected WebDriver webDriver;
    protected String siteUrl;

    protected TestBase(String siteUrl) {
        this.webDriver = WebDriverStrategy.valueOf("CHROME").getDriver();
        this.siteUrl = siteUrl;
    }


    @BeforeSuite
    public void setUpBeforeSuite() {
        this.webDriver.get(this.siteUrl);
    }

//@AfterSuite
//    public void setUpAfterSuite(){
//    webDriver.close();
//}
}
