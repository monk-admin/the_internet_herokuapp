package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JavaScriptAlert extends BasePage {

    public JavaScriptAlert(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(.,'JavaScript Alerts')]")
    WebElement content;

    public void getContent(){
        click(content);
    }

    @FindBy(xpath = "//button[contains(text(),'Click for JS Alert')]")
    WebElement jsAlert;

    public JavaScriptAlert clickForJsAlert(){
        click(jsAlert);
        driver.switchTo().alert().accept();
        return this;
    }

//    @FindBy(xpath = "//button[contains(text(),'Click for JS Confirm')]")
//    WebElement jsConfirm;

//    public JavaScriptAlert clickOnJsConfirm(String result){
//        click(jsConfirm);
//
//        if (result.equals("Ok")){
//            driver.switchTo().alert().accept();
//        } else if (result.equals("Отмена")){
//            driver.switchTo().alert().dismiss();
//        }
//        return this;
//    }


    @FindBy(xpath = "//button[contains(text(),'Click for JS Confirm')]")
    WebElement jsConfirmButton;

    public JavaScriptAlert clickOnJsConfirm(String result) {
        click(jsConfirmButton);

        if (result != null && result.equals("Ok")){
            driver.switchTo().alert().accept();
        } else if (result != null && result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement result;
    
    public JavaScriptAlert verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Click for JS Prompt')]")
    WebElement jsPromptButton;

    public JavaScriptAlert sendMessageToAlert(String message) {
        click(jsPromptButton);

        if (message != null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement getResult;
    public JavaScriptAlert verifyMessage(String text) {
        Assert.assertTrue(getResult.getText().contains(text));
        return this;
    }
}
