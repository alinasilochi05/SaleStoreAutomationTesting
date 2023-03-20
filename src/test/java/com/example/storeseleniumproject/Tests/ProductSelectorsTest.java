package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.Components.ProductSelectors;
import org.testng.annotations.Test;

public class ProductSelectorsTest extends TestBase{
    ProductSelectors productSelectors;

    public ProductSelectorsTest(){
        super("https://demo.nopcommerce.com/shoes");
        this.productSelectors = new ProductSelectors(webDriver);
    }

    @Test
    public void orderProductsInListView(){
        this.productSelectors.clickListView();
    }
    @Test
    public void orderProductsInGridView(){
        this.productSelectors.clickGridView();
    }
    @Test
    public void orderByAZName(){
        this.productSelectors.setSortByInput("Name: A to Z");
    }
    @Test
    public void display3ItemsPerPage(){
        this.productSelectors.setDisplayInput("3");
    }
}
