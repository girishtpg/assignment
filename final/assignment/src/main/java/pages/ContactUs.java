package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {
    private static WebElement element = null;

    public static WebElement SubjectHeading(WebDriver driver) {
        element = driver.findElement(By.xpath("//select[@name='id_contact']"));
        return element;
    }

    public static void SubjectHeadingSelection(WebDriver driver,int index) {
        Select drop = new Select(SubjectHeading(driver));
        drop.selectByIndex(index);
    }

    public static WebElement Email(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='email']"));
        return element;
    }

    public static WebElement Message(WebDriver driver) {
        element = driver.findElement(By.xpath("//textarea[@id='message']"));
        return element;
    }

    public static WebElement Submit(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@id='submitMessage']"));
        return element;
    }

    public static WebElement SuccessMessage(WebDriver driver) {
        element = driver.findElement(By.xpath("//p[@class='alert alert-success']"));
        return element;
    }

    public static WebElement InvalidMessage(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li"));
        return element;
    }

}
