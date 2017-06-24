package com.selenium.template.tests;

import com.selenium.template.model.ProfileData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class GameTests extends TestBase {

    Logger logger = LoggerFactory.getLogger(ProfileTests.class);

    @Test
    public void testComment(){
        app.profile().initBasicEdit();
        app.profile().fillMethod(new ProfileData("example@mail.com", "test"));
        app.profile().submitMethod();
        app.profile().confirmMethod();
    }
}
