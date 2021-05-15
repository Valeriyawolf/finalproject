package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class CreateUserPositiveTest extends BaseTest {

    @Test
    public void createNewUser () {
        //create user
        LoginPage loginPage = new LoginPage(driver);
        loginPage.bankManagerLogin();

        ManagerPage managerPage = new ManagerPage(driver);
        managerPage.addCustMain();

        ManagerAddCustPage managerAddCustPage = new ManagerAddCustPage(driver);
        managerAddCustPage.addNewCust();
        managerAddCustPage.closePopUp();

        //check that user was created
        managerAddCustPage.customersButtonClick();

        ManagerListPage managerListPage =new ManagerListPage(driver);
        managerListPage.setSearchCustomer();
        managerListPage.searchCustomerByFirstName();
        managerListPage.homeButtonClick();

        //login by user
        loginPage.customerLogin();

        //check that user ia not able to do any transactions
        AccountPage accountPage =new AccountPage(driver);
        accountPage.checkTextOpenAccount();

      }

}

