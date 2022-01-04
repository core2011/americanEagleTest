import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {

    private static WebDriver browser;

    public static void openBrowser(){
        browser = new SafariDriver();
    }

    public static WebDriver getBrowser(){
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return browser;
    }

    public static void closeBrowser(){
        browser.quit();
    }

}
