import org.openqa.selenium.By;

public class MainShopPage {

    public AcceptCooks clickAccept(){
        BrowserManager
                .getBrowser()
                .findElement(By.xpath("//*[@id=\"ember339\"]/div/div/button[1]"))
                .click();
        return new AcceptCooks();
    }
}
