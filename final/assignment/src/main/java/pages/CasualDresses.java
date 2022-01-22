package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CasualDresses {
    private static WebElement element = null;

    public static WebElement DressImage(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
        return element;
    }

    public static WebElement ProductName(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a[@class='product-name']"));
        return element;
    }

    public static WebElement ProductPrice(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@class='price product-price']"));
        return element;
    }

    public static WebElement AddToCart(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@title='Add to cart']"));
        return element;
    }

}
