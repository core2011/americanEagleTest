import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class FindProductTest {

    private WebDriver driver;
    private MainShopPage mainShopPage;

    @Before
    public void setUp(){
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ae.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mainShopPage = new MainShopPage(driver);
    }

    @Test
    public void testFindProduct(){

    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
