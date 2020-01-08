package tests;

import org.openqa.selenium.support.PageFactory;
import pages.loginPage;
import runner.TestRunner;

public class PageProvider {
    private static loginPage loginpage;
//    private static OpenAccountPage openAccountPage;
//    private static CommonPage commonPage;
//
//
    public static loginPage getLoginpage() {
        if (loginpage == null) {
            loginpage = PageFactory.initElements(TestRunner.driver, loginPage.class);
        }
        return loginpage;
    }
//
//
//    public static OpenAccountPage getOpenAccountPage() {
//        if (openAccountPage == null) {
//            openAccountPage = PageFactory.initElements(TestRunner.driver, OpenAccountPage.class);
//        }
//        return openAccountPage;
//    }
}
