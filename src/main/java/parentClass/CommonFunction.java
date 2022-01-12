package parentClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class CommonFunction {

    public WebDriver driver;
    public WebDriverWait webDriverWait;

    {
        webDriverWait = new WebDriverWait(driver, 5);
    }

    public CommonFunction(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToElement(WebDriver d){
        JavascriptExecutor jse = (JavascriptExecutor) d;
        jse.executeScript("window.scrollBy(0, 1000)","");
    }
}
