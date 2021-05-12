package pages;

import helpers.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentClass {

    @FindBy(className = "btn home")
    private WebElement homeButton;

    @FindBy(xpath = "//div[@class='center'][1]/button[@class='btn btn-primary btn-lg']")
    private WebElement customerLoginButton;

    @FindBy(xpath = "//div[@class='center'][2]/button[@class='btn btn-primary btn-lg']")
    private WebElement bankManagerLoginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        bankManagerLoginButton.click();
    }
}

