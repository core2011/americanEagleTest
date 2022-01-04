import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class MyTest {

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
    public void testLogIn() throws InterruptedException {
        String login = "leprikon2012@ukr.net";
        String passeord = "q1w2e3r4";
//        String title = "Sasha's Account";
        String title = "Details";
        LoginPage loginPage = mainShopPage
                .clickOnButtonForSingIn()
                .clickButtonSingIn()
                .typeLogin(login)
                .typePassword(passeord)
                .clickButtonLogIn()
                ;
        String hidingTitle = loginPage.getHeadText();
        Assert.assertEquals(hidingTitle, title);
    }

    @Test
    public void testFindProduct() throws InterruptedException {
        String find = "t-shirt";
        boolean allMatch = mainShopPage
                .findProduct()
                .enterProduct(find)
                .checkResult(find);
        System.out.println(allMatch);
//        Assert.assertTrue("true", allMatch);  ??????????
    }

    @Test
    public void putProductInBin() throws InterruptedException {
        mainShopPage
                .clickButtonManShop()
                .choiceProduct()
                .choiceSize();
    }



    @After
    public void tearDown(){
//        driver.quit();
    }
}
