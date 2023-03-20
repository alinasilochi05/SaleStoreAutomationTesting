package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.PageObjects.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends TestBase{
    ProductPage productPage;
    public ProductTest(){
        super("https://demo.nopcommerce.com/cell-phones");
        this.productPage = new ProductPage(webDriver);
    }

    @Test
    public void addToCartProduct() throws InterruptedException {
        this.productPage.clickAddToCartButton();

    }
    @Test
    public void addProductToProductComparison(){
        this.productPage.clickAddToCompareButton();
    }

    @Test
    public void addProductToWishList(){
       this.productPage.clickAddToWishListButton();
    }


}
