package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage {

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Horizontal Slider')]")
    WebElement horizontalSlider;

    public void clickOnHorizontalSliderPage() {
        click(horizontalSlider);
    }

    @FindBy(xpath = "//input[@type='range']")
    WebElement sliderRange;

    public HorizontalSliderPage movingSlider() {
        new Actions(driver).dragAndDropBy(sliderRange, 55, 0).perform();
        return this;
    }

    @FindBy(id = "range")
    WebElement range;

    public HorizontalSliderPage verifySliderPosition(String text) {
        Assert.assertTrue(range.getText().contains(text));
        return this;
    }
}
