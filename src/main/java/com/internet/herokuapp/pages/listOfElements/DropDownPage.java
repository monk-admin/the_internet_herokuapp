package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage extends BasePage {

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/dropdown']")
    WebElement clickDropDown;

    public void clickOnDropDown() {
        click(clickDropDown);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    public DropDownPage choseOption(int number) {
        new Select(dropdown).selectByIndex(number);
        return this;
    }

    public DropDownPage verifyChosenOption(String text){
        Assert.assertTrue((new Select(dropdown).getFirstSelectedOption().getText()).equals(text));
        return this;
    }
}
