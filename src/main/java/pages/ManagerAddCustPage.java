package pages;

import helpers.ParentClass;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ManagerAddCustPage extends ParentClass {

    @FindBy(css = "input[ng-model='fName']")
    private WebElement firstNameField;

    @FindBy(css = "input[ng-model='lName']")
    private WebElement lastNameField;

    @FindBy(css = "input[ng-model='postCd']")
    private WebElement postCodeField;

    @FindBy(css = "button[type='submit']")
    private WebElement addCustomerButton;

    @FindBy(css = "button[ng-click='showCust()']")
    private WebElement customersButton;

    @FindBy(css = "button[ng-class='btnClass2']")
    private WebElement openAccountButton;


    public ManagerAddCustPage(WebDriver driver) {
        super(driver);
    }

    public void addNewCust() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        firstNameField.sendKeys("Ivan");
        lastNameField.sendKeys("Ivanov");
        postCodeField.sendKeys("10001");
        addCustomerButton.click();
    }

    public void closePopUp() {
        Alert alt = driver.switchTo().alert();
        alt.accept();
    }

    public void customersButtonClick() {
        customersButton.click();


    }

    public void clickAccountButton() {
        openAccountButton.click();

    }

    public void addNewCustomerNegativeTestOne() {
        addCustomerButton.click();
        String resultText = firstNameField.getText();
        Assert.assertEquals(resultText, "");

    }

    public void addNewCustomerNegativeTestTwo() {
        firstNameField.sendKeys("Ivan");
        addCustomerButton.click();
        String resultText = lastNameField.getText();
        Assert.assertEquals(resultText, "");

    }

    public void addNewCustomerNegativeTestThree() {
        lastNameField.sendKeys("Ivanov");
        addCustomerButton.click();
        String resultText = postCodeField.getText();
        Assert.assertEquals(resultText, "");

    }
}




