import org.openqa.selenium.By;

public class AcceptCooks {

    public LogInClick logInClick() {
        BrowserManager.
                getBrowser().
                findElement(By.xpath("//*[@id=\"main-header\"]/div/div[1]/ul/li[3]"))
                .click();

        return new LogInClick();
    }

}
