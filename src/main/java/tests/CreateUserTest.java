package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.ManagerAddCustPage;
import pages.LoginPage;

public class CreateUserTest extends BaseTest {

    @Test
    public void createNewUser () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        ManagerAddCustPage managerAddCustPage = new ManagerAddCustPage(driver);
        managerAddCustPage.addNewCust();
      }

}

