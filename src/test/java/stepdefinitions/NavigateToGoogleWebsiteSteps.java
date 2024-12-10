package stepdefinitions;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.Google.GoogleMainPage;

public class NavigateToGoogleWebsiteSteps extends BaseTest {

    GoogleMainPage mainPage=new GoogleMainPage(driver);


    @Given("I am On google Main Page")
    public void I_am_On_google_Main_Page(){

    }

    @Then("I will Click on Gmail Button")
    public void I_will_Click_on_Gmail_Button() throws InterruptedException {

        mainPage.clickOnGmail();

    }

    @Then("I will go back to Main Page")
    public void I_will_go_back_to_Main_Page() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(6000);
    }

}
