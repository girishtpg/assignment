package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

    private static WebElement element =null;

    public static WebElement CompanyLogo(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@title='My Store']"));
        return element;
    }

    public static WebElement Cart(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
        return element;
    }
    public static WebElement ContactUs(WebDriver driver) {
        element =driver.findElement(By.xpath("//a[@title='Contact Us']"));
        return element;
    }

    public static WebElement DressesLink(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
        return element;
    }

    public static WebElement CasualDressesLink(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a[@title='Casual Dresses']"));
        return element;
    }
}
