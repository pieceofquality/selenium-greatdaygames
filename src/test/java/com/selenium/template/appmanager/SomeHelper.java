package com.selenium.template.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.selenium.template.model.SomeData;


public class SomeHelper extends HelperBase {

    public SomeHelper(WebDriver wd){

        super(wd);
    }

    public void initMethod(){
        click(By.linkText("Link text"));
    }

    public void fillMethod(SomeData someData){
        type(By.cssSelector("locator"), someData.getTo());
        type(By.cssSelector("locator"), someData.getSubject());
    }

    public void submitMethod() {
        click(By.cssSelector("locator"));
    }

    public void confirmMethod() {
        click(By.cssSelector("locator"));
    }
}
