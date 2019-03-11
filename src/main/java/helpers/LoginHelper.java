package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Login;

public class LoginHelper {

    private WebDriver driver;
    private Login login = new Login();

    public LoginHelper(WebDriver webDriver) {
        driver = webDriver;
    }

    public void goToUrl() {
        driver.get(login.getURL());
    }

    public void enterUsername(String username) {
        driver.findElement(By.id(login.getUsernameField())).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id(login.getPasswordField())).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.id(login.getLoginButton())).click();
    }

}
