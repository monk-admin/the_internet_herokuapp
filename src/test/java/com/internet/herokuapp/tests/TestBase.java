package com.internet.herokuapp.tests;

import com.internet.herokuapp.pages.config.AppManager;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class TestBase {

    protected AppManager app = new AppManager(System.getProperty("browser", "chrome"));

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    public WebDriver driver;

    @BeforeMethod
    public void init(Method method){
        driver = app.startTest();
        logger.info("Start test: " + method.getName());
    }

    @AfterMethod(enabled = true)
    public void tearDown(ITestResult result){
        if (result.isSuccess()){
            logger.info("Test result: PASSED " + result.getMethod().getMethodName());
        } else{
            logger.error("Test result: FAILED " + result.getMethod().getMethodName());
        }
        logger.info("*************************************************************");
        app.stopTest();
    }

}
