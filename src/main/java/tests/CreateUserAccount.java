package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagerAddCustPage;
import pages.ManagerPage;
import pages.OpenAccountPage;

public class CreateUserAccount extends BaseTest {
    @Test
    public void createNewUserAndOpenAccount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.bankManagerLogin();

        ManagerPage managerPage = new ManagerPage(driver);
        managerPage.addCustMain();

        ManagerAddCustPage managerAddCustPage = new ManagerAddCustPage(driver);
        managerAddCustPage.addNewCust();
        managerAddCustPage.closePopUp();
        managerAddCustPage.clickAccountButton();

        OpenAccountPage openAccountPage =new OpenAccountPage(driver);
        openAccountPage.openAccount();



    }
}