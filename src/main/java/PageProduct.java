import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class PageProduct {

    WebDriver driver;

    private final By buttonChoiceSize = By.xpath("/html/body/div[3]/div[6]/div[2]/div[2]/div[3]/div/div[2]/div[3]/div[3]/div[1]/div/svg/use");

    public PageProduct(WebDriver driver) {
        this.driver = driver;
    }

    public PageProduct choiceSize(){
        Actions action = new Actions(driver);

        action.moveToElement( driver.findElement(buttonChoiceSize)).perform();
        driver.findElement(buttonChoiceSize).click();
        driver.findElement(By.xpath("//*[@id=\"dropdown-ember921\"]/li[1]/a")).click();
        return this;
    }

}
