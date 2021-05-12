package pages;

import helpers.ParentClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerPage extends ParentClass {

    @FindBy(className = "btn home")
    private WebElement homeButton;

    @FindBy(xpath = "//button[@class='btn btn-lg tab'][1]")
    private WebElement addCustomerButton;

    @FindBy(xpath = "//button[@class='btn btn-lg tab btn-primary']")
    private WebElement openAccountButton;

    @FindBy(className = "//button[@class='btn btn-lg tab btn-primary']")
    private WebElement customersButton;

}

