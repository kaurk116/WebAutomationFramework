package com.thetestingacademy.Pages.PageObjectModel;

import com.thetestingacademy.Base.CommonToAllPages;
import com.thetestingacademy.Utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoginPagePOM extends CommonToAllPages {
    WebDriver driver;
    public LoginPagePOM(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="login-username")
    private static WebElement userName;

    @FindBy(id ="login-password")
    private static WebElement password;

    @FindBy(id ="js-login-btn")
    private static WebElement signButton;

    @FindBy(className ="notification-box-description")
    private static WebElement errorMessage;

        // Page Actions
        public String loginToVWOInvalidCreds() throws FileNotFoundException {
            enterInput(userName, PropertyReader.readKey("Invalid_userName"));
            enterInput(password, PropertyReader.readKey("Invalid_password"));
            clickElement(signButton);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return errorMessage.getText();

    }
}

