package Base;

import config.ConfigManager;
import config.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.DriverManager;

public class BaseTest {

   public WebDriver driver;
  public Logger logger = LogManager.getLogger(BaseTest.this);
  private static final String baseUrl=ConfigManager.getProperty("baseUrl");


  @BeforeMethod
    public void setup(){
      driver= DriverFactory.getDriver();
      driver.manage().window().maximize();
      driver.get(baseUrl);

      logger.info("URl IS " ,baseUrl );

  }

@AfterMethod
  public static void tearDown(){
    DriverFactory.quitDriver();
  }




}
