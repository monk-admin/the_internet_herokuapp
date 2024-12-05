package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/upload']")
    WebElement moveToThePage;

    public void clickOnFileUploadLink() {
        new FileUploadPage(driver).click(moveToThePage);
    }

    @FindBy(id = "file-upload")
    WebElement uploadFile;

    public void uploadFileToSite(String path) {
        uploadFile.sendKeys(path);
    }
}
