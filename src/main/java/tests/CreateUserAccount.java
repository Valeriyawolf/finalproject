package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class CreateUserAccount extends BaseTest {
    @Test
    public void createUserAndOpenAccount() {
        //create user
        LoginPage loginPage = new LoginPage(driver);
        loginPage.bankManagerLogin();

        ManagerPage managerPage = new ManagerPage(driver);
        managerPage.addCustMain();

        ManagerAddCustPage managerAddCustPage = new ManagerAddCustPage(driver);
        managerAddCustPage.addNewCust();
        managerAddCustPage.closePopUp();
        //add an account
        managerAddCustPage.clickAccountButton();

        OpenAccountPage openAccountPage =new OpenAccountPage(driver);
        openAccountPage.openAccount();
        //check if account number was added
        openAccountPage.customersButtonClick();

        ManagerListPage managerListPage = new ManagerListPage(driver);
        managerListPage.setSearchAccount();
        managerListPage.searchAccountById();

        //click Home Button
        openAccountPage.homeButtonclick();

        //login by user
        loginPage.customerLogin();


        //check starting balance
        AccountPage accountPage =new AccountPage(driver);
        accountPage.checkStartingBalance();
        
    }
}