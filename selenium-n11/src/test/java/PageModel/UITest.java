package PageModel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest extends BaseMethod {

    BasePage basePage = new BasePage(driver);

    //Proje başlarken Driver class'ın içinde n11 i ayağa kaldırım (@BeforeClass)

    @Test(priority = 1)
    public void openN11() {
        driver.get("https://www.n11.com/");
    }

    @Test(priority = 2)
    public void clickGirisYap(){
        basePage.clickGiris();

    }
    @Test(priority = 3)
    public void login(){
        //sistem otomasyon olduğu anlayıp login'e izin vermiyor sanırım burayı debug yapamadım
        LoginPage loginPage = basePage.getLoginPage();
        loginPage.login("ertanonatkeskin@gmail.com","123qwe123.");
        basePage.clickLogin();
        String accountText= basePage.getAccountTitleText();
        Assert.assertEquals(accountText,"ek");
        //burda kulannıcının ek(ertan keskin) kontrolünü yaptım
    }

    @Test(priority = 4)
    public void search(){

        basePage.searchArea("telefon");
        basePage.scrollToElement();
        basePage.clickTwo();

    }
    @Test(priority = 4)
    public void randomProductSelect(){
    basePage.randomProductSelect();
    }

    @Test(priority = 5)
    public void addProductToBasket(){
        basePage.addProductToBasket();
    }

    @Test(priority =6)
    public void goToBasket(){
        basePage.goBasket();
    }
    @Test(priority =7)
    public void deleteProductBasket(){
        basePage.deleteProductBasket();
    }

}
