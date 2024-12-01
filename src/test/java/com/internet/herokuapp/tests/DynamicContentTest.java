package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.DynamicContent;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicContentTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver);
    }

    @Test
    public void dynamicContent(){
        new DynamicContent(driver).getContent();
    }
}
