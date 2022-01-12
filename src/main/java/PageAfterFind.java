import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Locale;

public class PageAfterFind {
    WebDriver driver;

    public PageAfterFind(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkResult(String checkText) {
        boolean allMatch = driver.findElements(By.className("product-name"))
                .stream()
                .peek(e-> System.out.println(e.getText()))
                .allMatch(element ->
                        element.getText()
                                .contains(checkText.toLowerCase(Locale.ROOT)
                                        .toLowerCase(Locale.ROOT)));
        return allMatch;
    }


}
