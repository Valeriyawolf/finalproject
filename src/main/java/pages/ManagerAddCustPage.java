package pages;

import helpers.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ManagerAddCustPage extends ParentClass {

    @FindBy(css = "input[ng-model='fName']")
    private WebElement firstNameField;

    @FindBy(css = "input[ng-model='lName']")
    private WebElement lastNameField;

    @FindBy(css = "input[ng-model='postCd']")
    private WebElement postCodeField;

    @FindBy(className = "btn btn-default")
    private WebElement addCustomerButton;

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
}


