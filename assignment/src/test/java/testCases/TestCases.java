package testCases;


import org.testng.annotations.Test;

import core.DriverAction;
import PageFunctions.*;

public class TestCases extends DriverAction {
    Loginfunc login;
    ProductPagefunc product;
    CartPagefunc cart;
    CheckOutPagefunc checkout;

    @Test(priority = 1)
    public void Impl() {
        login = new Loginfunc(bot);
        product = new ProductPagefunc(bot);
        cart = new CartPagefunc(bot);
        checkout = new CheckOutPagefunc(bot);
    }

    @Test(priority = 2,dependsOnMethods = "Impl")
    public void testCase1_login() throws InterruptedException{
//    	login.enterUsername("standard_user");
//    	login.enterPassword("secret_sauce");
//    	login.clickOnLogin();
        login.enterUsernamesList();
        Thread.sleep(3000);
    }

    @Test(priority = 3,dependsOnMethods = "Impl")
    public void testCase2_Add_one_item_to_cart(){
        product.clickOnAddToCart();
    }

    @Test(priority = 4,dependsOnMethods = "Impl")
    public void testCase3_Go_to_cart_and_verify_the_item() {
        product.clickOnCart();
        cart.nameCheck();
        cart.priceCheck();
        cart.clickOnCheckOut();
        cart.assertfu();
    }

    @Test(priority = 5,dependsOnMethods = "Impl")
    public void testCase4_fill_form_and_submit() throws InterruptedException {
        checkout.enterFirstName("Girish");
        checkout.enterLastName("Choudhary");
        checkout.enterPostalCode("999999");
        Thread.sleep(3000);
        checkout.clickOnContinue();
        checkout.clickOnFinsh();
    }

    @Test(priority = 6,dependsOnMethods = "Impl")
    public void testCase5_go_to_Cart_and_see_that_item_removed() {
        product.clickOnCart();
        cart.verifyItemRemoveFromCartPage();
        cart.assertfu();
    }

}

