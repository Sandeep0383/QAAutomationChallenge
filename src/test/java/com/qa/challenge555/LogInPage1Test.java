package com.qa.challenge555;

import com.qa.challenge555.pages.HomePage;
import com.qa.challenge555.pages.LogInPage1;
import com.qa.challenge555.testbase.TestBaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPage1Test extends TestBaseClass {
    HomePage homepage;
    LogInPage1 loginpage1;


    public LogInPage1Test() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginpage1 = new LogInPage1();
        homepage = new HomePage();
        homepage.SignInClick();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        loginpage1.loginTest(prop.getProperty("email"), prop.getProperty("password"));

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}

