
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest{



    @Test
    public void validLoginTest(){

        new LoginPage(driver).performLogin("Admin","admin123");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

    }

}
