package com.thetestingacademy.tests;

import com.thetestingacademy.Pages.PageFactory.LoginPagePF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPagePF {
    @Test
    public void loginVWOWrong(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        LoginPagePF loginPagePF =new LoginPagePF(driver);
        String error_Msg =loginPagePF.LoginVWOCreds();
        Assert.assertEquals(error_Msg,"Your email, password, IP address or location did not match");
        String Expected_errorMsg ="Your email, password, IP address or location did not match";
        Assert.assertEquals(error_Msg,Expected_errorMsg,"Your email, password, IP address or location did not match");
    }


}
