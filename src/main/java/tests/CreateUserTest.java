package tests;

import helpers.BaseTest;
import org.testng.annotations.Test;
import pages.AddCustPage;

public class CreateUserTest extends BaseTest {

    @Test
    public void createNewUser () {
        AddCustPage addCustPage = new AddCustPage(driver);
        addCustPage.addCust();
}

}

