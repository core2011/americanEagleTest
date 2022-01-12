import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import parentClass.CommonFunction;

import java.time.Duration;


public class MyTest {

    private WebDriver driver;
    private MainShopPage mainShopPage;
    private static final String QUERY_T_SHIRT = "AE Super Soft Long-Sleeve Eagle Graphic T-Shirt";

    @Before
    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "/Users/olvolkov/IdeaProjects/firstProgram/driver/chromedriver_97");;
        System.setProperty("webdriver.chrome.driver", "/Users/olvolkov/IdeaProjects/firstProgram/driver/chromedriver_96");;
//        System.setProperty("webdriver.chrome.driver", "/Users/olvolkov/IdeaProjects/firstProgram/driver/chromedriver_95");;
        driver = new ChromeDriver();
//        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ae.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mainShopPage = new MainShopPage(driver);

    }


    @Test
    public void testLogIn() throws InterruptedException {
        String login = "leprikon2012@ukr.net";
        String passeord = "q1w2e3r4";

//        String title = "Details";
        LoginPage loginPage = mainShopPage
                .clickOnButtonForSingIn()
//                .clickButtonSingIn()
//                .typeLogin(login)
//                .typePassword(passeord)
//                .clickButtonLogIn();
        ;

        String expectedTitle = "sasha's Account";
        String actualTitle = loginPage.getHeadText();
        Assert.assertEquals("Title dose not mach", actualTitle, expectedTitle);
    }

    @Test
    public void testFindProduct() throws InterruptedException {
        String query = "";

        boolean allMatch = mainShopPage
                .clickSearch()
                .enterProduct(QUERY_T_SHIRT)
                .checkResult(QUERY_T_SHIRT);
//        System.out.println(allMatch);
//        Assert.assertEquals();
        Assert.assertTrue("Don't work", allMatch);
    }

    @Test
    public void putProductInBin() throws InterruptedException {
        mainShopPage
                .clickButtonManShop()
                .choiceProduct()
                .choiceSize();
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
