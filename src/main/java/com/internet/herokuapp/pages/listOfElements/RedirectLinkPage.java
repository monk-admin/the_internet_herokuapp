package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectLinkPage extends BasePage {

    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/redirector']")
    WebElement redirector;

    public void clickOnRedirectLink() {
        new RedirectLinkPage(driver).click(redirector);
    }

    @FindBy(id = "redirect")
    WebElement redirect;

    public void clickOnHereButton() {
        new RedirectLinkPage(driver).click(redirect);
    }
}
