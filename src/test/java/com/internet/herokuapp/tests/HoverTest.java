package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.BasePage;
import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.HoverPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new BasePage(driver);
        new HoverPage(driver).clickOnHoverPageLink();
    }

    @Test
    public void hoverOverTheImageTest(){
        new HoverPage(driver).chooseUser();
    }
}
