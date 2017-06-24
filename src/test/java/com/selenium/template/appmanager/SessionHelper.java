package com.selenium.template.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    //Authorization method
    public void login(String username, String password) {
        click(By.cssSelector(".LB_sign_in.colr .colr"));
        type(By.id("popupLogin$email"), username);
        type(By.id("popupLogin$password"), password);
        click(By.cssSelector("input[value='login']"));
    }
}
