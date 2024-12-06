package config;


import enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

   private static WebDriver driver ;

    public static WebDriver intializeDriver(){


        Browser browser=Browser.valueOf(ConfigManager.getProperty("browser").toUpperCase());
        System.out.println(browser);

        boolean isHeadless= Boolean.parseBoolean(ConfigManager.getProperty("isHeadless"));
        System.out.println(isHeadless);


        switch (browser){
            case CHROME :
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions=new ChromeOptions();
                if( isHeadless ){
                    chromeOptions.addArguments("--headless");
                }
                 driver =new ChromeDriver(chromeOptions);
                 break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions=new FirefoxOptions();
                if( isHeadless ){
                    firefoxOptions.addArguments("--headless--");
                }
                 driver= new FirefoxDriver(firefoxOptions);
                 break;
            case EDGE:

                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions =new EdgeOptions();
                if( isHeadless ){
                    edgeOptions.addArguments("--headless");
                }
                 driver=new EdgeDriver(edgeOptions);
                 break;

            case SAFARI:
                WebDriverManager.safaridriver().setup();
                 driver=new SafariDriver();
                 break;
            default:
                throw new IllegalArgumentException("browser not Supported"+ browser);
        }


        return driver;


    }


}