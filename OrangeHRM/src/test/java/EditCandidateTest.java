import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditCandidateTest extends BaseTest {

    @Test
    public void editCandidateDetails(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Ritika","Yashwant",
                        "Paunikar","ritika@gmail.com").searchCandidate("Ritika Yashwant Paunikar")
                .clickEyeButton().editCandidate();

//        Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
    }
}
