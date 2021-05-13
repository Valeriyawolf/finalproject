package pages;

import helpers.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerPage extends ParentClass {

    @FindBy(className = "btn home")
    private WebElement homeButton;

    @FindBy(css = "button[ng-click='addCust()']")
    private WebElement addCustomerButton;

    @FindBy(css = "button[ng-click='openAccount()']")
    private WebElement openAccountButton;

    @FindBy(css = "button[ng-click='showCust()']")
    private WebElement customersButton;

    public ManagerPage
            (WebDriver driver) {
        super(driver);
    }

}


