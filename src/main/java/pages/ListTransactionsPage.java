package pages;

import helpers.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class ListTransactionsPage extends ParentClass {

    //@FindBy(xpath = "//tr[@id='anchor0']/td[@class='ng-binding'][1]")
    //private WebElement dateTimeFirstTransaction;

    @FindBy(xpath = "//tr[@id='anchor0']/td[@class='ng-binding'][2]")
    private WebElement amountFirstTransaction;

    @FindBy(xpath = "//tr[@id='anchor0']/td[@class='ng-binding'][3]")
    private WebElement transactionTypeFirstTransaction;


   // @FindBy(xpath = "//tr[@id='anchor1']/td[@class='ng-binding'][1]")
   // private WebElement dateTimeSecondTransaction;

    @FindBy(xpath = "//tr[@id='anchor1']/td[@class='ng-binding'][2]")
    private WebElement amountSecondTransaction;

    @FindBy(xpath = "//tr[@id='anchor1']/td[@class='ng-binding'][3]")
    private WebElement transactionTypeSecondTransaction;

    @FindBy(css = "button[ng-click='back()']")
    private WebElement backButton;


    public ListTransactionsPage(WebDriver driver) {
        super(driver);
    }

    public void checkFirstTransaction () {
        String resultText = amountFirstTransaction.getText();
        Assert.assertEquals(resultText,"100");

        String resultText2 = transactionTypeFirstTransaction.getText();
        Assert.assertEquals(resultText2,"Credit");

    }

    public void checkSecondTransaction () {
        String resultText = amountSecondTransaction.getText();
        Assert.assertEquals(resultText,"30");

        String resultText2 = transactionTypeSecondTransaction.getText();
        Assert.assertEquals(resultText2,"Debit");

    }
    public void backButtonClick () {
        backButton.click();
    }



}