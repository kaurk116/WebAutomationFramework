package com.thetestingacademy.Divers;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverManager {
    public static WebDriver driver;  //add getter setter

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public  static void init(){
        if(driver == null){
            EdgeOptions edgeOptions =new EdgeOptions();
            edgeOptions.addArguments("--guest");
            edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
             driver =new EdgeDriver(edgeOptions);
        }
    }
    public static  void close(){
        if(driver!= null);
        driver.quit();
        driver = null;

    }
}
