package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class loginPage {
    @FindBy(className = "mainHeading")
    WebElement txtTitle;
    @FindBy(xpath = "//*[@id=\"userSelect\"]")
    WebElement select_option;
    @FindBy(xpath = "//*[@id=\"userSelect\"]")
    Select listOption;

    public void verifyAlreadyLoginPage(String title) throws InterruptedException {
        String textTitle = txtTitle.getText();
        Assert.assertEquals(textTitle, title);
    }//verify already login page

    public void clickSelectOption() throws InterruptedException {
        select_option.click();
    }

    public void selectUserName(String inputValue) throws InterruptedException {
        listOption.selectByValue(inputValue);
    }
//    public void selectUserName(int inputValue) throws InterruptedException {
//        listOption.selectByIndex(inputValue);
//    }
}

