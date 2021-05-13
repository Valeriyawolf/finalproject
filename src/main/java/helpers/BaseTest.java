package helpers;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

        public WebDriver driver;

        @BeforeMethod
        public void start() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        }

        //@AfterMethod
        //public void endTest() {
          //  driver.quit();

        //}
    }

