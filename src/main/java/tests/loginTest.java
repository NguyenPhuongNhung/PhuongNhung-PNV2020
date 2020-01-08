package tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.TestRunner;

public class loginTest extends PageProvider {

    @Given("I open the (.*)$")
    public void user_already_on_home_page(String website) throws InterruptedException {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Then("^I verify that I already in login page$")
    public void verifyadreadyloginpage() throws InterruptedException {
        getLoginpage().verifyAlreadyLoginPage("XYZ Bank");
        Thread.sleep(3000);
    }

    @When("^I click on select option$")
    public void clickSelectOption() throws InterruptedException {
        getLoginpage().clickSelectOption();
        Thread.sleep(3000);
    }

    @When("^I choose username as(.*)$")
    public void chooseUserName(String value) throws InterruptedException {
        getLoginpage().selectUserName(value);
        Thread.sleep(4000);
    }

//    @When("^I choose username with value as (\\d+)$")
//    public void i_choose_username_with_value_as(int arg1) throws Throwable {
//        getLoginpage().selectUserName(arg1);
//        Thread.sleep(4000);
//        throw new PendingException();
//    }

}