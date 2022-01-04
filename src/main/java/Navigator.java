public class Navigator {

    public static MainShopPage openMainPage(String adres){
        BrowserManager.getBrowser().navigate().to(adres);
        return new MainShopPage();
    }


}
