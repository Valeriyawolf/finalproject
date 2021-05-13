package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class CreateUserPositiveTest extends BaseTest {

    @Test
    public void createNewUser () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.bankManagerLogin();

        ManagerPage managerPage = new ManagerPage(driver);
        managerPage.addCustMain();

        ManagerAddCustPage managerAddCustPage = new ManagerAddCustPage(driver);
        managerAddCustPage.addNewCust();
        managerAddCustPage.closePopUp();
        managerAddCustPage.customersButtonClick();

        ManagerListPage managerListPage =new ManagerListPage(driver);
        managerListPage.setSearchCustomer();
        managerListPage.searchCustomerByFirstName();
        managerListPage.homeButtonClick();

        loginPage.customerLogin();

        AccountPage accountPage =new AccountPage(driver);
        accountPage.checkTextOpenAccount();


      }

}

