package PageFunctions;


import ObjectRepositories.CartPage;
import ObjectRepositories.ProductPage;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;


public class CartPagefunc extends CoreActions {
    public CartPagefunc(WebDriver bot) {
        super(bot);
    }

    SoftAssert softAssert = new SoftAssert();

    public void nameCheck() {
        softAssert.assertTrue(dataMatcher(ProductPage.productNameTextProductPage, CartPage.ProductName_cartPage),"Correct product is added to the cart");
    }

    public void priceCheck() {
        softAssert.assertTrue(dataMatcher(ProductPage.productNamePriceProductPage, CartPage.ProductPrice_cartPage), "Price of the product added to the cart is correct");
    }

    public void clickOnCheckOut() {
        click(CartPage.CheckOut);
    }

    public void verifyItemRemoveFromCartPage() {
        Boolean isPresent = bot.findElements(CartPage.inventoryItemBy).size() > 0;
        System.out.println(isPresent);
        softAssert.assertTrue(isPresent,"There is no product in Cart, cart is empty");
    }

    public void assertfu() {
        softAssert.assertAll();
    }
}
