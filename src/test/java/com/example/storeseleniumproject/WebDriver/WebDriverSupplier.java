package com.example.storeseleniumproject.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverSupplier {
    private WebDriverSupplier() {
    }

    public static WebDriver chromeDriverSupplier() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.silentOutput", "true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(options);
    }

    public static WebDriver ieDriverSupplier() {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }

    public static WebDriver firefoxDriverSupplier() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

}


