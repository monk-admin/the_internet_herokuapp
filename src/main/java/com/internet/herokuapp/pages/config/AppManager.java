package com.internet.herokuapp.pages.config;

import com.internet.herokuapp.pages.utils.MyListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import java.time.Duration;

public class AppManager {

    String browser;
    public WebDriver driver;

    public AppManager(String browser) {
        this.browser = browser;
    }

    public WebDriver startTest() {
        if (browser.equals("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("safari")) {
            driver = new SafariDriver();
        } else if (browser != null && !browser.equals("chrome") && !browser.equals("firefox") && !browser.equals("safari")) {
            throw new IllegalArgumentException("Entered browser is not correct");
        }

        driver = new EventFiringDecorator(new MyListener()).decorate(driver);

        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public void stopTest() {
        driver.quit();
    }
}
