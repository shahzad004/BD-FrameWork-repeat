package stepdefinitions;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Google.GoogleMainPage;

public class StepDefinitions extends BaseTest {

    @Before
    public void BrowserSetup(){
        setup();
    }

    @Given("I am On google Main Page")
    public void I_am_On_google_Main_Page(){

    }

    @Then("I will Click on Gmail Button")
    public void I_will_Click_on_Gmail_Button() throws InterruptedException {
        GoogleMainPage mainPage=new GoogleMainPage(driver);
        mainPage.clickOnGmail();

    }

    @Then("I will go back to Main Page")
    public void I_will_go_back_to_Main_Page(){
        driver.navigate().back();
    }

    @And("I will click on About Button")
    public void I_will_click_on_About_Button() throws  InterruptedException{
        GoogleMainPage mainPage=new GoogleMainPage(driver);
        mainPage.about.click();
        Thread.sleep(1200);
    }







    @After
    public void tearDown(){
        super.tearDown();
    }
}
