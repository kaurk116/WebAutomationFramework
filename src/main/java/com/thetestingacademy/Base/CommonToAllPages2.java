package com.thetestingacademy.Base;

import com.thetestingacademy.Utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;

import static com.thetestingacademy.Divers.DriverManager.getDriver;

public class CommonToAllPages2 {
    public CommonToAllPages2(){

    }
    public void geturl(String URL) throws FileNotFoundException {
        //DriverManager.driver.get("https://app.vwo.com");
        switch (URL) {
            case "QA":
                getDriver().get(PropertyReader.readKey("url"));
                break;
            case "Production":
                getDriver().get(PropertyReader.readKey("url_qa"));
                break;
            case "default":
                ;
                getDriver().get(PropertyReader.readKey("default"));
        }
    }

    public void enterInput(WebElement enterValue,String key){
            enterValue.sendKeys(key);
        }

        public void ElementClick(WebElement By){
            By.click();

        }
    public WebElement getElement(WebElement element, String sucessMsg) {
        return element;
    }

        public WebElement visibilityOfElement(By elementLocation) {
            return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
        }

}


