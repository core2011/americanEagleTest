import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainShopPage {

    WebDriver driver;

    private By buttonForSingIn = By.xpath("//*[@id=\"main-header\"]/div/div[1]/ul/li[3]");
    private By buttonAccept = By.name("accept-cookie");

    public MainShopPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickOnButtonForSingIn() throws InterruptedException {
        clickAccept();
        Thread.sleep(5000);
        driver.findElement(buttonForSingIn).click();
        return new LoginPage(driver);
    }

    private void clickAccept()  {
        driver.findElement(buttonAccept).click();
    }



}
