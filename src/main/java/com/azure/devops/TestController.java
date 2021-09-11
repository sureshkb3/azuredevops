package com.azure.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/azure")
    public String testAzureDevOpsPipeline(){
        return "Hello, Am running on "+ System.getProperty("hostname");
    }
}
