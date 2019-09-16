package com.qa.challenge555;

import com.qa.challenge555.pages.HomePage;
import com.qa.challenge555.pages.LogInPage;
import com.qa.challenge555.pages.RegistrationPage;
import com.qa.challenge555.testbase.TestBaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.qa.challenge555.testbase.TestBaseClass.initialization;

public class LogInPageTest extends TestBaseClass {
    HomePage homePage;
    LogInPage loginpage;
    RegistrationPage registrationPage;


    public LogInPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        loginpage = homePage.SignInClick();

    }

    @Test(priority = 1)
    public void enterEmailidtest() {
        loginpage.enterEmailId(prop.getProperty("email"));
        loginpage.validateAccountBtn();
        String actual = loginpage.headerValidation();
        System.out.println(actual);
        Assert.assertEquals("AUTHENTICATION", actual);

    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

