package com.thetestingacademy.Pages.PageObjectModel;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_POM {
    WebDriver driver;
    public LoginPage_POM(WebDriver driver){
        this.driver =driver;
    }
    //Page Locators
    private By UserName = By.id("login-username");
    private By Password =By.id("login-password");
    private  By SingButton =By.id("js-login-btn");


      //Page Action
    public String VwoLoginInvalidCredit(String usr,String pswd){
        driver.get("https://app.vwo.com");
       // WebDriverWait webDriverWait1 =new WebDriverWait(driver, Duration.ofSeconds(3000));
        //webDriverWait1.until(

        driver.findElement(UserName).sendKeys(usr);
        driver.findElement(Password).sendKeys(pswd);
        driver.findElement(SingButton).click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorMessage =driver.findElement(By.className("notification-box-description"));
        String Actual_error_Msg =errorMessage.getText();
        String Expected_errorMsg ="Your email, password, IP address or location did not match";
        return Actual_error_Msg;
    }
    }

