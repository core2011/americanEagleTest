import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentClass.CommonFunction;

public class MainShopPage extends CommonFunction {


//    private final By buttonForSingIn = By.className("aeo-icon aeo-icon-account header-icon-default");

//    @FindBy(xpath = "//*[@name='accept-cookie']")
//    WebElement buttonAccept;

    private final By buttonAccept = By.name("accept-cookie");
    private final By buttonFind = By.xpath("//*[@id=\"main-header\"]/div/div[1]/ul/li[2]");
    private final By buttonNew = By.xpath("//*[@id=\"top-navigation\"]/div/div/div[1]/div[1]/span");
    private final By buttonTopWoman = By.xpath("//*[@id=\"top-navigation\"]/div/div/div[1]/div[2]/div/div[1]/div/a[1]");

    public MainShopPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickOnButtonForSingIn() throws InterruptedException {
//        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(buttonAccept));
        clickAccept();
//        Thread.sleep(5000);
//        scrollToElement(driver);
//        driver.findElement(buttonForSingIn).click();

        return new LoginPage(driver);
    }

    private void clickAccept() {
        driver.findElement(buttonAccept).click();
    }

    public SearchPage clickSearch() throws InterruptedException {
        clickAccept();
        Thread.sleep(5000);
        driver.findElement(buttonFind).click();
        return new SearchPage(driver);
    }

    public TopWomanShopPage clickButtonManShop() throws InterruptedException {
        clickAccept();
        Thread.sleep(5000);
        driver.findElement(buttonNew).click();
        Thread.sleep(3000);
        driver.findElement(buttonTopWoman).click();
        return new TopWomanShopPage(driver);
    }


}
