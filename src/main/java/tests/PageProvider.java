package tests;

import org.openqa.selenium.support.PageFactory;
import pages.loginPage;
import runner.TestRunner;

public class PageProvider {
    private static loginPage loginpage;
    public static loginPage getLoginpage() {
        if (loginpage == null) {
            loginpage = PageFactory.initElements(TestRunner.driver, loginPage.class);
        }
        return loginpage;
    }

}
