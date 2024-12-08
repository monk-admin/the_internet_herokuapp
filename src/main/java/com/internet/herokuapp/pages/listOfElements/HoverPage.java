package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HoverPage extends BasePage {

    public HoverPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/hovers']")
    WebElement hovers;

    public HoverPage clickOnHoverPageLink() {
        click(hovers);
        return this;
    }

    @FindBy(xpath = "(//img[1])[3]")
    WebElement user;

    public void chooseUser() {
        new Actions(driver).moveToElement(user).perform();
    }

    @FindBy(xpath = "//h5[contains(.,'name: user2')]")
    WebElement verifyUser;

    public void verifyChosenUser(){
        Assert.assertTrue(verifyUser.isDisplayed());

    }
}
