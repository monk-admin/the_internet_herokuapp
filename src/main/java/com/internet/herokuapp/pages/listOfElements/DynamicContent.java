package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicContent extends BasePage {

    public DynamicContent(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(.,'Dynamic Content')]")
    WebElement content;

    public void getContent(){
        click(content);
    }
}
