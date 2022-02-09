package PageFunctions;

import org.openqa.selenium.WebDriver;

import ObjectRepositories.ProductPage_OR;
import Utils.CoreActions;

public class ProductPagefunc extends CoreActions {
    public ProductPagefunc(WebDriver bot) {
        super(bot);
    }

    public void clickOnAddToCart() {
        ProductPage_OR.productNameTextProductPage = textRetriever(ProductPage_OR.ProductName_productPage);
        ProductPage_OR.productNamePriceProductPage = textRetriever(ProductPage_OR.ProductPrice_productPage);
        click(ProductPage_OR.AddToCart);
    }

    public void clickOnCart() {
        click(ProductPage_OR.Cart);
    }

}
