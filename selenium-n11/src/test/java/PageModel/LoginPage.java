package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By txtEmail=By.id("email");
    By txtPassword = By.id("password");
    By btnLoginButton = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        this.driver=driver;

    }


    public BasePage login(String email, String password){
        driver.findElement(txtEmail).sendKeys(email);
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(btnLoginButton).click();
        return new BasePage(driver);

    }
}
