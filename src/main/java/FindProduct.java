import org.openqa.selenium.By;

public class FindProduct {

    public static void clickButtonFind() throws InterruptedException {
        Thread.sleep(10000);
        BrowserManager
                .getBrowser()
                .findElement(By.xpath("//*[@id=\"modal-ember2683\"]/div/div[1]/button/svg/path"))
                .click();
        BrowserManager
                .getBrowser()
                .findElement(By.xpath("//*[@id=\"main-header\"]/div/div[1]/ul/li[2]/a/svg"))
                .click();
    }
}
