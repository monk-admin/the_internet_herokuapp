package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver);
        new HorizontalSliderPage(driver).clickOnHorizontalSliderPage();
    }

    @Test
    public void horizontalSliderTest(){
        new HorizontalSliderPage(driver).movingSlider()
                .verifySliderPosition("5");
    }
}
