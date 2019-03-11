import base.TestHelper;
import org.junit.Test;
import org.openqa.selenium.By;

public class ThirdTest extends TestHelper {

    @Test
    public void test() {

        String url = "https://localhost";

        String usernameField = "username";
        String username = "test_vce";

        String passwordField = "password";
        String password = "password";

        String loginButton = "submit";

        driver.get(url);
        driver.findElement(By.id(usernameField)).sendKeys(username);
        driver.findElement(By.id(passwordField)).sendKeys(password);
        driver.findElement(By.id(loginButton)).click();

    }

}
