import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{

    @Test
    public void SearchCandidate(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Ritika","Yashwant",
                        "Paunikar","ritika@gmail.com").searchCandidate("Ritika Yashwant Paunikar");

//        Assert.assertTrue(driver.findElement(By.xpath("//span[text()=\"(1) Record Found\"]")).isDisplayed());
    }
}
