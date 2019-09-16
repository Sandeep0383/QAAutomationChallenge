package com.qa.challenge555.pages;

import com.qa.challenge555.testbase.TestBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBaseClass {

    @FindBy(xpath = "//a[@class='login']")
    WebElement signInButton;


    public HomePage() {

        PageFactory.initElements(driver, this);
    }


    public LogInPage SignInClick() {
        signInButton.click();
        return new LogInPage();
    }
}

