import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    private final By textFind = By.name("search");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public PageAfterFind enterProduct(String find){
        driver.findElement(textFind).sendKeys(find);
        driver.findElement(textFind).sendKeys(Keys.ENTER);
        return new PageAfterFind(driver);
    }
}
