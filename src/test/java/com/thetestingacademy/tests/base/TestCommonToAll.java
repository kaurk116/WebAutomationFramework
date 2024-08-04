package com.thetestingacademy.tests.base;

import com.thetestingacademy.Divers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCommonToAll {

    //call the driver
    //Down the driver
    //Start the driver
    @BeforeMethod
     public void setStart(){
        DriverManager.init();
    }
    @AfterMethod
    private void down(){
        DriverManager.close();
    }
}
