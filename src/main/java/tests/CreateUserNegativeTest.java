package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagerAddCustPage;
import pages.ManagerPage;

public class CreateUserNegativeTest extends BaseTest {
    @Test
    public void createNewUserNegative (){
        //Bunk manager login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.bankManagerLogin();
        //navigate to add customer
        ManagerPage managerPage = new ManagerPage(driver);
        managerPage.addCustMain();

        //check empty fields
        ManagerAddCustPage managerAddCustPage = new ManagerAddCustPage(driver);
        managerAddCustPage.addNewCustomerNegativeTestOne();
        managerAddCustPage.addNewCustomerNegativeTestTwo();
        managerAddCustPage.addNewCustomerNegativeTestThree();


        }
}
