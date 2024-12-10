package TestCases;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.Google.GoogleMainPage;
import utils.WaitUtils;

public class GoogleTest extends BaseTest {


    @Test
    public void googleSite(){
        GoogleMainPage gp=new GoogleMainPage(driver);

        WaitUtils.getTimeout();
        gp.clickOnGmail();


        driver.navigate().back();
        gp.about.click();

    }




}
