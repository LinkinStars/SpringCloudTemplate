package com.linkinstars.providers.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 * @author LinkinStar
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${server.port}")
    String port;

    @Value("${test-url}")
    String testUrl;

    @RequestMapping("/test")
    public String hello() {
        return "Now, the port is " + port + "      The test url is " + testUrl;
    }

}
