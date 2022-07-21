package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class Driver {

   // public String homePageUrl = "https://www.n11.com/";
    public static WebDriver driver;
    public static WebDriverWait wait;

   // public static void main(String[] args){

@BeforeClass
        public void setup(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\EXT02D47280\\IdeaProjects\\selenium-n11\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.n11.com/");
            wait = new WebDriverWait(driver, 20);

        }
   /* @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
*/
    }









