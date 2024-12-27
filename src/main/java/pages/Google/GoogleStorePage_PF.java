package pages.Google;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleStorePage_PF {

    WebDriver driver;
            public GoogleStorePage_PF(WebDriver driver){
            this.driver= driver;
                PageFactory.initElements(driver, this);
            }


            @FindBy (xpath = "//a[text()='Store']")
            public WebElement storeButton;

            public void clickOnStore(){
                storeButton.click();
            }





}
