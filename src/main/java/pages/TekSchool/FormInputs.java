package pages.TekSchool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormInputs {

    WebDriver driver;
    // constructor to get element intialize automatically
    public FormInputs(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//input[@id='userName']")
    WebElement fnameField;



    @FindBy (xpath = "//input[@id='userEmail']")
    WebElement emailField;

    @FindBy (xpath = "//textarea[@id='currentAddress']")
    WebElement currentAddress;

    @FindBy (xpath = "//textarea[@id='permanentAddress']")
    WebElement p_address;

    @FindBy (xpath = "//button[@id='submit']")
    WebElement submitClick;



    public void enterName(String name){
        fnameField.sendKeys(name);
    }

    public void emailField(String email){
        emailField.sendKeys(email);
    }

    public void C_addressInput(String add){
        currentAddress.sendKeys(add);
    }

    public void p_address(String cadd) {
        p_address.sendKeys(cadd);
    }


    public void clickOnSubmit(){
        submitClick.click();
    }




}
