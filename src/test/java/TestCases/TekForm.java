package TestCases;

import Base.BaseTest;

import org.testng.annotations.Test;
import pages.TekSchool.FormInputs;
import pages.TekSchool.TekSchoolForm_PF;

public class TekForm extends BaseTest {



        @Test
        public void navigateTO() throws InterruptedException {
            TekSchoolForm_PF tkform =new TekSchoolForm_PF(driver);
            FormInputs formInputs=new FormInputs(driver);


            tkform.clickOnForm();
            Thread.sleep(1000);

            tkform.clickOnText();
            Thread.sleep(1000);

            formInputs.enterName("khna");
            formInputs.emailField("khan12@gmail.com");
            formInputs.p_address("A B C ");
            formInputs.C_addressInput("HDKS HJDK");
            Thread.sleep(2000);


           formInputs.clickOnSubmit();

         Thread.sleep(2000);

        }


        @Test
        public void navigatePage() throws  InterruptedException{
            Thread.sleep(1000);
        }
    }


