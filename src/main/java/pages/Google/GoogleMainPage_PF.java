package pages.Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage_PF {
    WebDriver driver;

    // constructor
    public GoogleMainPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy (xpath = "//a[text()='About']")
     public WebElement about;


    public void clickOnAbout(){

        about.click();



}


}
