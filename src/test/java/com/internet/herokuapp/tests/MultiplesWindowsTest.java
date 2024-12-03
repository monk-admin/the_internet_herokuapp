package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.HomePage;
import com.internet.herokuapp.pages.listOfElements.MulipleWindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiplesWindowsTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver);
        new MulipleWindowsPage(driver).selectMultipleWindows();
    }

    @Test

    public void multipleWindowsClickHere(){
        new MulipleWindowsPage(driver).clickHereOnWindowsPage(1);
        new MulipleWindowsPage(driver).verifyNewWindowText("New Window");
    }
}