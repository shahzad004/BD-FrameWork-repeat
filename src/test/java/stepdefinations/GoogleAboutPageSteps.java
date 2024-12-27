package stepdefinations;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.Google.GoogleMainPage_PF;
import utils.WaitUtils;

public class GoogleAboutPageSteps extends BaseTest {

    @Before
    public void prepare(){
        System.out.println("Welcome");
            super.setup();
    }

    @Given("I am on Google")
    public void i_am_on_google() {
        System.out.println("Welcome to This Site");
    }

    @Then("I will click on about")
    public void i_will_click_on_about() {
        GoogleMainPage_PF gpm=new GoogleMainPage_PF(driver);
        System.out.println("I will click on About button");
        gpm.about.click();
        WaitUtils.globalWait();
        driver.navigate().back();
        WaitUtils.globalWait();
        gpm.clickOnAbout();

    }

    @Then("I will shut the browser")
    public void i_will_shut_the_browser() {

        System.out.println("Your task is done");
    }





}
