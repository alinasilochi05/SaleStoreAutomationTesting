package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.PageObjects.ProductPage;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends TestBase {
    ProductPage productPage;

    public ProductTest() {
        super("https://demo.nopcommerce.com/cell-phones");
        this.productPage = new ProductPage(webDriver);
    }

    @Test
    public void addToCartProduct() {
        this.productPage.clickAddToCartButton();

        Assert.assertEquals(this.productPage.getActualMessage(), "shopping cart");

    }

    @Test
    public void addProductToProductComparison() {
        this.productPage.clickAddToCompareButton();
        Assert.assertEquals(this.productPage.getActualMessage(), "product comparison");
    }

    @Test
    public void addProductToWishList() {
        this.productPage.clickAddToWishListButton();
        Assert.assertEquals(this.productPage.getActualMessage(), "wishlist");
    }


}
