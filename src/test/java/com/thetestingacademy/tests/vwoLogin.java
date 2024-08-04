package com.thetestingacademy.tests;

import com.thetestingacademy.Pages.PageObjectModel.LoginPage_POM;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class vwoLogin {

    @Test
    public void vwoLoginNegitive() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        WebDriver driver = new EdgeDriver();
        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String error_messageText = loginPagePom.VwoLoginInvalidCredit("admin@admin.com", "12341234");
        Assert.assertEquals(error_messageText, "Your email, password, IP address or location did not match");
        System.out.println("bbb" + error_messageText);
        driver.quit();
    }

@Test
public void vwoLoginNegitive2()
{
    EdgeOptions options =new EdgeOptions();
    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    options.addArguments("--guest");
    WebDriver driver =new EdgeDriver();
    LoginPage_POM loginPagePom =new LoginPage_POM(driver);
    String error_messageText =loginPagePom.VwoLoginInvalidCredit("admin@admin2.com", "12341234");
    Assert.assertEquals(error_messageText,"Your email, password, IP address or location did not match");
    System.out.println("bbb"   +error_messageText);
    driver.quit();
    }
    }

