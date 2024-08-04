package com.thetestingacademy.Base;

import com.thetestingacademy.Divers.DriverManager;
import com.thetestingacademy.Utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.thetestingacademy.Divers.DriverManager.driver;
import static com.thetestingacademy.Divers.DriverManager.getDriver;

public class CommonToAllPages {

    public CommonToAllPages() {

    }

    public void openVWOLoginURL(String url) {

       //  DriverManager.getDriver().get("https://app.vwo.com");

        try {
            switch (url) {
                case "QA":
                    getDriver().get(PropertyReader.readKey("url"));
                    break;
                case "Live":
                    getDriver().get(PropertyReader.readKey("url_qa"));
                    break;
                case "default":
                    getDriver().get(PropertyReader.readKey("default"));
                    break;
            }

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }
    public void clickElement(WebElement by) {
        by.click();
    }

    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }

    public void enterInput(WebElement element, String key) {
        element.sendKeys(key);
    }

    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    //method overloading same name Different Argument
    public WebElement getElement(By key){
        return getDriver().findElement(key);
    }

    public WebElement getElement(WebElement element) {
        return element;
    }
}
