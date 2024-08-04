package com.thetestingacademy.tests;

import com.thetestingacademy.Pages.PageObjectModel.LoginPagePOM2;
import com.thetestingacademy.tests.base.TestCommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

import static com.thetestingacademy.Divers.DriverManager.driver;
import static com.thetestingacademy.Divers.DriverManager.getDriver;
@Test
public class TestLoginValidUser extends TestCommonToAll {
    private  static  final Logger logger =Logger.getLogger(String.valueOf(TestLoginValidUser.class));

    public void LoginValidUsr() throws FileNotFoundException {
        LoginPagePOM2 loginPagePOM2 =new LoginPagePOM2(driver);
        logger.info("start the Browser");
        loginPagePOM2.geturl("Production");
        logger.info("Open the URL");
        String sucess_msg= loginPagePOM2.LoginAction();
        logger.info("verify the message");
        String expected_msg ="Hi karamjeet Kaur, here's an overview of your experience optimization journey";
        Assert.assertEquals(sucess_msg,expected_msg,"Hi karamjeet Kaur, here's an overview of your experience optimization journey");
        System.out.println(sucess_msg);
    }

}
