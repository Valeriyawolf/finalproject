package pages;

import helpers.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ManagerListPage extends ParentClass {

    @FindBy(css = "input[ng-model='searchCustomer']")
    private WebElement searchCustomerField;

    @FindBy(css = "td[class='ng-binding']")
    private WebElement firstNameField;

    @FindBy(css = "button[ng-click='home()']")
    private WebElement homeButton;

    @FindBy(css = "span[class='ng-binding ng-scope']")
    private WebElement searchAccountNumberField;

    @FindBy(css = "button[ng-click='deleteCust(cust)']")
    private WebElement deleteUserButton;


    public ManagerListPage(WebDriver driver) {
        super(driver);
    }

    public void setSearchCustomer() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        searchCustomerField.sendKeys("Ivan");

    }

    public void searchCustomerByFirstName() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String resultText = firstNameField.getText();
        Assert.assertEquals(resultText,"Ivan");

    }

    public void homeButtonClick() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        homeButton.click();
    }

    public void setSearchAccount() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        searchCustomerField.sendKeys("1016");
    }

    public void searchAccountById() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String resultText = searchAccountNumberField.getText();
        Assert.assertEquals(resultText,"1016");

    }
    public void deleteUserButtonClick() {
        deleteUserButton.click();
    }

}