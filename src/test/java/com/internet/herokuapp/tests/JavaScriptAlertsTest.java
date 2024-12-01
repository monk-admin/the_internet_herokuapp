package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.JavaScriptAlert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptAlertsTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver);
        new JavaScriptAlert(driver).getContent();
    }

    @Test
    public void javaScriptAlert(){
        new JavaScriptAlert(driver).clickForJsAlert();
    }

//    @Test
//    public void javaScriptConfirm(){
//        new JavaScriptAlert(driver).clickOnJsConfirm("Отмена");
//    }

    @Test
    public void javaScriptConfirm(){
        new JavaScriptAlert(driver).clickOnJsConfirm("Ok").verifyResult("Ok");
    }

    @Test
    public void javaScriptPrompt(){
        new JavaScriptAlert(driver).sendMessageToAlert("Hello World!!!").verifyMessage("Hello World!!!");
    }
}
