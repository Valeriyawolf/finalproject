package pages;

import helpers.ParentClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

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

    public void customersButtonClick(){
        customersButton.click();


    }

    public void addNewCustNegative() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        addCustomerButton.click();
    }
}


