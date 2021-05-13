package pages;

import helpers.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends ParentClass {

    @FindBy(className = "btn home")
    private WebElement homeButton;

    @FindBy(css = "button[ng-click='customer()']")
    private WebElement customerLoginButton;

    @FindBy(css= "button[ng-click='manager()']")
    private WebElement bankManagerLoginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        bankManagerLoginButton.click();
    }
}

