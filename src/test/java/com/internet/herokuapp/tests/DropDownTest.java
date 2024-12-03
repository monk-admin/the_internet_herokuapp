package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.DropDownPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver);
        new DropDownPage(driver).clickOnDropDown();
    }

    @Test
    public void dropDownList(){
        new DropDownPage(driver).choseOption(2).verifyChosenOption("Option 2");
    }
    
}
