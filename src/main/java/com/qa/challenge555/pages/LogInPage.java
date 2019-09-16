package com.qa.challenge555.pages;

import com.qa.challenge555.testbase.TestBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends TestBaseClass {
    @FindBy(id = "email_create")
    WebElement email;

    @FindBy(id = "SubmitCreate")
    WebElement clickCreateAccountBtn;

    public LogInPage() {

        PageFactory.initElements(driver, this);
    }

    public void enterEmailId(String un) {
        email.sendKeys(un);
        clickCreateAccountBtn.click();
    }
    @FindBy(css=".page-heading")
WebElement valid;
    public void validateAccountBtn() {
        clickCreateAccountBtn.click();
    }
    public String headerValidation(){
        return valid.getText();
    }

}
