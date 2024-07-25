package com.thetestingacademy.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class vwoLogin {
    WebDriver drive = new EdgeDriver();
    @Test
    public void vwoLogins()
    {
        drive.get("www.google.com");
    }
    }
