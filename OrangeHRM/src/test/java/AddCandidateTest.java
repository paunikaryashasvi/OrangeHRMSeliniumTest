import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddCandidateTest extends BaseTest {
    @Test
    public void checkFullName(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Ritika","Yashwant",
                        "Paunikar","ritika@gmail.com");


        Assert.assertTrue(driver.findElement(By.xpath("//h6[text()=\"Application Stage\"]")).isDisplayed());
    }

}
