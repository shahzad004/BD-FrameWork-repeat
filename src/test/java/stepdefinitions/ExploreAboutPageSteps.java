package stepdefinitions;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Google.GoogleMainPage;

import java.sql.SQLOutput;

public class ExploreAboutPageSteps extends BaseTest {

    GoogleMainPage gp=new GoogleMainPage(driver);



    @Given("I m On Google Website")
    public void i_m_on_google_website() {
        System.out.println("Hi how are you");
    }

    @Then("I will hit on About WebPage")
    public void i_will_hit_on_about_web_page() {
        gp.about.click();
    }

    @Then("I will click on Commitments option")
    public void I_will_click_on_commitments_option() throws InterruptedException {

        gp.getCommitText();
    }








}


