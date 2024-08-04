package com.thetestingacademy.Pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {
    WebDriver driver;
    public LoginPagePF(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="login-username")
    private WebElement userName;

    @FindBy(id ="login-password")
    private WebElement password;

    @FindBy(id ="js-login-btn")
    private WebElement signButton;

    @FindBy(className ="notification-box-description")
    private WebElement errorMessage;


    //Page Action
    public  String LoginVWOCreds(){
        userName.sendKeys("admin@admin.com");
        password.sendKeys("12341234a");
        signButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return errorMessage.getText();

    }
}
