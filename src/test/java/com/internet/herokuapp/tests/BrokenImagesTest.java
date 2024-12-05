package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.BrokenImagesPage;
import com.internet.herokuapp.pages.listOfElements.HoverPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver);
        new BrokenImagesPage(driver).linkToBrokenImagesPage();
    }

    @Test
    public void brokenImagesTest(){
        new BrokenImagesPage(driver).checkBrokenImages();
//        new BrokenImagesPage(driver).checkBrokenImages();
    }
}
