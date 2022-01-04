import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TopWomanShopPage {
    WebDriver driver;

    public TopWomanShopPage(WebDriver driver) {
        this.driver = driver;
    }

    public PageProduct choiceProduct(){
        List<WebElement> list = new ArrayList<>(driver.findElements(By.className("product-name")));
        list.get(0).click();
        return new PageProduct(driver);

    }

}
