package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
    private static WebElement element =null;

    public static WebElement CartProductName(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"product_3_13_0_0\"]/td[2]/p[@class='product-name']"));
        return element;
    }

    public static WebElement CartProductPrice(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='total_product_price_3_13_0']"));
        return element;
    }

    public static WebElement CloseWindow(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@title='Close window']"));
        return element;
    }

}
