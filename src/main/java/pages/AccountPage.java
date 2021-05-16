package pages;

import helpers.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class AccountPage extends ParentClass {

    @FindBy(css = "span[ng-show='noAccount']")
    private WebElement textOpenAccount;

    @FindBy(xpath = "//strong[@class='ng-binding'][2]")
    private WebElement balance;

    @FindBy(css = "button[ng-click='deposit()']")
    private WebElement depositMainButton;

    @FindBy(css = "input[ng-model='amount']")
    private WebElement amountField;

    @FindBy(css = "button[type='submit']")
    private WebElement depositSubmitButton;

    @FindBy(css = "button[ng-click='transactions()']")
    private WebElement transactionsButton;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    private WebElement depositSuccessfulMessage;


    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void checkTextOpenAccount() {
        String resultTextOpenAccount = textOpenAccount.getText();
        Assert.assertEquals(resultTextOpenAccount,"Please open an account with us.");
}
    public void checkStartingBalance(){
        String resultStartingBalance = balance.getText();
        Assert.assertEquals(resultStartingBalance,"0");
    }

    public void addDeposit100 (){
        depositMainButton.click();
        amountField.sendKeys("100");
        depositSubmitButton.click();
        String resultText = depositSuccessfulMessage.getText();
        Assert.assertEquals(resultText,"Deposit Successful");
        transactionsButton.click();

    }



}