package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHelper {

    protected WebDriver driver;

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

}
