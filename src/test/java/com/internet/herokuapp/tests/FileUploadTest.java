package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.FileUploadPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver);
        new FileUploadPage(driver).clickOnFileUploadLink();
    }

    @Test
    public void uploadFile(){
        new FileUploadPage(driver).uploadFileToSite("/Users/monk/Tools/Test.jpg");
    }
}
