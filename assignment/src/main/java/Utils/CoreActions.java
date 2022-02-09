package Utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

public class CoreActions {
    protected final WebDriver bot;
    protected final WebDriverWait delay;

    @SuppressWarnings("deprecation")
    protected CoreActions(WebDriver bot) {
        this.bot = bot;
        this.delay = new WebDriverWait(bot, 10);
    }

    protected void enterText(By element, String text) {
        bot.findElement(element).sendKeys(text);
    }

    protected void click(By element) {
        bot.findElement(element).click();
    }

    protected String textRetriever(By element){
        return bot.findElement(element).getText();
    }

    protected String pageTitle() {return bot.getTitle(); }

    protected boolean waitForVisibility(By element) {
        boolean isVisible = true;
        try {
            delay.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException te) {
            isVisible = false;
        }
        return isVisible;
    }

    protected boolean dataMatcher(String data, By element){
        String text= textRetriever(element);

        if(text.equals(data)){
            return true;
        }
        else{
            return false;
        }

    }

    public static void sleep(double sec) {
        try {
            Thread.sleep((long) (sec * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
