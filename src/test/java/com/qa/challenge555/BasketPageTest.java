package com.qa.challenge555;

import com.qa.challenge555.pages.BasketPage;
import com.qa.challenge555.pages.HomePage;
import com.qa.challenge555.testbase.TestBaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasketPageTest extends TestBaseClass {
    HomePage homepage;
    BasketPage basketPage;

    @BeforeMethod
    public void setUp() {
        initialization();
        homepage = new HomePage();
        basketPage = new BasketPage();

    }

    @Test(priority = 1)
    public void basketTest() throws InterruptedException {
        String expected=
        basketPage.Basket(prop.getProperty("product"), prop.getProperty("sortdropdown"));
        String actual=basketPage.validationBasket();
        System.out.println(expected  + actual);
        Assert.assertEquals(expected,actual);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}