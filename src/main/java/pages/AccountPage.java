package pages;

import helpers.BaseTest;
import helpers.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AccountPage extends ParentClass {

    @FindBy(css = "span[ng-show='noAccount']")
    private WebElement textOpenAccount;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void checkTextOpenAccount() {
        String resultTextOpenAccount = textOpenAccount.getText();
        Assert.assertEquals(resultTextOpenAccount,"Please open an account with us.");
}
}