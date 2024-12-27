
package stepDefinitions;

import Base.BaseTest;
import io.cucumber.java.Before;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccountLoginSteps extends BaseTest {



        @Before
        public void setup(){

        }



        @Given("Open the browser")

        public void open_the_browser() throws Throwable {

        }



        @When("Click on My Account Menu")
        public void click_on_My_Account_Menu() throws Throwable {

            driver.findElement(By.linkText("My Account")).click();
        }

        @And("Enter registered username and password")
        public void enter_registered_username_and_password() throws Throwable {
            driver.findElement(By.id("username")).sendKeys("pavanoltraining");
            driver.findElement(By.id("password")).sendKeys("Test@selenium123");
        }

        @And("Click on login button")
        public void click_on_login_button() throws Throwable {
            driver.findElement(By.name("login")).click();
        }

        @Then("User must successfully login to the web page")
        public void user_must_successfully_login_to_the_web_page() throws Throwable {
            String capText= driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong")).getText();
            Assert.assertEquals(true,capText.contains("pavanoltraining"));
        }
}



