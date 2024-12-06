package pages.TekSchool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TekSchoolForm_PF {

        WebDriver driver;

    public TekSchoolForm_PF(WebDriver driver){
         this.driver= driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy (xpath = "//div[normalize-space()='Elements']")
      public WebElement formBtn;

    public void clickOnForm(){

        formBtn.click();
    }

    @FindBy (xpath = "//span[normalize-space()='Text Box']")
    public WebElement textBox;

    public void clickOnText(){
        textBox.click();
    }

}
