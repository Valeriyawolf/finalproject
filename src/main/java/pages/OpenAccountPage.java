package pages;

import helpers.ParentClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class OpenAccountPage extends ParentClass {

    @FindBy(css = "button[ng-class='btnClass2']")
    private WebElement openAccountButton;

    @FindBy(css = "select[id='userSelect']")
    private WebElement customerNameField;

    @FindBy(css = "select[id='currency']")
    private WebElement currencyField;

    @FindBy(css = "option[value='6']")
    private WebElement ivanIvanovCustomerName;

    @FindBy(css = "option[value='Dollar']")
    private WebElement dollarCurrency;

    @FindBy(css = "button[type='submit']")
    private WebElement processButton;

    @FindBy(css = "button[ng-class='btnClass3']")
    private WebElement customersButton;

    public OpenAccountPage (WebDriver driver) {
        super(driver);
    }

    public void openAccount (){
        customerNameField.click();
        ivanIvanovCustomerName.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        openAccountButton.click();
        dollarCurrency.click();
        processButton.click();
        Alert alt = driver.switchTo().alert();
        alt.accept();

    }

}