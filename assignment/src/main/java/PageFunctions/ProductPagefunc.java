package PageFunctions;

import org.openqa.selenium.WebDriver;

import ObjectRepositories.ProductPage;
import Utils.CoreActions;

public class ProductPagefunc extends CoreActions {
    public ProductPagefunc(WebDriver bot) {
        super(bot);
    }

    public void clickOnAddToCart() {
        ProductPage.productNameTextProductPage = textRetriever(ProductPage.ProductName_productPage);
        ProductPage.productNamePriceProductPage = textRetriever(ProductPage.ProductPrice_productPage);
        click(ProductPage.AddToCart);
    }

    public void clickOnCart() {
        click(ProductPage.Cart);
    }

}
