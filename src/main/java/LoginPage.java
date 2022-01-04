import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    private By buttonSingIn = By.name("signin");
    private By textLogin = By.name("username");
    private By textPassword = By.name("password");
    private By buttonLogIn = By.name("login");
    private By headIn = By.className("modal-title");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickButtonSingIn (){
        driver.findElement(buttonSingIn).click();
        return this;
    }

    public LoginPage typeLogin(String login) throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(textLogin).sendKeys(login);
        return this;
    }

    public LoginPage typePassword(String password) throws InterruptedException {
        driver.findElement(textPassword).sendKeys(password);
        Thread.sleep(5000);
        return this;
    }

     public LoginPage clickButtonLogIn (){
        driver.findElement(buttonLogIn).click();
        return this;
     }

     public String getHeadText(){
        return driver.findElement(headIn).getText();
     }


}
