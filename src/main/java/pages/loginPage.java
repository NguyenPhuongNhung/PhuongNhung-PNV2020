package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class loginPage {
    @FindBy(className = "mainHeading")
    WebElement txtTitle;
    @FindBy(xpath = "//*[@id=\"userSelect\"]")
    WebElement select_option;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/form/button")
    WebElement btn_login;


    public void verifyAlreadyLoginPage(String title) throws InterruptedException {
        String textTitle = txtTitle.getText();
        Assert.assertEquals(textTitle, title);
    }//verify already login page

    public void clickSelectOption() throws InterruptedException {
        select_option.click();
    }

    public void selectUserName(String inputValue) throws InterruptedException {
        List<WebElement> listCustomerName = select_option.findElements(By.tagName("option"));
        for (WebElement customerName : listCustomerName) {
            if (customerName.getText().toLowerCase().equalsIgnoreCase(inputValue)) {
                customerName.click();
                Thread.sleep(4000);
                break;
            }
        }
    }
//   public void clickLoginButton() throws InterruptedException {
//        btn_login.click();
//    }
}

