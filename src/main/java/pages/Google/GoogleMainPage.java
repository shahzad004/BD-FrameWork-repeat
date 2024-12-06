package pages.Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    WebDriver driver;

    // constructor
    public GoogleMainPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    // TO find Elements:
 @FindBy (xpath = " //a[text()='Store']")
   public WebElement store;


@FindBy (xpath = "//a[text()='About']")
   public WebElement about;

@FindBy (xpath = "//a[text()='Gmail']")
   public WebElement Gmail;


public void clickOnGmail() throws InterruptedException {
    Gmail.click();
    Thread.sleep(2000);
}


}
