package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.ManagerAddCustPage;
import pages.LoginPage;
import pages.ManagerPage;

public class CreateUserTest extends BaseTest {

    @Test
    public void createNewUser () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        ManagerPage managerPage = new ManagerPage(driver);
        managerPage.addCustMain();
        ManagerAddCustPage managerAddCustPage = new ManagerAddCustPage(driver);
        managerAddCustPage.addNewCust();
        managerAddCustPage.closePopUp();
      }

}

