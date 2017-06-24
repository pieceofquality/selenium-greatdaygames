package com.selenium.template.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by piece on 6/24/2017.
 */
public class NavigationHelper extends HelperBase {
    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void profilePage() {
        click(By.id("tab_PersonProfile"));
    }
}
