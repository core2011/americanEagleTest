import org.openqa.selenium.By;

public class LogInClick {

    private LogInClick logIn() {
        BrowserManager
                .getBrowser()
                .findElement(By.xpath("//*[@id=\"modal-ember343\"]/div/div[2]/div[1]/button"))
                .click();
        return new LogInClick();
    }

    public void enterPasswordLogin(String login, String pas) throws InterruptedException {
        logIn();
        Thread.sleep(5000);
        BrowserManager
                .getBrowser()
                .findElement(By.name("username"))
                .sendKeys(login);
        Thread.sleep(5000);
        BrowserManager
                .getBrowser()
                .findElement(By.name("password"))
                .sendKeys(pas);
        Thread.sleep(5000);
        BrowserManager
                .getBrowser()
                .findElement(By.name("login"))
                .click();
    }


}
