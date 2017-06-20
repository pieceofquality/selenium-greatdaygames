package com.selenium.template.tests;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import com.selenium.template.model.SomeData;

public class SomeTests extends TestBase {


    Logger logger = LoggerFactory.getLogger(SomeTests.class);

    @Test
    public void testSomething(){
        System.out.println(app.getSomeHelper().findElement(By.cssSelector("h1")).getText());
//        app.getSomeHelper().initMethod();
//        app.getSomeHelper().fillMethod(new SomeData("example@mail.com", "test"));
//        app.getSomeHelper().submitMethod();
//        app.getSomeHelper().confirmMethod();
    }
}
