package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FramesPage extends BasePage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/frames']")
    WebElement selectFrame;

    public void selectFramePage(){
        click(selectFrame);
    }

    @FindBy(xpath = "//a[contains(text(),'iFrame')]")
    WebElement selectionIframe;
    public void selectionIframePage() {
        click(selectionIframe);
    }

    @FindBy(xpath = "//h3[contains(text(),'An iFrame containing the TinyMCE WYSIWYG Editor')]")
    WebElement confirmMessage;

    public void verifySelectedIframe(String text){
        Assert.assertTrue(confirmMessage.getText().contains(text));
    }

    @FindBy(xpath = "//a[contains(text(),'Nested Frames')]")
    WebElement nestedFrames;

    public void selectionNestedFramesPage() {
        click(nestedFrames);
    }

//    @FindBy(id = "content")
//    WebElement nestedFrameMiddle;
//
//    public void setNestedFrameMiddle(String text) {
//        Assert.assertTrue(nestedFrameMiddle.getText().contains(text));
//    }
}
