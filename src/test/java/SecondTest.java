import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

    private WebDriver driver;

    @Before
    public void setup() {
        String pathToChromedriver = System.getProperty("user.dir") + "/src/main/resources/chromedriver";

        System.setProperty("webdriver.chrome.driver", pathToChromedriver);
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        driver.close();
    }

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
