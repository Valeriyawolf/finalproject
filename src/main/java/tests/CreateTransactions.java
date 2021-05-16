package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class CreateTransactions extends BaseTest {

    @Test
    public void addDeposit() {
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

        //check starting balance
        openAccountPage.homeButtonclick();

        loginPage.customerLogin();
        AccountPage accountPage = new AccountPage(driver);
        //create deposit
        accountPage.addDeposit100();

        ListTransactionsPage listTransactionsPage =new ListTransactionsPage(driver);
        listTransactionsPage.checkFirstTransaction();

    }
}
