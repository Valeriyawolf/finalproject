package tests;

import helpers.BaseTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagerAddCustPage;
import pages.ManagerPage;

public class CreateUserNegativeTest extends BaseTest {
    @Ignore
    public void createNewUserNegative (){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.bankManagerLogin();
        ManagerPage managerPage = new ManagerPage(driver);
        managerPage.addCustMain();
        ManagerAddCustPage managerAddCustPage = new ManagerAddCustPage(driver);
        managerAddCustPage.addNewCustNegative();

            }
}
