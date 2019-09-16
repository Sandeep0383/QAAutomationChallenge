package com.qa.challenge555.pages;

import com.qa.challenge555.testbase.TestBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage1 extends TestBaseClass {
    @FindBy(css = ".login")
    WebElement signInButton;

    @FindBy(id = "email")
    WebElement userName;

    @FindBy(id = "passwd")
    WebElement pass;

    @FindBy(id = "SubmitLogin")
    WebElement SubmitLogin;

    @FindBy(xpath = "//img[contains(@class,'logo img-responsive')]")
    WebElement logo;

    public LogInPage1() {
        PageFactory.initElements(driver, this);
    }

    public HomePage loginTest(String us, String pwd) {
        signInButton.click();
        userName.sendKeys(us);
        pass.sendKeys(pwd);
        SubmitLogin.click();
        return new HomePage();
    }

}
