package com.selenium.template.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import com.selenium.template.model.SomeData;

public class SomeTests extends TestBase {


    Logger logger = LoggerFactory.getLogger(SomeTests.class);

    @Test
    public void testSomething(){
        logger.info("start test testSomething");
        app.getSomeHelper().initMethod();
        app.getSomeHelper().fillMethod(new SomeData("example@mail.com", "test"));
        app.getSomeHelper().submitMethod();
        app.getSomeHelper().confirmMethod();
        logger.info("stop test testSomething");
    }
}
