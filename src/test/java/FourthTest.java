import base.TestHelper;
import helpers.LoginHelper;
import org.junit.Test;

public class FourthTest extends TestHelper {

    @Test
    public void test() {

        LoginHelper loginHelper = new LoginHelper(driver);

        String username = "test_vce";
        String password = "password";

        loginHelper.goToUrl();
        loginHelper.enterUsername(username);
        loginHelper.enterPassword(password);
        loginHelper.clickLogin();

    }

}
