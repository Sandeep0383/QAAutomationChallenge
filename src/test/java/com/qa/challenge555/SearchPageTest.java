package com.qa.challenge555;

import com.qa.challenge555.pages.BasketPage;
import com.qa.challenge555.pages.HomePage;
import com.qa.challenge555.pages.SearchPage;
import com.qa.challenge555.testbase.TestBaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPageTest extends TestBaseClass {
    HomePage homepage;
    SearchPage searchPage;

    @BeforeMethod
    public void setUp() {
        initialization();
        homepage = new HomePage();
        searchPage=new SearchPage();
    }

    @Test(priority = 1)
    public void signInTest(){
        searchPage.setSearchTest(prop.getProperty("product"));
        String actual=searchPage.validSearch();
        System.out.println(actual);
        String actualHeader=actual.replaceAll("\"","");
        Assert.assertEquals("T SHIRTS",actualHeader);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}

