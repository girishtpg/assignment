import driver.*;
import pages.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class Assessment extends Webdriver {

    @Test(priority=1)
    public void success() throws InterruptedException {
        driver();
        String Title="My Store";
        if(driver.getTitle()!=null && driver.getTitle().equals(Title)) {
            System.out.println("Web page opened successfully");

            Home.ContactUs(driver).click();

            driver.manage().window().maximize();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("scroll(0,500)");

            ContactUs.SubjectHeading(driver).click();
            ContactUs.SubjectHeadingSelection(driver,1);

            ContactUs.Email(driver).sendKeys("girish@gmail.com");

            ContactUs.Message(driver).sendKeys("hellooooooooo");

            ContactUs.Submit(driver).click();

            String SuccessMessage = ContactUs.SuccessMessage(driver).getText();

            if(SuccessMessage!=null && SuccessMessage.equals("Your message has been successfully sent to our team.")){
                System.out.println("Message sent successfully and Test Case 1 passed successfully");
            }
            Thread.sleep(3000);
            driver.quit();
        }
        else {
            assertFalse(true,"Opened website is not correct");
            driver.quit();
        }

    }

    @Test(priority =2)
    public void fail() throws InterruptedException {
        driver();
        String Title="My Store";
        if(driver.getTitle()!=null && driver.getTitle().equals(Title)) {
            System.out.println("Web page opened successfully");

            Home.ContactUs(driver).click();

            driver.manage().window().maximize();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("scroll(0,500)");

            ContactUs.SubjectHeading(driver).click();
            ContactUs.SubjectHeadingSelection(driver,1);

            ContactUs.Email(driver).sendKeys("girish@gmail");

            ContactUs.Message(driver).sendKeys("hellooooooooo");

            ContactUs.Submit(driver).click();

            String InvalidMessage = ContactUs.InvalidMessage(driver).getText();
            if(InvalidMessage!=null && InvalidMessage.equals("Invalid email address.")){
                System.out.println("Got error message and Test Case 2 passed");
            }
            Thread.sleep(3000);
            driver.quit();
        }
        else {
            assertFalse(true,"Opened website is not correct");
            driver.quit();
        }
    }

    @Test(priority =3)
    public void AddToCart() throws InterruptedException {
        driver();
        driver.manage().window().maximize();

        WebElement dresses = Home.DressesLink(driver);
        Actions action = new Actions(driver);
        action.moveToElement(dresses).perform();

        Home.CasualDressesLink(driver).click();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,700)");

        WebElement dressImg = CasualDresses.DressImage(driver);
        action.moveToElement(dressImg).perform();

        String productName = CasualDresses.ProductName(driver).getText();

        String productPrice = CasualDresses.ProductPrice(driver).getText();
        System.out.println("ProductPrice"+" "+productPrice);

        CasualDresses.AddToCart(driver).click();
        Thread.sleep(5000);

        Cart.CloseWindow(driver).click();

        js.executeScript("scroll(0,-500)");

        Home.CompanyLogo(driver).click();

        Home.Cart(driver).click();
        js.executeScript("scroll(0,400)");

        String cartProductName = Cart.CartProductName(driver).getText();

        String cartProductPrice = Cart.CartProductPrice(driver).getText();

        System.out.println("Cart Product price"+" "+cartProductPrice);

        if(cartProductName.equals(productName) && cartProductPrice.equals(productPrice)) {
            System.out.println("Product matched");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
