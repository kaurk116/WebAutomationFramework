package com.thetestingacademy.tests;

import com.thetestingacademy.Pages.PageObjectModel.LoginPagePOM;
import com.thetestingacademy.tests.base.TestCommonToAll;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.io.FileNotFoundException;

import static com.thetestingacademy.Divers.DriverManager.driver;
import static java.util.logging.LogManager.*;

public class TestLoginPagePOM extends TestCommonToAll {
    //private static final Logger logger = LogManager.getLogger(TestLoginPagePOM.class);
    private  static  final  Logger logger =Logger.getLogger(String.valueOf(TestLoginPagePOM.class));

    @Test
    public void testLoginNegativeVWO() throws FileNotFoundException {
        logger.info("start the Broswer");
        LoginPagePOM loginPagePOM = new LoginPagePOM(driver);
        logger.info("Open the URL");
        loginPagePOM.openVWOLoginURL("Live");
        logger.info("enter the invalid username/psw");
        String error_msg = loginPagePOM.loginToVWOInvalidCreds();
        logger.info("verify the message");
        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");
        driver.quit();
    }
}


