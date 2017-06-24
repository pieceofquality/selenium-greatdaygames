package com.selenium.template.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.selenium.template.model.ProfileData;
import org.openqa.selenium.WebElement;


public class ProfileHelper extends HelperBase {

    public ProfileHelper(WebDriver wd){

        super(wd);
    }

    public void initBasicEdit(){
        WebElement element = wd.findElement(By.linkText("My Basic Information"));
        element.findElement(By.linkText("Edit")).click();
    }

    public void fillMethod(ProfileData profileData){
        type(By.cssSelector("locator"), profileData.getTo());
        type(By.cssSelector("locator"), profileData.getSubject());
    }

    public void submitMethod() {
        click(By.cssSelector("locator"));
    }

    public void confirmMethod() {
        click(By.cssSelector("locator"));
    }
}
