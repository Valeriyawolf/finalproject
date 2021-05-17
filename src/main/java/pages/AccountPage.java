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
    private WebElement amountDepositField;

    @FindBy(css = "button[type='submit']")
    private WebElement depositSubmitButton;

    @FindBy(css = "button[ng-click='transactions()']")
    private WebElement transactionsButton;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    private WebElement depositSuccessfulMessage;

    @FindBy(css = "button[ng-click='withdrawl()']")
    private WebElement withdrawnButton;

    @FindBy(css = "input[ng-model='amount']")
    private WebElement amountWithdrawnField;

    @FindBy(css = "button[type='submit']")
    private WebElement withdrawnSubmitButton;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    private WebElement withdrawnErrorMessage;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    private WebElement withdrawnSuccessMessage;


    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void checkTextOpenAccount() {
        String resultTextOpenAccount = textOpenAccount.getText();
        Assert.assertEquals(resultTextOpenAccount, "Please open an account with us.");
    }

    public void checkStartingBalance() {
        String resultStartingBalance = balance.getText();
        Assert.assertEquals(resultStartingBalance, "0");
    }

    public void checkStartingBalance1() {
        String resultStartingBalance1 = balance.getText();
        Assert.assertEquals(resultStartingBalance1, "100");
    }

    public void checkStartingBalance2() {
        String resultStartingBalance2 = balance.getText();
        Assert.assertEquals(resultStartingBalance2, "70");
    }

    public void addDeposit100() {
        depositMainButton.click();
        amountDepositField.sendKeys("100");
        depositSubmitButton.click();
        String resultText = depositSuccessfulMessage.getText();
        Assert.assertEquals(resultText, "Deposit Successful");
        transactionsButton.click();


    }

    public void addWithdrawn200() {
        withdrawnButton.click();
        amountWithdrawnField.sendKeys("200");
        withdrawnSubmitButton.click();
        String resultText = withdrawnErrorMessage.getText();
        Assert.assertEquals(resultText, "Transaction Failed. You can not withdraw amount more than the balance.");

    }

    public void addWithdrawn30() {
        withdrawnButton.click();
        amountWithdrawnField.sendKeys("30");
        withdrawnSubmitButton.click();
        String resultText = withdrawnErrorMessage.getText();
        Assert.assertEquals(resultText, "Transaction successful");

    }

    public void transactionButtonClick (){
        transactionsButton.click();
    }
}