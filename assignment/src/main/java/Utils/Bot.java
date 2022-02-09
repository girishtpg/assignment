package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bot {

    private final WebDriver driver;

    //Constructor to initialize driver with ChromeDriver
    public Bot() {
        this.driver = new ChromeDriver();
    }

    //Returning driver whenever required
    public WebDriver getBot(){
        return driver;
    }
}