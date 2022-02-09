package ObjectRepositories;

import org.openqa.selenium.By;

public class CartPage_OR {
    public static final By ProductName_cartPage = By.xpath("//*[@id='item_4_title_link']/div");
    public static final By ProductPrice_cartPage = By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]/div[2]/div");
    public static final By CheckOut = By.id("checkout");
    public static final By inventoryItemBy = By.className("inventory_item_name");

}
