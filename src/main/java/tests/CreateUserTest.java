package tests;

import helpers.BaseTest;
import helpers.BaseTestThree;
import helpers.BaseTestTwo;
import org.testng.annotations.Test;
import pages.AddCustPage;

public class CreateUserTest extends BaseTestThree {

    @Test
    public void createNewUser () {
        AddCustPage addCustPage = new AddCustPage(driver);
        addCustPage.addNewCust();
}

}

