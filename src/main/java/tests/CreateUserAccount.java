package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class CreateUserAccount extends BaseTest {
    @Test
    public void createNewUserAndOpenAccount() {
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
        openAccountPage.customersButtonClick();

        ManagerListPage managerListPage = new ManagerListPage(driver);
        managerListPage.setSearchAccount();
        managerListPage.searchAccountById();


    }
}