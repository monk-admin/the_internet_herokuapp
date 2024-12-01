package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.FramesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver);
        new FramesPage(driver).selectFramePage();
    }

//    @Test
//    public void framePage(){
//        new FramesPage(driver).selectFramePage();
//    }

    @Test
    public void iframePage(){
        new FramesPage(driver).selectionIframePage();
        new FramesPage(driver).verifySelectedIframe("An iFrame containing the TinyMCE WYSIWYG Editor");
    }

    @Test
    public void nestedFrames(){
        new FramesPage(driver).selectionNestedFramesPage();
    }

//    @Test
//    public void middleNestedFrame(){
//        new FramesPage(driver).selectionNestedFramesPage();
//        new FramesPage(driver).setNestedFrameMiddle("MIDDLE");
//    }
}
