package com.qa.challenge555;

import com.qa.challenge555.pages.HomePage;
import com.qa.challenge555.pages.LogInPage;
import com.qa.challenge555.testbase.TestBaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBaseClass {
    HomePage homepage;
    LogInPage loginpage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homepage = new HomePage();

    }

    @Test(priority = 1)
    public void signIntest() {
        loginpage = homepage.SignInClick();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
