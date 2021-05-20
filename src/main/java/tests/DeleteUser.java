package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagerAddCustPage;
import pages.ManagerListPage;
import pages.ManagerPage;

public class DeleteUser extends BaseTest {

    @Test
    public void deleteUser (){
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
        managerListPage.deleteUserButtonClick();

    }
}
