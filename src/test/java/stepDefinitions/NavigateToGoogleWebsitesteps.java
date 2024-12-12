package stepDefinitions;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Google.GoogleMainPage;
import utils.WaitUtils;

public class NavigateToGoogleWebsitesteps extends BaseTest {


    @Before
    public void prepare(){


    }

    @Given("I am on the google website")
    public void i_am_on_the_google_website(){
        System.out.println("Ok");
    }

    @When("I will click on about button")
    public void i_will_click_on_about_button() {
        System.out.println("Ok");
        GoogleMainPage gp=new GoogleMainPage(driver);
        gp.about.click();
        WaitUtils.globalWait();
    }

    @After
    public void tearDown(){
        super.tearDown();
    }

}
