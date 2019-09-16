package com.qa.challenge555.pages;

import com.qa.challenge555.testbase.TestBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasketPage extends TestBaseClass {
    public static String ac;
    @FindBy(id = "search_query_top")
    WebElement searchBox;

    @FindBy(xpath = "//button[@name='submit_search']")
    WebElement magnifierGlass;

    @FindBy(id = "selectProductSort")
    WebElement sortBy;

    @FindBy(css = ".product-name")
    List<WebElement> listOfWebelements;

    @FindBy(id = "add_to_cart")
    WebElement addToCart;

    @FindBy(linkText = "Proceed to checkout")
    WebElement ProceedToCheckout;

    @FindBy(css = ".product-name")
    List<WebElement> productName;

    public BasketPage() {
        PageFactory.initElements(driver, this);
    }


    public String Basket(String item, String sort) throws InterruptedException {

        searchBox.sendKeys(item);
        magnifierGlass.click();
        Select select = new Select(sortBy);
        select.selectByVisibleText(sort);
        int sizeOfList = listOfWebelements.size();
        int randomNumber = random(sizeOfList);
        String randomProductInString = listOfWebelements.get(randomNumber).getText();
        listOfWebelements.get(randomNumber).click();
        return randomProductInString;
    }

    public String validationBasket() throws InterruptedException {
        Thread.sleep(3000);
        addToCart.click();
        Thread.sleep(3000);
        ProceedToCheckout.click();
        for (WebElement webelements : productName) {
            String actual = webelements.getText();
            System.out.println("actual=expected");
            ac = actual;
        }
        return ac;

    }

    public int random(int size) {
        Random random = new Random();
        return random.nextInt(size - 1);
    }
}

