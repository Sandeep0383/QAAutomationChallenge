package com.qa.challenge555;

import com.qa.challenge555.pages.HomePage;
import com.qa.challenge555.pages.LogInPage;
import com.qa.challenge555.pages.RegistrationPage;
import com.qa.challenge555.testbase.TestBaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationPageTest extends TestBaseClass {
    RegistrationPage registrationPage;
    HomePage homepage;
    LogInPage loginpage;

    public RegistrationPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        registrationPage = new RegistrationPage();
        homepage = new HomePage();
        loginpage = homepage.SignInClick();
        loginpage.enterEmailId(prop.getProperty("email"));
        loginpage.validateAccountBtn();
        Thread.sleep(2000);
        registrationPage.clickMrs();
    }

    @Test(priority = 1)
    public void testFirstname() {
        registrationPage.enterFirstName(prop.getProperty("firstname"));

    }

    @Test(priority = 2)
    public void testLastname() {
        registrationPage.enterLastName(prop.getProperty("lastname"));
    }

    @Test(priority = 3)
    public void testPassword() {
        registrationPage.enterPass(prop.getProperty("password"));
    }

    @Test(priority = 4)
    public void enterDOB() throws InterruptedException {
        registrationPage.selectBateOfBirth(prop.getProperty("day"), prop.getProperty("month"), prop.getProperty("year"));
    }

    @Test(priority = 5)
    public void testAddressFirstName() {
        registrationPage.addressFirstname(prop.getProperty("firstname"));
    }

    @Test(priority = 6)
    public void testAddressLastName() {
        registrationPage.addressslastname(prop.getProperty("lastname"));
    }

    @Test(priority = 7)
    public void enterCompanyname() {

        registrationPage.setCompany(prop.getProperty("company"));
    }

    @Test(priority = 8)
    public void enterAddress() {
        registrationPage.setAddress1(prop.getProperty("address"));
    }

    @Test(priority = 9)
    public void enterCity() {

        registrationPage.setAddress1(prop.getProperty("city1"));
    }

    @Test(priority = 10)
    public void enterState() throws InterruptedException {
        registrationPage.setState(prop.getProperty("state1"));
    }

    @Test(priority = 11)
    public void enterPostcode() {
        registrationPage.setPostcode(prop.getProperty("postcode1"));
    }

    @Test(priority = 12)
    public void entercountry() throws InterruptedException {
        registrationPage.setCountry(prop.getProperty("country"));
    }

    @Test(priority = 13)
    public void enterPhone() {

        registrationPage.setPhoneNum(prop.getProperty("phonenumber1"));
    }

    @Test(priority = 14)
    public void enteraliasAddress() {

        registrationPage.aliasAddress(prop.getProperty("aliasAddress"));
    }

    @Test(priority = 15)
    public void clickSubmitButton() {

        //registrationPage.setSubmitAccount();
    }

    @Test(priority = 16)
    public void submit() throws InterruptedException {
        registrationPage.enterFirstName(prop.getProperty("firstname"));
        registrationPage.enterLastName(prop.getProperty("lastname"));
        registrationPage.enterPass(prop.getProperty("password"));
        registrationPage.selectBateOfBirth(prop.getProperty("day"), prop.getProperty("month"), prop.getProperty("year"));
        registrationPage.addressFirstname(prop.getProperty("firstname"));
        registrationPage.addressslastname(prop.getProperty("lastname"));
        registrationPage.setCompany(prop.getProperty("company"));
        registrationPage.setAddress1(prop.getProperty("address"));
        registrationPage.setCity(prop.getProperty("city1"));
        registrationPage.setState(prop.getProperty("state1"));
        registrationPage.setPostcode(prop.getProperty("postcode1"));
        registrationPage.setCountry(prop.getProperty("country"));
        registrationPage.setPhoneNum(prop.getProperty("phonenumber1"));
        registrationPage.aliasAddress(prop.getProperty("aliasAddress"));
      //  registrationPage.setSubmitAccount();


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
