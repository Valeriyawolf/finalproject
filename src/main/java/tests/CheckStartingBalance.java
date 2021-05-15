package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class CheckStartingBalance extends BaseTest {
    @Test
    public void checkStartingBalance() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.bankManagerLogin();

        ManagerPage managerPage = new ManagerPage(driver);
        managerPage.addCustMain();

        ManagerAddCustPage managerAddCustPage = new ManagerAddCustPage(driver);
        managerAddCustPage.addNewCust();
        managerAddCustPage.closePopUp();
        managerAddCustPage.clickAccountButton();

        OpenAccountPage openAccountPage =new OpenAccountPage(driver);
        openAccountPage.openAccount();
        openAccountPage.homeButtonclick();

        loginPage.customerLogin();
        AccountPage accountPage = new AccountPage(driver);
        accountPage.checkStartingBalance();

    }
}
