import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void test() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://localhost");
        driver.findElement(By.id("username")).sendKeys("test_vce");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("submit")).click();

        driver.close();

    }

}
