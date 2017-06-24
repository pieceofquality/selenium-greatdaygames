package com.selenium.template.tests;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class ProfileTests extends TestBase {


    Logger logger = LoggerFactory.getLogger(ProfileTests.class);

    @Test
    public void testProfile(){
        app.goTo().profilePage();
        app.profile().initBasicEdit();
//        app.profile().fillMethod(new ProfileData("example@mail.com", "test"));
//        app.profile().submitMethod();
//        app.profile().confirmMethod();
    }
}
