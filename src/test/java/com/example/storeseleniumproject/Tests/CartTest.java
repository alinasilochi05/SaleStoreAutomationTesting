package com.example.storeseleniumproject.Tests;

import com.example.storeseleniumproject.Components.HeaderUpper;
import com.example.storeseleniumproject.PageObjects.CartPage;
import com.example.storeseleniumproject.PageObjects.ProductPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest  extends TestBase{
CartPage cartPage;
ProductPage productPage;
HeaderUpper headerUpper;

public CartTest(){
    super("https://demo.nopcommerce.com/cart");
    this.cartPage = new CartPage(webDriver);
    this.productPage = new ProductPage(webDriver);
    this.headerUpper = new HeaderUpper(webDriver);
}

@BeforeMethod
public void addProductToCart() throws InterruptedException {
    webDriver.get("https://demo.nopcommerce.com/cell-phones");
    this.productPage.clickAddToCartButton();
    Thread.sleep(5000);
    this.headerUpper.clickShoppingCartButton();
    Thread.sleep(2000);


}

//@Test
//public void updateQuantity() {
//     this.cartPage.setQuantityInput();
//     this.cartPage.clickUpdateButton();}
//
@Test
public void continueToShopping(){
    this.cartPage.clickContinueShoppingButton();
    Assert.assertEquals(webDriver.getTitle(), "nopCommerce demo store. Cell phones");
}
@Test
public void  goToCheckout(){
    this.cartPage.clickOfTermsOfService();
    this.cartPage.clickCheckoutButton();
}






}
