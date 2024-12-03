package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MulipleWindowsPage extends BasePage {

    public MulipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(.,'Multiple Windows')]")
    WebElement multipleWindows;

    public void selectMultipleWindows() {
        click(multipleWindows);
    }

    @FindBy(xpath = "//a[contains(.,'Click Here')]")
    WebElement clickHere;

    public MulipleWindowsPage clickHereOnWindowsPage(int index) {
        click(clickHere);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy(xpath = "//div[contains(.,'New Window')]")
    WebElement newWindow;

    public void verifyNewWindowText(String text){
        Assert.assertTrue(newWindow.getText().contains(text));
    }
}
