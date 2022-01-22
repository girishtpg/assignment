package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webdriver {
    public WebDriver driver;
    String baseurl = "http://automationpractice.com/";


    public void driver() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\girish.choudhary\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseurl);
    }

}
