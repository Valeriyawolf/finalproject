package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class CreateTransactions extends BaseTest {

    @Test
    public void addTransactions() {
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

        OpenAccountPage openAccountPage = new OpenAccountPage(driver);
        openAccountPage.openAccount();
        //check if account number was added
        openAccountPage.customersButtonClick();

        ManagerListPage managerListPage = new ManagerListPage(driver);
        managerListPage.setSearchAccount();
        managerListPage.searchAccountById();

        //login
        openAccountPage.homeButtonclick();

        loginPage.customerLogin();
        AccountPage accountPage = new AccountPage(driver);
        //create deposit
        accountPage.addDeposit100();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        ListTransactionsPage listTransactionsPage = new ListTransactionsPage(driver);
        listTransactionsPage.checkFirstTransaction();
        listTransactionsPage.backButtonClick();

        //check starting balance1
        accountPage.checkStartingBalance1();
        //add withdrawn > balance
        accountPage.addWithdrawn200();
        accountPage.transactionButtonClick();
        listTransactionsPage.backButtonClick();


        //check starting balance2
        accountPage.checkStartingBalance1();
        //add withdrawn < balance
        accountPage.addWithdrawn30();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        accountPage.checkStartingBalance2();
        accountPage.transactionButtonClick();
        driver.navigate().refresh(); //refresh
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        listTransactionsPage.checkSecondTransaction();
        listTransactionsPage.backButtonClick();


    }
}