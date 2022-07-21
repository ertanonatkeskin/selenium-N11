package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class BasePage extends BaseMethod {

    public BasePage(WebDriver driver) {
        this.driver=driver;
    }

    List<WebElement> products;
    Random random = new Random();
    By btnLoginButton = By.id("loginButton");
    By btnSignIn = By.xpath("//a[@class='btnSignIn']");
    By searchBox = By.id("searchData");
    By searchBoxButton = By.xpath("//span[@class='iconsSearch']");
    By accountTitle = By.className("//a[@class='user']");
    By pageTwo = By.xpath("//a[@href='https://www.n11.com/arama?q=telefon&pg=2']");
    By productsList = By.xpath("//ul[@class='list-ul']");
    By addProduct  = By.xpath("//button[@class='addBasketUnify']");
    By goBasket  = By.xpath("//a[@class='btn btnBlack btnGoBasket']");
    By deleteProduct = By.xpath("/span[@class='removeProd svgIcon svgIcon_trash']");

    public void searchArea(String key) {
        sendKeys(searchBox,key);
        clickElement(searchBoxButton);
        String summary = getText(searchBox);
        if (summary.contains(key)) {
            assertEquals(true, true);
        } else {
            assertEquals(true, false);
        }

    }
    public void clickTwo(){
        clickElement(pageTwo);
    }
    public void clickGiris(){
        clickElement(btnSignIn);
    }
    public void clickLogin(){
        clickElement(btnLoginButton);
    }

    public LoginPage getLoginPage() {
        driver.findElement(btnSignIn).click();
        return new LoginPage(driver);
    }

    public String getAccountTitleText() {
        return driver.findElement(accountTitle).getText();
    }

    public void searchToBox(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword + Keys.ENTER);
    }


    public void randomProductSelect() {

            products = findElements(productsList);
            int productNumber = random.nextInt(products.size());
            clickElement(products.get(productNumber));

        }
    public void addProductToBasket(){
        clickElement(addProduct);
    }
    public void goBasket(){
        clickElement(goBasket);
    }
    public void deleteProductBasket(){
    clickElement(deleteProduct);
    }
}
