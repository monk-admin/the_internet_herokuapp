package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.BrokenImagesPage;
import com.internet.herokuapp.pages.listOfElements.HoverPage;
import com.internet.herokuapp.pages.listOfElements.RedirectLinkPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectLinkTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver);
        new RedirectLinkPage(driver).clickOnRedirectLink();
    }

    @Test
    public void clickOnHereLink(){
        new RedirectLinkPage(driver).clickOnHereButton();
    }
}
