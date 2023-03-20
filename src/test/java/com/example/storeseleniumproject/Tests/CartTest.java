package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.Components.HeaderUpper;
import com.example.storeseleniumproject.PageObjects.CartPage;
import com.example.storeseleniumproject.PageObjects.ProductPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class CartTest extends TestBase {
    CartPage cartPage;
    ProductPage productPage;
    HeaderUpper headerUpper;

    public CartTest() {
        super("https://demo.nopcommerce.com/cart");
        this.cartPage = new CartPage(webDriver);
        this.productPage = new ProductPage(webDriver);
        this.headerUpper = new HeaderUpper(webDriver);
    }

    @BeforeMethod
    public void addProductToCart() throws InterruptedException {
        webDriver.get("https://demo.nopcommerce.com/cell-phones");
        this.productPage.clickAddToCartButton();
        sleep(2000);
        this.headerUpper.clickShoppingCartButton();
        sleep(2000);
    }

    @Test
    public void continueToShopping() {
        this.cartPage.clickContinueShoppingButton();
        assertEquals(webDriver.getTitle(), "nopCommerce demo store. Cell phones");
    }

    @Test
    public void goToCheckout() {
        this.cartPage.clickOfTermsOfService();
        this.cartPage.clickCheckoutButton();
    }

    @Test
    public void removeItem(){
        this.cartPage.clickRemoveButton();
        assertEquals(this.cartPage.getRemovedProductMessage(), "Your Shopping Cart is empty!");
//        Assert.assertTrue(this.cartPage.getRemovedProductMessage(), "Your Shopping Cart is empty!");
    }


}
