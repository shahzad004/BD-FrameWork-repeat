package TestCases;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.Google.GoogleMainPage_PF;
import utils.WaitUtils;

public class GoogleTest extends BaseTest {


    @Test
    public void googleSite(){
        GoogleMainPage_PF gp=new GoogleMainPage_PF(driver);

        WaitUtils.globalWait();
        System.out.println("hei");

        gp.clickOnAbout();

        driver.navigate().back();

        WaitUtils.globalWait();
        gp.clickOnAbout();

    }




}
