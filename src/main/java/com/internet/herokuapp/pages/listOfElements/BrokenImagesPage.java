package com.internet.herokuapp.pages.listOfElements;

import com.internet.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

public class BrokenImagesPage extends BasePage {

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href=\"/broken_images\"]")
    WebElement brokenImages;
    
    public void linkToBrokenImagesPage() {
        new BrokenImagesPage(driver).click(brokenImages);
    }

    @FindBy(xpath = "//div/img")
    List<WebElement> images;

    public void checkBrokenImages(){
        System.out.println(images.size() + " - " + " images");
        for (int i = 0; i < images.size(); i++) {
            WebElement element = images.get(i);
            String imageURL = element.getAttribute("src");
            verifyLinks(imageURL);
            try {
                Boolean imageDisplayed = (Boolean) js.executeScript("return (typeof arguments[0].naturalWidth!=undefined && arguments[0].naturalWidth>0);", element);
                if (imageDisplayed){
                    System.out.println("DISPLAY - OK");
                } else {
                    System.out.println("DISPLAY - BROKEN");
                    System.out.println("***********************************************");
                }
            } catch (Exception e){
                System.out.println("Error occurred");
            }
        }
    }





//    public void checkBrokenImages() {
//
//    }
}
