package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/drag_and_drop']")
    WebElement dragdrop;
    public DragAndDropPage clickOnDragAndDropLink() {
        click(dragdrop);
        return this;
    }

    @FindBy(id = "column-a")
    WebElement dragA;

    @FindBy(id = "column-b")
    WebElement dragB;

    public DragAndDropPage replacingElementWitDragAndDrop(){

        new Actions(driver).dragAndDrop(dragA, dragB).perform();
        return this;
    }




}
