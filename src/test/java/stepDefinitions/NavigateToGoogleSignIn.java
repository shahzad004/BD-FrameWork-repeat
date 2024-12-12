package stepDefinitions;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Google.SignInBtn;

public class NavigateToGoogleSignIn extends BaseTest {


    @Before
    public void prepare(){
        super.setup();

    }


    @Given("I am on Google Main Page")
    public void i_am_on_Google_Main_Page() {
        System.out.println("Welocme on google");
    }

    @Then("I will click of signIn Button")
    public void i_will_click_of_sign_in_Button() {

        SignInBtn sn=new SignInBtn(driver);
        sn.signInButton.click();
        System.out.println("done");

    }

    @After
    public void tearDown(){
        super.tearDown();
    }

}
