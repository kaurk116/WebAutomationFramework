package com.thetestingacademy.Pages.PageObjectModel;

import com.thetestingacademy.Base.CommonToAllPages2;
import com.thetestingacademy.Utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class LoginPagePOM2 extends CommonToAllPages2 {
    WebDriver driver;
    public LoginPagePOM2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Locator
    @FindBy(id = "login-username")
    private static WebElement username;

    @FindBy(id = "login-password")
    private static WebElement password;

    @FindBy(id = "js-login-btn")
    private static WebElement button;

   @FindBy(className = "page-sub-title")
    private  static  WebElement sucess_msg;

    //Action
     public String LoginAction() throws FileNotFoundException {
         /*userName.sendKeys("admin@admin.com");
         password.sendKeys("12341234a");
         signButton.click();*/

             enterInput(username, PropertyReader.readKey("Valid_Username"));
             enterInput(password, PropertyReader.readKey("ValidPassword"));
             ElementClick(button);
         try {
             Thread.sleep(30000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

            WebElement sucessMsg = getElement(sucess_msg, PropertyReader.readKey("SucessMsg"));
              String text = sucessMsg.getText();
              return sucess_msg.getText();
     }

     }

