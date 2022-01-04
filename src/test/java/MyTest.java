import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class MyTest {

    @BeforeClass
    public void openBrowser() {
        BrowserManager.openBrowser();

    }

    @Test
    public void testLogIn() throws InterruptedException {
        String adres = "https://www.ae.com/us/en";
        String login = "leprikon2012@ukr.net";
        String password = "q1w2e3r4";
        Navigator
                .openMainPage(adres)
                .clickAccept()
                .logInClick()
                .enterPasswordLogin(login, password)
        ;
    }

    @Test
    public void findProducts() throws InterruptedException {
        FindProduct
                .clickButtonFind();

    }


    @AfterClass
    public void closeBrowser() {
//        BrowserManager.closeBrowser();
    }
}
