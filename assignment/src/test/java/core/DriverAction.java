package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import Utils.Bot;

public class DriverAction {
    protected WebDriver bot;
    protected static final String URL = "https://www.saucedemo.com/";

    @BeforeClass
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\girish.choudhary\\Downloads\\chromedriver_win32\\chromedriver.exe");
        bot = new Bot().getBot();
        bot.get(URL);
    }

    @AfterClass
    public void closeBrowser() {
        bot.quit();
    }

}
