package TestCases;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.Google.GoogleMainPage;

public class GoogleTest extends BaseTest {


    @Test
    public void googleSite() throws InterruptedException {
        GoogleMainPage gp=new GoogleMainPage(driver);

        Thread.sleep(1000);
        gp.clickOnGmail();
        Thread.sleep(3000);

        driver.navigate().back();
        gp.about.click();

    }
}
