package stepdefinations;

import Base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import pages.Google.GoogleMainPage_PF;
import pages.Google.GoogleStorePage_PF;
import utils.WaitUtils;

public class GoogleStorePageSteps extends BaseTest {

    @Before
    public void setup(){
        super.setup();
        System.out.println("Your are in Google");
    }

    @Given("I am on channel")
    public void i_am_on_channel() {

        WaitUtils.globalWait();
    }

    @Then("I will click store option")
    public void i_will_click_store_option() {
        System.out.println("You are here for locator");

        GoogleStorePage_PF sp=new GoogleStorePage_PF(driver);

        System.out.println("You are here for locator");
        WaitUtils.applyWait(driver, sp.storeButton, WaitStrategy.CLICKABLE);
        sp.storeButton.click();

        driver.navigate().back();

        sp.clickOnStore();

    }

    @Then("I will close the browser")
    public void i_will_close_the_browser() {
        tearDown();

    }




}
