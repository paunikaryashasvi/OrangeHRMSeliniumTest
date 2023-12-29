import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clickEyeTest extends BaseTest{

    @Test
    public void SearchCandidate(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Ritika","Yashwant",
                        "Paunikar","ritika@gmail.com").searchCandidate("Ritika Yashwant Paunikar").clickEyeButton();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form")).isDisplayed());
    }

    }
