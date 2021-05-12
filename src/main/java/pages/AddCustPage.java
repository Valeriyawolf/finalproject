package pages;

import helpers.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustPage extends ParentClass {
    @FindBy(xpath = "//div[@class='form-group'][1]/input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']")
    private WebElement firstNameField;

    @FindBy(xpath = "//div[@class='form-group'][2]/input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']")
    private WebElement lastNameField;

    @FindBy(xpath = "//div[@class='form-group'][3]/input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']")
    private WebElement postCodeField;

    @FindBy(className = "btn btn-default")
    private WebElement addCustomerButton;

    public void addCust (WebDriver driver) {
       super(driver);
   }

    public void addNewCust() {
        firstNameField.sendKeys("Ivan");
        lastNameField.sendKeys("Ivanov");
        postCodeField.sendKeys("10001");
        addCustomerButton.click();
    }
}


