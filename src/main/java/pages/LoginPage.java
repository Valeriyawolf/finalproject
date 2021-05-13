package pages;

import helpers.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends ParentClass {

    @FindBy(css = "button[ng-click='home()']")
    private WebElement homeButton;

    @FindBy(css = "button[ng-click='customer()']")
    private WebElement customerLoginButton;

    @FindBy(css= "button[ng-click='manager()']")
    private WebElement bankManagerLoginButton;

    @FindBy(css= "select[ng-model='custId']")
    private WebElement yourNameField;

    @FindBy(css= "option[value='6']")
    private WebElement username;

    @FindBy(css= "button[type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }



    public void bankManagerLogin() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        bankManagerLoginButton.click();
    }

    public void customerLogin() {
        customerLoginButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        yourNameField.click();
        username.click();
        loginButton.click();

    }
}

