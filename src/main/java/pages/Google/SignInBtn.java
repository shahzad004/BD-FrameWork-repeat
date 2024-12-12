package pages.Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInBtn {

    public WebDriver driver;

    public SignInBtn(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[@aria-label='Sign in']")
    public WebElement signInButton;

    public void clickOnSignIn(){
        signInButton.click();
    }

}
