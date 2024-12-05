package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.DragAndDropPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver);
        new DragAndDropPage(driver).clickOnDragAndDropLink();
    }

    @Test
    public void dragAndDropTest(){
        new DragAndDropPage(driver).replacingElementWitDragAndDrop();
    }
}
