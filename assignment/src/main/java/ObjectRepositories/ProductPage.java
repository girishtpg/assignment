package ObjectRepositories;

import org.openqa.selenium.By;

public class ProductPage {
    public static final By AddToCart = By.id("add-to-cart-sauce-labs-backpack");
    public static final By Cart = By.id("shopping_cart_container");
    public static final By ProductName_productPage = By.xpath("//*[@id='item_4_title_link']/div");
    public static final By ProductPrice_productPage = By.xpath("//*[@id='inventory_container']/div/div[1]/div[2]/div[2]/div");
    public static String productNameTextProductPage;
    public static String productNamePriceProductPage;
}
