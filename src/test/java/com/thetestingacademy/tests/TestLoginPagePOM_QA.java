package com.thetestingacademy.tests;

import com.thetestingacademy.Pages.PageObjectModel.LoginPagePOM;
import com.thetestingacademy.tests.base.TestCommonToAll;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

import static com.thetestingacademy.Divers.DriverManager.driver;

public class TestLoginPagePOM_QA extends TestCommonToAll {
    //private static final Logger logger = LogManager.getLogger(TestLoginPagePOM.class);
    private  static  final  Logger logger =Logger.getLogger(String.valueOf(TestLoginPagePOM_QA.class));

    @Test
    public void testLoginNegativeVWO() throws FileNotFoundException {
        logger.info("start the Browser");
        LoginPagePOM loginPagePOM = new LoginPagePOM(driver);
        logger.info("Open the URL");
        loginPagePOM.openVWOLoginURL("QA");
        logger.info("enter the invalid username/psw");
        String error_msg = loginPagePOM.loginToVWOInvalidCreds();
        logger.info("verify the message");
        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");
        driver.quit();
    }
}


