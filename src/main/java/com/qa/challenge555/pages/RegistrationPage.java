package com.qa.challenge555.pages;

import com.qa.challenge555.testbase.TestBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends TestBaseClass {
    @FindBy(id = "id_gender1")
    WebElement gender;

    @FindBy(id = "customer_firstname")
    WebElement firstName;

    @FindBy(id = "customer_lastname")
    WebElement lastName;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "days")
    WebElement day;

    @FindBy(id = "months")
    WebElement month;

    @FindBy(id = "years")
    WebElement year;


    @FindBy(id = "firstname")
    WebElement FirstName;

    @FindBy(id = "lastname")
    WebElement LastName;


    @FindBy(id = "company")
    WebElement company;

    @FindBy(id = "address1")
    WebElement address1;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "id_state")
    WebElement state;

    @FindBy(id = "postcode")
    WebElement postcode;

    @FindBy(id = "id_country")
    WebElement country;


    @FindBy(id = "phone_mobile")
    WebElement phoneNum;

    @FindBy(id = "alias")
    WebElement aliasAddress;


    @FindBy(id = "submitAccount")
    WebElement submitAccount;

    public RegistrationPage() {

        PageFactory.initElements(driver, this);
    }

    public void clickMrs() {
        gender.click();
    }

    public void enterFirstName(String fn) {
        firstName.sendKeys(fn);
    }


    public void enterLastName(String ln) {
        lastName.sendKeys(ln);
    }

    public void enterPass(String ps) {
        password.sendKeys(ps);
    }

    public void selectBateOfBirth(String d, String m, String y) throws InterruptedException {
        Select select = new Select(day);
        select.selectByValue(d);
        Thread.sleep(3000);
        Select select1 = new Select(month);
        select1.selectByValue(m);
        Thread.sleep(3000);
        Select select2 = new Select(year);
        select2.selectByValue(y);
    }


    public void setCompany(String com) {
        company.sendKeys(com);
    }

    public void addressFirstname(String fn) {
        FirstName.sendKeys(fn);
    }

    public void addressslastname(String ln) {
        LastName.sendKeys(ln);
    }

    public void setAddress1(String add) {
        address1.sendKeys(add);
    }

    public void setCity(String ci) {
        city.sendKeys(ci);

    }

    public void setState(String s) throws InterruptedException {
        Thread.sleep(3000);
        Select sel = new Select(state);
        sel.selectByVisibleText(s);
    }

    public void setPostcode(String post) {
        postcode.sendKeys(post);
    }

    public void setCountry(String c) throws InterruptedException {
        Thread.sleep(3000);
        Select sel = new Select(country);
        sel.selectByVisibleText(c);
    }


    public void setPhoneNum(String phone) {
        phoneNum.sendKeys(phone);
    }

    public void aliasAddress(String addr) {
        aliasAddress.sendKeys(addr);
    }

    public void setSubmitAccount() {
        submitAccount.click();
    }
}



