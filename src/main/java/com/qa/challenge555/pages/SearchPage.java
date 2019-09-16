package com.qa.challenge555.pages;

import com.qa.challenge555.testbase.TestBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLOutput;

public class SearchPage extends TestBaseClass {
    @FindBy(id="search_query_top")
    WebElement searchTestBox;
    @FindBy(xpath = "//button[@name='submit_search']")
    WebElement magnifierGlass;
    @FindBy(css=".lighter")
    WebElement header;
    public SearchPage(){
        PageFactory.initElements(driver,this);
    }
    public void setSearchTest(String enterProduct){
        searchTestBox.sendKeys(enterProduct);
        magnifierGlass.click();
    }
    public String validSearch(){
        String actualPageHedder=header.getText();
        String expected="T SHIRTS";
        System.out.println(expected);
        return actualPageHedder;
    }
}
