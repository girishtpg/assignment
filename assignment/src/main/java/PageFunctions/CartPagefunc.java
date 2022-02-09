package PageFunctions;


import ObjectRepositories.CartPage_OR;
import ObjectRepositories.ProductPage_OR;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;


public class CartPagefunc extends CoreActions {
    public CartPagefunc(WebDriver bot) {
        super(bot);
    }

    SoftAssert softAssert = new SoftAssert();

    public void nameCheck() {
        softAssert.assertTrue(dataMatcher(ProductPage_OR.productNameTextProductPage,CartPage_OR.ProductName_cartPage),"Correct product is added to the cart");
    }

    public void priceCheck() {
        softAssert.assertTrue(dataMatcher(ProductPage_OR.productNamePriceProductPage,CartPage_OR.ProductPrice_cartPage), "Price of the product added to the cart is correct");
    }

    public void clickOnCheckOut() {
        click(CartPage_OR.CheckOut);
    }

    public void verifyItemRemoveFromCartPage() {
        Boolean isPresent = bot.findElements(CartPage_OR.inventoryItemBy).size() > 0;
        System.out.println(isPresent);
        softAssert.assertTrue(isPresent,"There is no product in Cart");
    }

    public void assertfu() {
        softAssert.assertAll();
    }
}
