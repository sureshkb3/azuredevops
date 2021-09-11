package com.azure.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestControllerTest {

   private TestController testController = new TestController();

   @Test
    void testController(){
        String s = testController.testAzureDevOpsPipeline();
        assertTrue(s.contains("Hello"));
    }
}
